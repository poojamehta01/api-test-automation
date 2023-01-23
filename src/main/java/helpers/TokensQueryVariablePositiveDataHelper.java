package helpers;

import static constants.TokenRequestConstants.ADDRESS_DEFAULT;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokensQueryVariablePositiveDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByChainIdTest":
        return new Object[][] {{"1"}, {""}, {null}};

      case "getTokenByTypeTest":
        return new Object[][] {
          {"ERC721", ADDRESS_DEFAULT},
          {"ERC20", "100000000000045166c45af0fc6e4cf31d9e14b9a"},
          {"", ADDRESS_DEFAULT},
          {null, ADDRESS_DEFAULT}
        };

      case "getTokenByNameTest":
        return new Object[][] {{"MutantApeYachtClub"}, {""}, {null}};

      case "getTokenBySymbolTest":
        return new Object[][] {{"X"}, {""}, {null}, {"MAYC"}};

      case "getTokenByAddressTest":
        return new Object[][] {
          {"0xedf6d3c3664606fe9ee3a9796d5cc75e3b16e682"},
          {"0x60e4d786628fea6478f785a6d7e704777c86a7c6"}
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
