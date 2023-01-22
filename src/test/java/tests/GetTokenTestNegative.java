package tests;

import static constants.TokenResponseConstants.INCORRECT_CONTENT_TYPE_ERROR_MSG;
import static constants.TokenResponseConstants.INCORRECT_CONTENT_TYPE_ERROR_STATUS_LINE;
import static constants.TokenResponseConstants.INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE;
import static constants.TokenResponseConstants.baseURI;
import static io.restassured.RestAssured.given;

import enums.TokenErrorResponseEnums;
import helpers.TokenNegativeDataHelper;
import helpers.TokensHelper;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenErrorResponse;
import pojo.TokenErrorResponse.Error;
import pojo.TokenRequests;
import utilities.APIService;


public class GetTokenTestNegative {
  private static final Logger log = LogManager.getLogger(GetTokensTestPositive.class.getName());

  @Test(
      description = "No parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenNegativeDataHelper.class)
  public void getTokensByIncorrectParamTest(
      String tokenEnum1, TokenErrorResponseEnums tokenErrorResponseEnums) {
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens(tokenEnum1), 422);
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
      dataProviderClass = TokenNegativeDataHelper.class)
  public void getTokensByIncorrectHttpMethod(TokenErrorResponseEnums tokenErrorResponseEnums) {
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
    softAssert.assertEquals(response.getStatusLine(),INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE);
    softAssert.assertAll();
  }

  @Test(
      description = "InCorrect Content Type",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenNegativeDataHelper.class)
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
    softAssert.assertEquals(response.getStatusLine(),INCORRECT_CONTENT_TYPE_ERROR_STATUS_LINE);
    softAssert.assertEquals(errorResponse.errors.get(0).getMessage(),INCORRECT_CONTENT_TYPE_ERROR_MSG);
    softAssert.assertAll();
  }

}
