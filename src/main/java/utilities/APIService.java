package utilities;

import static io.restassured.RestAssured.given;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.TokenRequests;

public class APIService {
  static String baseURI = "https://devapi.airstack.xyz/gql";

  public static Response sendAPIRequest(TokenRequests tokenRequests) {

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
            .statusCode(200)
            .and()
            .contentType(ContentType.JSON)
            .extract()
            .response()
            .prettyPeek();

    return response;
  }
}
