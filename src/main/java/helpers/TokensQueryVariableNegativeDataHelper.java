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

      case "getTokensByAddressTestNegative":
        return new Object[][] {{""}, {"test"}, {null}, {"1"}};

      case "getTokensByLimitTestNegative":
        return new Object[][] {
          {101},
          // getting 5xx error for -1 and 0 hence commenting then as on hitting api with these
          // values
          // we later get 503 service unavailable which may lead to test faliures
          // {"-1"},{"0"}
        };

      case "getTokensByCursorTestNegative":
        return new Object[][] {{"1"}, {"0"}, {"-1"}};

      default:
        return new Object[][] {};
    }
  }
}
