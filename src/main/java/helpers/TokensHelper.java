package helpers;

import static constants.TokenResponseConstanta.BASEURI;
import static constants.TokenResponseConstanta.CHAINID;
import static constants.TokenResponseConstanta.CURRENTACCOUNTHOLD;
import static constants.TokenResponseConstanta.DECIMALS;
import static constants.TokenResponseConstanta.ID;
import static constants.TokenResponseConstanta.LASTRANSFERTIMESTAMP;
import static constants.TokenResponseConstanta.LASTTRANSFERBLOCK;
import static constants.TokenResponseConstanta.LASTTRANSFERHASH;
import static constants.TokenResponseConstanta.NAME;
import static constants.TokenResponseConstanta.SYMBOL;
import static constants.TokenResponseConstanta.TOKENBALANCE;
import static constants.TokenResponseConstanta.TOKENTRAITS;
import static constants.TokenResponseConstanta.TOTALSUPPLY;
import static constants.TokenResponseConstanta.TRANSFERCOUNT;
import static constants.TokenResponseConstanta.TYPE;

import enums.TokenEnum;
import org.testng.asserts.SoftAssert;
import pojo.TokenRequests;
import pojo.TokenRequests.Filter;
import pojo.TokenRequests.Input;
import pojo.TokenRequests.QueryVariables;
import pojo.TokenResponse.Token;

public class TokensHelper {

  private static TokenRequests tokenRequests;
  private static QueryVariables queryVariables;
  private static Input input;
  private static Filter filter;

  public static TokenRequests getTokens(String tokenEnum) {
    filter = Filter.builder().chainId("1").build();

    input = Input.builder().filter(filter).cursor("").limit(1).build();
    queryVariables = QueryVariables.builder().input(input).build();
    String query =
        "query Test1($input: TokensInput!) {\n"
            + "   Tokens(input: $input) {\n"
            + "     tokens { {TOKEN}\n".replace("{TOKEN}", tokenEnum)
            + "   }\n"
            + "   pageInfo {\n"
            + "     prevCursor\n"
            + "     nextCursor\n"
            + "   }\n"
            + "  }\n"
            + " }";

    tokenRequests = TokenRequests.builder().query(query).variables(queryVariables).build();
    System.out.println(tokenRequests);

    return tokenRequests;
  }

  public static void assertToken(Token field, TokenEnum tokenEnumParam) {
    SoftAssert softAssert = new SoftAssert();
    switch (tokenEnumParam) {
      case id:
        softAssert.assertNotNull(field.getId());

        break;
      case chainId:
        softAssert.assertNotNull(field.getChainId());
        break;
      case name:
        softAssert.assertNotNull(field.getName());
        break;
      case symbol:
        softAssert.assertNotNull(field.getSymbol());
        break;
      case type:
        softAssert.assertNotNull(field.getType());
        break;
      case totalSupply:
        softAssert.assertNotNull(field.getTotalSupply());
        break;
      case decimals:
        softAssert.assertNotNull(field.getDecimals());
        break;
      case baseURI:
        softAssert.assertNotNull(field.getBaseURI());
        break;
      case lastTransferTimestamp:
        softAssert.assertNotNull(field.getLastTransferTimestamp());
        String.valueOf(field.getLastTransferTimestamp());
        break;
      case lastTransferBlock:
        softAssert.assertNotNull(field.getLastTransferBlock());
        break;
      case lastTransferHash:
        softAssert.assertNotNull(field.getLastTransferHash());
        break;
      case currentHolderCount:
        softAssert.assertNotNull(field.getCurrentHolderCount());
        break;
      case transferCount:
        softAssert.assertNotNull(field.getTransferCount());
        break;
      case tokenTraits:
        softAssert.assertNull(field.getTokenTraits());
        break;
      case tokenBalance:
        softAssert.assertNull(field.getTokenBalance());
        break;
    }
  }

  public static void assertTokenFieldValues(Token field){
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(field.getId(),ID);
    softAssert.assertEquals(field.getChainId(),CHAINID);
    softAssert.assertEquals(field.getName(),NAME);
    softAssert.assertEquals(field.getSymbol(),SYMBOL);
    softAssert.assertEquals(field.getType(),TYPE);
    softAssert.assertEquals(field.getTotalSupply(),TOTALSUPPLY);
    softAssert.assertEquals(field.getDecimals(),DECIMALS);
    softAssert.assertEquals(field.getBaseURI(),BASEURI);
    softAssert.assertEquals(field.getLastTransferTimestamp(),LASTRANSFERTIMESTAMP);
    softAssert.assertEquals(field.getLastTransferBlock(),LASTTRANSFERBLOCK);
    softAssert.assertEquals(field.getLastTransferHash(),LASTTRANSFERHASH);
    softAssert.assertEquals(field.getCurrentHolderCount(),CURRENTACCOUNTHOLD);
    softAssert.assertEquals(field.getTransferCount(),TRANSFERCOUNT);
    softAssert.assertEquals(field.getTokenTraits(),TOKENTRAITS);
    softAssert.assertEquals(field.getTokenBalance(),TOKENBALANCE);




  }
}
