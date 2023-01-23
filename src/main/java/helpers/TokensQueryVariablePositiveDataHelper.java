package helpers;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokensQueryVariablePositiveDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByChainIdTest":
        return new Object[][] {{"1"}, {""}};

      case "getTokenByTypeTest":
        return new Object[][] {{"ERC721"}, {"ERC20"}, {""}, {null}};

      case "getTokenByNameTest":
        return new Object[][] {{"MutantApeYachtClub"}, {""}, {null}};

      case "getTokenBySymbolTest":
        return new Object[][] {{"X"}, {""}, {null}, {"MAYC"}};

      case "getTokenByAddressTest":
        return new Object[][] {
          {"0xedf6d3c3664606fe9ee3a9796d5cc75e3b16e682"},
          {"0x60e4d786628fea6478f785a6d7e704777c86a7c6"},
        };

      case "getTokenByLimitTest":
        return new Object[][] {{1}, {100}, {99}};

      case "getTokenByCursorTest":
        return new Object[][] {{null}};

      default:
        return new Object[][] {};
    }
  }
}
