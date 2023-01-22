package helpers;

import static constants.TokenErrorConstants.CHAINID_ERROR_INCORRECT;
import static constants.TokenErrorConstants.ID_ERROR_INCORRECT;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_CHAINID_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_ID_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_INT;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_NAME;
import static enums.TokenErrorResponseEnums.GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_STRING;

import io.restassured.http.ContentType;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokenQueryParamNegativeDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByIncorrectParamTest":
        return new Object[][] {
          {ID_ERROR_INCORRECT, GET_TOKEN_QUERY_INVALID_ID_FIELD_NAME},
          {CHAINID_ERROR_INCORRECT, GET_TOKEN_QUERY_INVALID_CHAINID_FIELD_NAME},
          {"test", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_NAME},
          {"123", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_INT},
          {"\"id\"", GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_STRING}
        };

      case "getTokensByIncorrectContentType":
        return new Object[][] {{ContentType.HTML}, {ContentType.XML}, {ContentType.TEXT}};
      default:
        return new Object[][] {};
    }
  }
}
