package tests;

import enums.TokenQueryParamEnum;
import helpers.TokenQueryParamPositiveDataHelper;
import helpers.TokensCommonHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenResponse;
import pojo.TokenResponse.Token;
import utilities.APIService;

@Epic("Get Token Positive testcases")
@Feature("Get Token based on valid input query parameters")
public class GetTokensByQueryParamsPositiveTest {
  private static final Logger log =
      LogManager.getLogger(GetTokensByQueryParamsPositiveTest.class.getName());
  private List<TokenQueryParamEnum> tokenQueryParamEnumList = new ArrayList<>();

  @Test(
      description = "Single query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByOneParamTest(TokenQueryParamEnum tokenQueryParamEnum1) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(tokenQueryParamEnum1.getValue()), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token : new TokenQueryParamEnum[] {tokenQueryParamEnum1}) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Two query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByTwoParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1, TokenQueryParamEnum tokenQueryParamEnum2) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue() + tokenQueryParamEnum2.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {tokenQueryParamEnum1, tokenQueryParamEnum2}) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Three query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByThreeParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1, tokenQueryParamEnum2, tokenQueryParamEnum3
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
  }

  @Test(
      description = "Four query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByFourParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue())),
            200);
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1, tokenQueryParamEnum2, tokenQueryParamEnum3, tokenQueryParamEnum4
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Five query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByFiveParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5) {

    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Six query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensBySixParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Seven query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensBySevenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7) {

    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Eight query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByEightParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Nine query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByNineParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Ten query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByTenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Eleven query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByElevenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Twelve query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByTwelveParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11,
      TokenQueryParamEnum tokenQueryParamEnum12) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue()
                    + tokenQueryParamEnum12.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11,
          tokenQueryParamEnum12
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Thirteen query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByThirteenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11,
      TokenQueryParamEnum tokenQueryParamEnum12,
      TokenQueryParamEnum tokenQueryParamEnum13) {
    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue()
                    + tokenQueryParamEnum12.getValue()
                    + tokenQueryParamEnum13.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11,
          tokenQueryParamEnum12,
          tokenQueryParamEnum13
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Fourteen query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByFourteenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11,
      TokenQueryParamEnum tokenQueryParamEnum12,
      TokenQueryParamEnum tokenQueryParamEnum13,
      TokenQueryParamEnum tokenQueryParamEnum14) {

    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue()
                    + tokenQueryParamEnum12.getValue()
                    + tokenQueryParamEnum13.getValue()
                    + tokenQueryParamEnum14.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11,
          tokenQueryParamEnum12,
          tokenQueryParamEnum13,
          tokenQueryParamEnum14
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Fifteen query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensByFifteenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11,
      TokenQueryParamEnum tokenQueryParamEnum12,
      TokenQueryParamEnum tokenQueryParamEnum13,
      TokenQueryParamEnum tokenQueryParamEnum14,
      TokenQueryParamEnum tokenQueryParamEnum15) {

    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue()
                    + tokenQueryParamEnum12.getValue()
                    + tokenQueryParamEnum13.getValue()
                    + tokenQueryParamEnum14.getValue()
                    + tokenQueryParamEnum15.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11,
          tokenQueryParamEnum12,
          tokenQueryParamEnum13,
          tokenQueryParamEnum14,
          tokenQueryParamEnum15
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
      TokensCommonHelper.assertTokenFieldValues(field);
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }

  @Test(
      description = "Sixteen query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenQueryParamPositiveDataHelper.class)
  public void getTokensBySixteenParamsTest(
      TokenQueryParamEnum tokenQueryParamEnum1,
      TokenQueryParamEnum tokenQueryParamEnum2,
      TokenQueryParamEnum tokenQueryParamEnum3,
      TokenQueryParamEnum tokenQueryParamEnum4,
      TokenQueryParamEnum tokenQueryParamEnum5,
      TokenQueryParamEnum tokenQueryParamEnum6,
      TokenQueryParamEnum tokenQueryParamEnum7,
      TokenQueryParamEnum tokenQueryParamEnum8,
      TokenQueryParamEnum tokenQueryParamEnum9,
      TokenQueryParamEnum tokenQueryParamEnum10,
      TokenQueryParamEnum tokenQueryParamEnum11,
      TokenQueryParamEnum tokenQueryParamEnum12,
      TokenQueryParamEnum tokenQueryParamEnum13,
      TokenQueryParamEnum tokenQueryParamEnum14,
      TokenQueryParamEnum tokenQueryParamEnum15,
      TokenQueryParamEnum tokenQueryParamEnum16) {

    Response res =
        APIService.sendAPIRequest(
            TokensCommonHelper.getTokensByQueryParam(
                (tokenQueryParamEnum1.getValue()
                    + tokenQueryParamEnum2.getValue()
                    + tokenQueryParamEnum3.getValue()
                    + tokenQueryParamEnum4.getValue()
                    + tokenQueryParamEnum5.getValue()
                    + tokenQueryParamEnum6.getValue()
                    + tokenQueryParamEnum7.getValue()
                    + tokenQueryParamEnum8.getValue()
                    + tokenQueryParamEnum9.getValue()
                    + tokenQueryParamEnum10.getValue()
                    + tokenQueryParamEnum11.getValue()
                    + tokenQueryParamEnum12.getValue()
                    + tokenQueryParamEnum13.getValue()
                    + tokenQueryParamEnum14.getValue()
                    + tokenQueryParamEnum15.getValue()
                    + tokenQueryParamEnum16.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenQueryParamEnum token :
        new TokenQueryParamEnum[] {
          tokenQueryParamEnum1,
          tokenQueryParamEnum2,
          tokenQueryParamEnum3,
          tokenQueryParamEnum4,
          tokenQueryParamEnum5,
          tokenQueryParamEnum6,
          tokenQueryParamEnum7,
          tokenQueryParamEnum8,
          tokenQueryParamEnum9,
          tokenQueryParamEnum10,
          tokenQueryParamEnum11,
          tokenQueryParamEnum12,
          tokenQueryParamEnum13,
          tokenQueryParamEnum14,
          tokenQueryParamEnum15,
          tokenQueryParamEnum16
        }) {
      tokenQueryParamEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenQueryParamEnum list : tokenQueryParamEnumList) {
        TokensCommonHelper.assertToken(field, list);
      }
      TokensCommonHelper.assertTokenFieldValues(field);
    }
    tokenQueryParamEnumList.removeAll(tokenQueryParamEnumList);
    softAssert.assertAll();
  }
}
