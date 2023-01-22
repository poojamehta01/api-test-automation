package tests;

import static constants.TokenResponseConstanta.ID;

import enums.TokenEnum;
import helpers.TokenPositiveDataHelper;
import helpers.TokensHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenResponse;
import pojo.TokenResponse.Token;
import utilities.APIService;

@Epic("Get Token")
@Feature("Get Token based on input parameters")
public class GetTokensTestPositive {
  private static final Logger log = LogManager.getLogger(GetTokensTestPositive.class.getName());

  @Test(
      description = "Single parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByOneParamTest(TokenEnum tokenEnum1) {
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens(tokenEnum1.getValue()));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      softAssert.assertAll();
    }
  }

  @Test(
      description = "Two parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByTwoParamsTest(TokenEnum tokenEnum1, TokenEnum tokenEnum2) {
    String tokenEnumNew = tokenEnum1.getValue() + tokenEnum2.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Three parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByThreeParamsTest(
      TokenEnum tokenEnum1, TokenEnum tokenEnum2, TokenEnum tokenEnum3) {
    String tokenEnumNew = tokenEnum1.getValue() + tokenEnum2.getValue() + tokenEnum3.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Four parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFourParamsTest(
      TokenEnum tokenEnum1, TokenEnum tokenEnum2, TokenEnum tokenEnum3, TokenEnum tokenEnum4) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Five parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFiveParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Six parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensBySixParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Seven parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensBySevenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Eight parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByEightParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Nine parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByNineParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Ten parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByTenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Eleven parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByElevenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10,
      TokenEnum tokenEnum11) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue()
            + tokenEnum11.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
      TokensHelper.assertToken(field, tokenEnum11);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Twelve parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByTwelveParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10,
      TokenEnum tokenEnum11,
      TokenEnum tokenEnum12) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue()
            + tokenEnum11.getValue()
            + tokenEnum12.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
      TokensHelper.assertToken(field, tokenEnum11);
      TokensHelper.assertToken(field, tokenEnum12);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Thirteen parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByThirteenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10,
      TokenEnum tokenEnum11,
      TokenEnum tokenEnum12,
      TokenEnum tokenEnum13) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue()
            + tokenEnum11.getValue()
            + tokenEnum12.getValue()
            + tokenEnum13.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
      TokensHelper.assertToken(field, tokenEnum11);
      TokensHelper.assertToken(field, tokenEnum12);
      TokensHelper.assertToken(field, tokenEnum13);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Fourteen parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFourteenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10,
      TokenEnum tokenEnum11,
      TokenEnum tokenEnum12,
      TokenEnum tokenEnum13,
      TokenEnum tokenEnum14) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue()
            + tokenEnum11.getValue()
            + tokenEnum12.getValue()
            + tokenEnum13.getValue()
            + tokenEnum14.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
      TokensHelper.assertToken(field, tokenEnum11);
      TokensHelper.assertToken(field, tokenEnum12);
      TokensHelper.assertToken(field, tokenEnum13);
      TokensHelper.assertToken(field, tokenEnum14);
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Fifteen parameter",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFifteenParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6,
      TokenEnum tokenEnum7,
      TokenEnum tokenEnum8,
      TokenEnum tokenEnum9,
      TokenEnum tokenEnum10,
      TokenEnum tokenEnum11,
      TokenEnum tokenEnum12,
      TokenEnum tokenEnum13,
      TokenEnum tokenEnum14,
      TokenEnum tokenEnum15) {
    String tokenEnumNew =
        tokenEnum1.getValue()
            + tokenEnum2.getValue()
            + tokenEnum3.getValue()
            + tokenEnum4.getValue()
            + tokenEnum5.getValue()
            + tokenEnum6.getValue()
            + tokenEnum7.getValue()
            + tokenEnum8.getValue()
            + tokenEnum9.getValue()
            + tokenEnum10.getValue()
            + tokenEnum11.getValue()
            + tokenEnum12.getValue()
            + tokenEnum13.getValue()
            + tokenEnum14.getValue()
            + tokenEnum15.getValue();
    Response res = APIService.sendAPIRequest(TokensHelper.getTokens((tokenEnumNew)));

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    System.out.println("list of tokens" + response.getData().getTokens().getTokens());
    for (Token field : response.getData().getTokens().getTokens()) {
      TokensHelper.assertToken(field, tokenEnum1);
      TokensHelper.assertToken(field, tokenEnum2);
      TokensHelper.assertToken(field, tokenEnum3);
      TokensHelper.assertToken(field, tokenEnum4);
      TokensHelper.assertToken(field, tokenEnum5);
      TokensHelper.assertToken(field, tokenEnum6);
      TokensHelper.assertToken(field, tokenEnum7);
      TokensHelper.assertToken(field, tokenEnum8);
      TokensHelper.assertToken(field, tokenEnum9);
      TokensHelper.assertToken(field, tokenEnum10);
      TokensHelper.assertToken(field, tokenEnum11);
      TokensHelper.assertToken(field, tokenEnum12);
      TokensHelper.assertToken(field, tokenEnum13);
      TokensHelper.assertToken(field, tokenEnum14);
      TokensHelper.assertToken(field, tokenEnum15);
      TokensHelper.assertTokenFieldValues(field);
    }
    softAssert.assertAll();
  }
}
