package tests;

import enums.TokenEnum;
import helpers.TokenPositiveDataHelper;
import helpers.TokensQueryParamHelper;
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

@Epic("Get Token")
@Feature("Get Token based on input query parameters")
public class GetTokensByQueryParamsTestPositive {
  private static final Logger log =
      LogManager.getLogger(GetTokensByQueryParamsTestPositive.class.getName());
  private List<TokenEnum> tokenEnumList = new ArrayList<>();

  @Test(
      description = "Single query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByOneParamTest(TokenEnum tokenEnum1) {
    Response res =
        APIService.sendAPIRequest(TokensQueryParamHelper.getTokens(tokenEnum1.getValue()), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token : new TokenEnum[] {tokenEnum1}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Two query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByTwoParamsTest(TokenEnum tokenEnum1, TokenEnum tokenEnum2) {
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens((tokenEnum1.getValue() + tokenEnum2.getValue())), 200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token : new TokenEnum[] {tokenEnum1, tokenEnum2}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Three query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByThreeParamsTest(
      TokenEnum tokenEnum1, TokenEnum tokenEnum2, TokenEnum tokenEnum3) {
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue() + tokenEnum2.getValue() + tokenEnum3.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token : new TokenEnum[] {tokenEnum1, tokenEnum2, tokenEnum3}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Four query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFourParamsTest(
      TokenEnum tokenEnum1, TokenEnum tokenEnum2, TokenEnum tokenEnum3, TokenEnum tokenEnum4) {
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue())),
            200);
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token : new TokenEnum[] {tokenEnum1, tokenEnum2, tokenEnum3, tokenEnum4}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Five query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensByFiveParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5) {

    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {tokenEnum1, tokenEnum2, tokenEnum3, tokenEnum4, tokenEnum5}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Six query parameters",
      dataProvider = "token_dataProvider",
      dataProviderClass = TokenPositiveDataHelper.class)
  public void getTokensBySixParamsTest(
      TokenEnum tokenEnum1,
      TokenEnum tokenEnum2,
      TokenEnum tokenEnum3,
      TokenEnum tokenEnum4,
      TokenEnum tokenEnum5,
      TokenEnum tokenEnum6) {
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {tokenEnum1, tokenEnum2, tokenEnum3, tokenEnum4, tokenEnum5, tokenEnum6}) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Seven query parameters",
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

    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue()
                    + tokenEnum7.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1, tokenEnum2, tokenEnum3, tokenEnum4, tokenEnum5, tokenEnum6, tokenEnum7
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Eight query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue()
                    + tokenEnum7.getValue()
                    + tokenEnum8.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Nine query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue()
                    + tokenEnum7.getValue()
                    + tokenEnum8.getValue()
                    + tokenEnum9.getValue())),
            200);
    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Ten query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue()
                    + tokenEnum7.getValue()
                    + tokenEnum8.getValue()
                    + tokenEnum9.getValue()
                    + tokenEnum10.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Eleven query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
                    + tokenEnum2.getValue()
                    + tokenEnum3.getValue()
                    + tokenEnum4.getValue()
                    + tokenEnum5.getValue()
                    + tokenEnum6.getValue()
                    + tokenEnum7.getValue()
                    + tokenEnum8.getValue()
                    + tokenEnum9.getValue()
                    + tokenEnum10.getValue()
                    + tokenEnum11.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10,
          tokenEnum11
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Twelve query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
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
                    + tokenEnum12.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10,
          tokenEnum11,
          tokenEnum12
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Thirteen query parameters",
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
    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
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
                    + tokenEnum13.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10,
          tokenEnum11,
          tokenEnum12,
          tokenEnum13
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Fourteen query parameters",
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

    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
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
                    + tokenEnum14.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10,
          tokenEnum11,
          tokenEnum12,
          tokenEnum13,
          tokenEnum14
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }

  @Test(
      description = "Fifteen query parameters",
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

    Response res =
        APIService.sendAPIRequest(
            TokensQueryParamHelper.getTokens(
                (tokenEnum1.getValue()
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
                    + tokenEnum15.getValue())),
            200);

    log.info("The status code is: " + res.getStatusCode());
    TokenResponse response = res.as(TokenResponse.class);
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertNotNull(response.getData());
    softAssert.assertNotNull(response.data.getTokens());
    for (TokenEnum token :
        new TokenEnum[] {
          tokenEnum1,
          tokenEnum2,
          tokenEnum3,
          tokenEnum4,
          tokenEnum5,
          tokenEnum6,
          tokenEnum7,
          tokenEnum8,
          tokenEnum9,
          tokenEnum10,
          tokenEnum11,
          tokenEnum12,
          tokenEnum13,
          tokenEnum14,
          tokenEnum15
        }) {
      tokenEnumList.add(token);
    }
    for (Token field : response.getData().getTokens().getTokens()) {
      for (TokenEnum list : tokenEnumList) {
        TokensQueryParamHelper.assertToken(field, list);
      }
    }
    softAssert.assertAll();
  }
}
