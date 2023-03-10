package tests;

import static constants.TokenRequestConstants.ADDRESS_DEFAULT;
import static constants.TokenRequestConstants.CHAIN_ID_DEFAULT;
import static constants.TokenRequestConstants.CURSOR_DEFAULT;
import static constants.TokenRequestConstants.LIMIT_DEFAULT;
import static enums.TokenErrorResponseEnums.ADDRESS_INCORRECT;
import static enums.TokenErrorResponseEnums.CHAIN_ID_NULL;
import static enums.TokenErrorResponseEnums.CURSOR_INCORRECT;
import static enums.TokenErrorResponseEnums.LIMIT_INCORRECT;

import helpers.TokensCommonHelper;
import helpers.TokensQueryVariableNegativeDataHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenAddressErrorResponse;
import pojo.TokenErrorResponse;
import pojo.TokenErrorResponse.Error;
import pojo.TokenRequests.Filter;
import pojo.TokenRequests.Input;
import pojo.TokenResponse;
import utilities.APIService;

@Epic("Get Token Negative testcases")
@Feature("Get Token based on invalid input query variables")
public class GetTokensByQueryVariablesNegativeTest {
  private static Input input;
  private static Filter filter;

  private static final Logger log =
      LogManager.getLogger(GetTokensByQueryVariablesNegativeTest.class.getName());

  @Test(
      description = "Get token by chainId Invalid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariableNegativeDataHelper.class)
  public void getTokensByChainIdTestNegative(String chainId) {
    filter =
        Filter.builder()
            .chainId(chainId)
            .type("")
            .name("")
            .symbol("")
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenResponse response = res.as(TokenResponse.class);
    softAssert.assertNull(response.getData().getTokens().getTokens());
    softAssert.assertAll();
  }

  @Test(description = "Get token by chainId null Invalid input")
  public void getTokensByChainIdNullTestNegative() {
    filter =
        Filter.builder()
            .chainId(null)
            .type("")
            .name("")
            .symbol("")
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 422);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenErrorResponse response = res.as(TokenErrorResponse.class);
    softAssert.assertNotNull(response.getErrors());
    softAssert.assertEquals(response.getData(), CHAIN_ID_NULL.getData());
    softAssert.assertEquals(res.getStatusCode(), CHAIN_ID_NULL.getStatus());
    for (Error error : response.errors) {
      softAssert.assertEquals(error.getMessage(), CHAIN_ID_NULL.getMessage());
      softAssert.assertEquals(error.getExtensions().getCode(), CHAIN_ID_NULL.getCode());
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Get token by address Invalid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariableNegativeDataHelper.class)
  public void getTokensByAddressTestNegative(String address) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type("")
            .name("")
            .symbol("")
            .address(address)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenAddressErrorResponse response = res.as(TokenAddressErrorResponse.class);
    softAssert.assertNotNull(response.getErrors());
    softAssert.assertEquals(res.getStatusCode(), ADDRESS_INCORRECT.getStatus());
    for (TokenAddressErrorResponse.Error error : response.errors) {
      softAssert.assertEquals(error.getMessage(), ADDRESS_INCORRECT.getMessage());
      softAssert.assertEquals(error.getExtensions().getCode(), ADDRESS_INCORRECT.getCode());
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Get token by token Invalid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariableNegativeDataHelper.class)
  public void getTokensByTypeTestNegative(String type) {
    filter = Filter.builder().chainId(CHAIN_ID_DEFAULT).type(type).name("").symbol("").build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenResponse response = res.as(TokenResponse.class);
    softAssert.assertNull(response.getData().getTokens().getTokens());
    softAssert.assertAll();
  }

  @Test(
      description = "Get token by limit invalid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariableNegativeDataHelper.class)
  public void getTokensByLimitTestNegative(int limit) {
    filter = Filter.builder().chainId(CHAIN_ID_DEFAULT).type("").name("").symbol("").build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(limit).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenAddressErrorResponse response = res.as(TokenAddressErrorResponse.class);
    softAssert.assertNotNull(response.getErrors());
    softAssert.assertEquals(res.getStatusCode(), LIMIT_INCORRECT.getStatus());
    for (TokenAddressErrorResponse.Error error : response.errors) {
      softAssert.assertEquals(error.getMessage(), LIMIT_INCORRECT.getMessage());
      softAssert.assertEquals(error.getExtensions().getCode(), LIMIT_INCORRECT.getCode());
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Get token by cursor Invalid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariableNegativeDataHelper.class)
  public void getTokensByCursorTestNegative(String cursor) {
    filter = Filter.builder().chainId(CHAIN_ID_DEFAULT).type("").name("").symbol("").build();
    input = Input.builder().filter(filter).cursor(cursor).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());

    SoftAssert softAssert = new SoftAssert();
    TokenAddressErrorResponse response = res.as(TokenAddressErrorResponse.class);
    softAssert.assertNotNull(response.getErrors());
    softAssert.assertEquals(res.getStatusCode(), CURSOR_INCORRECT.getStatus());
    for (TokenAddressErrorResponse.Error error : response.errors) {
      softAssert.assertEquals(error.getMessage(), CURSOR_INCORRECT.getMessage());
      softAssert.assertEquals(error.getExtensions().getCode(), CURSOR_INCORRECT.getCode());
    }
    softAssert.assertAll();
  }
}
