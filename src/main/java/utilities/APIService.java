package utilities;

import static constants.TokenResponseConstants.baseURI;
import static io.restassured.RestAssured.given;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.TokenRequests;

public class APIService {

  public static Response sendAPIRequest(TokenRequests tokenRequests, int statusCode) {

    Response response =
        given()
            .log()
            .all()
            .contentType(ContentType.JSON)
            .filter(new AllureRestAssured())
            .body(tokenRequests)
            .post(baseURI)
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(statusCode)
            .and()
            .contentType(ContentType.JSON)
            .extract()
            .response()
            .prettyPeek();

    return response;
  }
}
