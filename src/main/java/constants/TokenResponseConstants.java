package constants;

/***
 * This is right now used only for getTokensByFifteenParamsTest testcase,
 * later to validate if field values are as expected or not
 * they can be asserted in DataBase for all the TESTCASES
 */

public class TokenResponseConstants {

  public static final String baseURI = "https://devapi.airstack.xyz/gql";

  public static final String ID = "100000000000045166c45af0fc6e4cf31d9e14b9a";

  public static final String CHAINID = "1";

  public static final String NAME = "TopBidder";

  public static final String SYMBOL = "BID";

  public static final String TYPE = "TopBidder";

  public static final String TOTALSUPPLY = "100000000000000000000000000";

  public static final int DECIMALS = 18;

  public static final String BASEURI = "";

  public static final String LASTRANSFERTIMESTAMP = "2021-05-26T12:32:37Z";

  public static final int LASTTRANSFERBLOCK = 12509952;

  public static final String LASTTRANSFERHASH =
      "50958f748353ece0565f1655073808a4227588dc28ec955cb698d02af189a9da";
  public static final int CURRENTACCOUNTHOLD = 0;

  public static final int TRANSFERCOUNT = 6508;
  public static final String TOKENTRAITS = null;
  public static final String TOKENBALANCE = null;

  public static final String ID_INCORRECT = "id1";
  public static final String ID_CORRECT = "id";

  public static final String CHAINID_INCORRECT = "chainId1";
  public static final String CHAINID_CORRECT = "chainId";

  public static final String INCORRECT_HTTP_METHOD_ERROR_STATUS_LINE = "HTTP/1.1 404 Not Found";
  public static final String INCORRECT_CONTENT_TYPE_ERROR_STATUS_LINE = "HTTP/1.1 400 Bad Request";

  public static final String INCORRECT_CONTENT_TYPE_ERROR_MSG = "transport not supported";
}