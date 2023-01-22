package helpers;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokensQueryVariableNegativeDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByChainIdTestPositive":
        return new Object[][] {{1}, {""}};

      case "getTokensByChainIdNot1TestNegative":
        return new Object[][] {{"0"}, {"test"}, {"2"}};

      default:
        return new Object[][] {};
    }
  }
}
