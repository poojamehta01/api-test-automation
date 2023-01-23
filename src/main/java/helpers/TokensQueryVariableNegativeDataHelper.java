package helpers;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokensQueryVariableNegativeDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByChainIdTestNegative":
        return new Object[][] {{"0"}, {"test"}, {"2"}, {""}};

      case "getTokensByTypeTestNegative":
        return new Object[][] {{"X"}, {"1"}};

      case "getTokensByNameSymbolTestNegative":
        return new Object[][] {{"1"}};

      case "getTokensByAddressTestNegative":
        return new Object[][] {{""}, {"test"}, {null}, {"1"}};

      default:
        return new Object[][] {};
    }
  }
}
