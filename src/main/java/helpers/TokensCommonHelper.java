package Helper;

import POJO.TokenRequests;
import POJO.TokenRequests.Filter;
import POJO.TokenRequests.Input;
import POJO.TokenRequests.QueryVariables;

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
}
