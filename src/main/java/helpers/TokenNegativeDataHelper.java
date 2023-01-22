package helpers;

import static constants.TokenResponseConstants.CHAINID_INCORRECT;
import static constants.TokenResponseConstants.ID_INCORRECT;
import static constants.TokenResponseConstants.INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_CHAINID_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_ID_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_INT;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_STRING;
import static io.restassured.http.Method.DELETE;
import static io.restassured.http.Method.GET;
import static io.restassured.http.Method.PATCH;
import static io.restassured.http.Method.POST;
import static io.restassured.http.Method.PUT;

import io.restassured.http.ContentType;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokenNegativeDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByIncorrectParamTest":
        return new Object[][] {
          {ID_INCORRECT, GET_TOKEN_QUERY_INVALID_ID_FIELD_NAME},
          {CHAINID_INCORRECT, GET_TOKEN_QUERY_INVALID_CHAINID_FIELD_NAME},
          {"test", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_NAME},
          {"123", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_INT},
            {"\"id\"", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_STRING}

        };

      case "getTokensByIncorrectContentType":
        return new Object[][] {
            {ContentType.HTML},
            {ContentType.XML},
            {ContentType.TEXT}
        };
      default:
        return new Object[][] {};
    }
  }
}
