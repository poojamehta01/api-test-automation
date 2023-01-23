package tests;

import static constants.TokenRequestConstants.ADDRESS_DEFAULT;
import static constants.TokenRequestConstants.CHAIN_ID_DEFAULT;
import static constants.TokenRequestConstants.CURSOR_DEFAULT;
import static constants.TokenRequestConstants.LIMIT_DEFAULT;

import helpers.TokensCommonHelper;
import helpers.TokensQueryVariablePositiveDataHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenRequests.Filter;
import pojo.TokenRequests.Input;
import pojo.TokenResponse;
import utilities.APIService;

@Epic("Get Token Positive testcases")
@Feature("Get Token based on input query variables")
public class GetTokensByQueryVariablesPositiveTest {

  private static Input input;
  private static Filter filter;

  private static final Logger log =
      LogManager.getLogger(tests.GetTokensByQueryVariablesPositiveTest.class.getName());

  @Test(
      description = "Get token by chainId valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokensByChainIdTest(String chainId) {
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
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertEquals(response.data.tokens.tokens.get(0).getChainId(), chainId);
  }

  @Test(
      description = "Get token by type valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenByTypeTest(String type) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type(type)
            .name("")
            .symbol("")
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertEquals(response.data.tokens.tokens.get(0).getType(), type);
  }

  @Test(
      description = "Get token by name valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenByNameTest(String name) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type("")
            .name(name)
            .symbol("")
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertEquals(response.data.tokens.tokens.get(0).getName(), name);
  }

  @Test(
      description = "Get token by symbol valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenBySymbolTest(String symbol) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type("")
            .name("")
            .symbol(symbol)
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertEquals(response.data.tokens.tokens.get(0).getSymbol(), symbol);
  }

  @Test(
      description = "Get token by address valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenByAddressTest(String address) {
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
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertEquals(response.data.tokens.tokens.get(0).getAddress(), address);
  }

  @Test(
      description = "Get token by limit valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenByLimitTest(int limit) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type("")
            .name("")
            .symbol("")
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(limit).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertAll();
  }

  @Test(
      description = "Get token by cursor valid input",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokensQueryVariablePositiveDataHelper.class)
  public void getTokenByCursorTest(String cursor) {
    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .type("")
            .name("")
            .symbol("")
            .address(ADDRESS_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(cursor).limit(LIMIT_DEFAULT).build();

    Response res =
        APIService.sendAPIRequest(TokensCommonHelper.getTokensByQueryVariable(input), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    softAssert.assertAll();
  }
}
