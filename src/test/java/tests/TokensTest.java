package tests;

import enums.TokenEnum;
import helpers.TokensHelper;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.TokenResponse;
import pojo.TokenResponse.Token;
import utilities.APIService;

@Epic("Get Token")
@Feature("Get Token based on input parameters")
public class TokensTest {

  private static final Logger log = LogManager.getLogger(TokensTest.class.getName());

  @DataProvider
  public Object[][] getTokenTestOneParam() {
    return new Object[][] {
      {TokenEnum.id},
      {TokenEnum.chainId},
      {TokenEnum.name},
      {TokenEnum.symbol},
      {TokenEnum.type},
      {TokenEnum.totalSupply},
      {TokenEnum.decimals},
      {TokenEnum.baseURI},
      {TokenEnum.lastTransferTimestamp},
      {TokenEnum.lastTransferBlock},
      {TokenEnum.lastTransferHash},
      {TokenEnum.currentHolderCount},
      {TokenEnum.transferCount},
      {TokenEnum.tokenTraits},
      {TokenEnum.tokenBalance}
    };
  }

  @Test(description = "Single parameter", dataProvider = "getTokenTestOneParam")
  public void getTokenTestOneParam(TokenEnum tokenEnum1) {
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

    softAssert.assertAll();
  }
}
