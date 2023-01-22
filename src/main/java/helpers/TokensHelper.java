package helpers;

import static constants.TokenResponseConstants.BASEURI;
import static constants.TokenResponseConstants.CHAINID;
import static constants.TokenResponseConstants.CURRENTACCOUNTHOLD;
import static constants.TokenResponseConstants.DECIMALS;
import static constants.TokenResponseConstants.ID;
import static constants.TokenResponseConstants.LASTRANSFERTIMESTAMP;
import static constants.TokenResponseConstants.LASTTRANSFERBLOCK;
import static constants.TokenResponseConstants.LASTTRANSFERHASH;
import static constants.TokenResponseConstants.NAME;
import static constants.TokenResponseConstants.SYMBOL;
import static constants.TokenResponseConstants.TOKENBALANCE;
import static constants.TokenResponseConstants.TOKENTRAITS;
import static constants.TokenResponseConstants.TOTALSUPPLY;
import static constants.TokenResponseConstants.TRANSFERCOUNT;
import static constants.TokenResponseConstants.TYPE;

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
      case ID:
        softAssert.assertNotNull(field.getId());

        break;
      case CHAIN_ID:
        softAssert.assertNotNull(field.getChainId());
        break;
      case NAME:
        softAssert.assertNotNull(field.getName());
        break;
      case SYMBOL:
        softAssert.assertNotNull(field.getSymbol());
        break;
      case TYPE:
        softAssert.assertNotNull(field.getType());
        break;
      case TOTAL_SUPPLY:
        softAssert.assertNotNull(field.getTotalSupply());
        break;
      case DECIMALS:
        softAssert.assertNotNull(field.getDecimals());
        break;
      case BASE_URI:
        softAssert.assertNotNull(field.getBaseURI());
        break;
      case LAST_TRANSFER_TIMESTAMP:
        softAssert.assertNotNull(field.getLastTransferTimestamp());
        String.valueOf(field.getLastTransferTimestamp());
        break;
      case LAST_TRANSFER_BLOCK:
        softAssert.assertNotNull(field.getLastTransferBlock());
        break;
      case LAST_TRANSFER_HASH:
        softAssert.assertNotNull(field.getLastTransferHash());
        break;
      case CURRENT_HOLDER_COUNT:
        softAssert.assertNotNull(field.getCurrentHolderCount());
        break;
      case TRANSFER_COUNT:
        softAssert.assertNotNull(field.getTransferCount());
        break;
      case TOKEN_TRAITS:
        softAssert.assertNull(field.getTokenTraits());
        break;
      case TOKEN_BALANCE:
        softAssert.assertNull(field.getTokenBalance());
        break;
    }
    softAssert.assertAll();
  }

  public static void assertTokenFieldValues(Token field) {
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(field.getId(), ID);
    softAssert.assertEquals(field.getChainId(), CHAINID);
    softAssert.assertEquals(field.getName(), NAME);
    softAssert.assertEquals(field.getSymbol(), SYMBOL);
    softAssert.assertEquals(field.getType(), TYPE);
    softAssert.assertEquals(field.getTotalSupply(), TOTALSUPPLY);
    softAssert.assertEquals(field.getDecimals(), DECIMALS);
    softAssert.assertEquals(field.getBaseURI(), BASEURI);
    softAssert.assertEquals(field.getLastTransferTimestamp(), LASTRANSFERTIMESTAMP);
    softAssert.assertEquals(field.getLastTransferBlock(), LASTTRANSFERBLOCK);
    softAssert.assertEquals(field.getLastTransferHash(), LASTTRANSFERHASH);
    softAssert.assertEquals(field.getCurrentHolderCount(), CURRENTACCOUNTHOLD);
    softAssert.assertEquals(field.getTransferCount(), TRANSFERCOUNT);
    softAssert.assertEquals(field.getTokenTraits(), TOKENTRAITS);
    softAssert.assertEquals(field.getTokenBalance(), TOKENBALANCE);
  }
}
