package tests;

import static constants.TokenErrorConstants.INCORRECT_CONTENT_TYPE_ERROR_MSG;
import static constants.TokenErrorConstants.INCORRECT_CONTENT_TYPE_ERROR_STATUS_LINE;
import static constants.TokenErrorConstants.INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE;
import static constants.TokenRequestConstants.baseURI;
import static io.restassured.RestAssured.given;

import enums.TokenErrorResponseEnums;
import helpers.TokenQueryParamNegativeDataHelper;
import helpers.TokensCommonHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenErrorResponse;
import pojo.TokenErrorResponse.Error;
import utilities.APIService;

@Epic("Get Token Negative testcases")
@Feature("Get Token based on invalid input query parameters")
public class GetTokenByQueryParamsNegativeTest {
  private static final Logger log =
      LogManager.getLogger(GetTokenByQueryParamsNegativeTest.class.getName());

  @Test(
      description = "No parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamNegativeDataHelper.class)
  public void getTokensByIncorrectParamTest(
      String tokenEnum1, TokenErrorResponseEnums tokenErrorResponseEnums) {
    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryParam(tokenEnum1), 422);
    log.info("The status code is: " + res.getStatusCode());
    TokenErrorResponse response = res.as(TokenErrorResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getErrors());
    softAssert.assertEquals(response.getData(), tokenErrorResponseEnums.getData());
    softAssert.assertEquals(res.getStatusCode(), tokenErrorResponseEnums.getStatus());
    for (Error error : response.errors) {
      softAssert.assertEquals(error.getMessage(), tokenErrorResponseEnums.getMessage());
      softAssert.assertEquals(error.getExtensions().getCode(), tokenErrorResponseEnums.getCode());
    }
    softAssert.assertAll();
  }

  @Test(
      description = "InCorrect Http Method",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamNegativeDataHelper.class)
  public void getTokensByIncorrectHttpMethod() {
    Response response =
        given()
            .log()
            .all()
            .contentType(ContentType.JSON)
            .filter(new AllureRestAssured())
            .when()
            .get(baseURI)
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(404)
            .extract()
            .response()
            .prettyPeek();

    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(response.getStatusLine(), INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE);
    softAssert.assertAll();
  }

  @Test(
      description = "InCorrect Content Type",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamNegativeDataHelper.class)
  public void getTokensByIncorrectContentType(ContentType contentType) {
    Response response =
        given()
            .log()
            .all()
            .contentType(contentType)
            .filter(new AllureRestAssured())
            .when()
            .post(baseURI)
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(400)
            .extract()
            .response()
            .prettyPeek();
    TokenErrorResponse errorResponse = response.as(TokenErrorResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(response.getStatusLine(), INCORRECT_CONTENT_TYPE_ERROR_STATUS_LINE);
    softAssert.assertEquals(
        errorResponse.errors.get(0).getMessage(), INCORRECT_CONTENT_TYPE_ERROR_MSG);
    softAssert.assertAll();
  }
}
