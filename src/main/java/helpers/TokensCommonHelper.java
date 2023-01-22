package helpers;

import static constants.TokenRequestConstants.ADDRESS_DEFAULT;
import static constants.TokenRequestConstants.CHAIN_ID_DEFAULT;
import static constants.TokenRequestConstants.CURSOR_DEFAULT;
import static constants.TokenRequestConstants.LIMIT_DEFAULT;
import static constants.TokenRequestConstants.NAME_DEFAULT;
import static constants.TokenRequestConstants.SYMBOL_DEFAULT;
import static constants.TokenRequestConstants.TYPE_DEFAULT;
import static constants.TokenResponseConstants.ADDRESS;
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
import static constants.TokenResponseConstants.TOTALSUPPLY;
import static constants.TokenResponseConstants.TRANSFERCOUNT;
import static constants.TokenResponseConstants.TYPE;
import static enums.TokenQueryParamEnum.ADDRESS_ENUM;
import static enums.TokenQueryParamEnum.BASE_URI_ENUM;
import static enums.TokenQueryParamEnum.CHAIN_ID_ENUM;
import static enums.TokenQueryParamEnum.CURRENT_HOLDER_COUNT_ENUM;
import static enums.TokenQueryParamEnum.ID_ENUM;
import static enums.TokenQueryParamEnum.LAST_TRANSFER_BLOCK_ENUM;
import static enums.TokenQueryParamEnum.LAST_TRANSFER_HASH_ENUM;
import static enums.TokenQueryParamEnum.LAST_TRANSFER_TIMESTAMP_ENUM;
import static enums.TokenQueryParamEnum.NAME_ENUM;
import static enums.TokenQueryParamEnum.SYMBOL_ENUM;
import static enums.TokenQueryParamEnum.TOKEN_BALANCE_ENUM;
import static enums.TokenQueryParamEnum.TOKEN_TRAITS_ENUM;
import static enums.TokenQueryParamEnum.TOTAL_SUPPLY_ENUM;
import static enums.TokenQueryParamEnum.TRANSFER_COUNT_ENUM;
import static enums.TokenQueryParamEnum.TYPE_ENUM;

import enums.TokenQueryParamEnum;
import org.testng.asserts.SoftAssert;
import pojo.TokenRequests;
import pojo.TokenRequests.Filter;
import pojo.TokenRequests.Input;
import pojo.TokenRequests.QueryVariables;
import pojo.TokenResponse.Token;

public class TokensCommonHelper {

  private static TokenRequests tokenRequests;
  private static QueryVariables queryVariables;
  private static Input input;
  private static Filter filter;

  public static TokenRequests getTokensByQueryParam(String tokenEnum) {

    filter =
        Filter.builder()
            .chainId(CHAIN_ID_DEFAULT)
            .address(ADDRESS_DEFAULT)
            .type(TYPE_DEFAULT)
            .name(NAME_DEFAULT)
            .symbol(SYMBOL_DEFAULT)
            .build();
    input = Input.builder().filter(filter).cursor(CURSOR_DEFAULT).limit(LIMIT_DEFAULT).build();
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
    return tokenRequests;
  }

  public static TokenRequests getTokensByQueryVariable(Input input) {

    queryVariables = QueryVariables.builder().input(input).build();
    String query =
        "query Test1($input: TokensInput!) {\n"
            + "   Tokens(input: $input) {\n"
            + "     tokens {\n"
            + "       id\n"
            + "     chainId\n"
            + "      address\n"
            + "     name\n"
            + "     symbol\n"
            + "     type\n"
            + "     totalSupply\n"
            + "     decimals\n"
            + "     baseURI\n"
            + "     lastTransferTimestamp\n"
            + "     lastTransferBlock\n"
            + "     lastTransferHash\n"
            + "     currentHolderCount\n"
            + "     transferCount\n"
            + "     tokenTraits\n"
            + "     tokenBalance {\n"
            + "       tokenId\n"
            + "       owner\n"
            + "       amount\n"
            + "     }\n"
            + "   }\n"
            + "   pageInfo {\n"
            + "     prevCursor\n"
            + "     nextCursor\n"
            + "   }\n"
            + "  }\n"
            + " }\n"
            + "\n";

    tokenRequests = TokenRequests.builder().query(query).variables(queryVariables).build();
    return tokenRequests;
  }

  public static void assertToken(Token field, TokenQueryParamEnum tokenQueryParamEnum) {
    SoftAssert softAssert = new SoftAssert();

    if (ID_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getId());
    } else if (ADDRESS_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getAddress());
    } else if (CHAIN_ID_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getChainId());
    } else if (NAME_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getName());
    } else if (SYMBOL_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getSymbol());
    } else if (TYPE_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getType());
    } else if (TOTAL_SUPPLY_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getTotalSupply());
    } else if (BASE_URI_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getBaseURI());
    } else if (LAST_TRANSFER_TIMESTAMP_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getLastTransferTimestamp());
      String.valueOf(field.getLastTransferTimestamp());
    } else if (LAST_TRANSFER_BLOCK_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getLastTransferBlock());
    } else if (LAST_TRANSFER_HASH_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getLastTransferHash());
    } else if (CURRENT_HOLDER_COUNT_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getCurrentHolderCount());
    } else if (TRANSFER_COUNT_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getTransferCount());
    } else if (TOKEN_TRAITS_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNotNull(field.getTokenTraits());
    } else if (TOKEN_BALANCE_ENUM.equals(tokenQueryParamEnum)) {
      softAssert.assertNull(field.getTokenBalance());
    }
    softAssert.assertAll();
  }

  public static void assertTokenFieldValues(Token field) {
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(field.getId(), ID);
    softAssert.assertEquals(field.getAddress(), ADDRESS);
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
    softAssert.assertEquals(field.getTokenBalance(), TOKENBALANCE);
  }
}
