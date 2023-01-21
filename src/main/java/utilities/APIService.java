package utilities;

import static io.restassured.RestAssured.given;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIService {
  static String baseURI = "https://devapi.airstack.xyz/gql";

  public static Response sendAPIRequest() {

    Response response =
        given()
            .log()
            .all()
            .contentType(ContentType.JSON)
            .filter(new AllureRestAssured())
            .body()
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
