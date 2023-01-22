package helpers;

import enums.TokenEnum;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokenPositiveDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByOneParamTest":
        return new Object[][] {
          {TokenEnum.ID},
          {TokenEnum.CHAIN_ID},
          {TokenEnum.NAME},
          {TokenEnum.SYMBOL},
          {TokenEnum.TYPE},
          {TokenEnum.TOTAL_SUPPLY},
          {TokenEnum.DECIMALS},
          {TokenEnum.BASE_URI},
          {TokenEnum.LAST_TRANSFER_TIMESTAMP},
          {TokenEnum.LAST_TRANSFER_BLOCK},
          {TokenEnum.LAST_TRANSFER_HASH},
          {TokenEnum.CURRENT_HOLDER_COUNT},
          {TokenEnum.TRANSFER_COUNT},
          {TokenEnum.TOKEN_TRAITS},
          {TokenEnum.TOKEN_BALANCE}
        };

      case "getTokensByTwoParamsTest":
        return new Object[][] {
          {TokenEnum.ID, TokenEnum.CHAIN_ID},
          {TokenEnum.ID, TokenEnum.NAME},
          {TokenEnum.ID, TokenEnum.SYMBOL},
          {TokenEnum.ID, TokenEnum.TYPE},
          {TokenEnum.ID, TokenEnum.TOTAL_SUPPLY},
          {TokenEnum.ID, TokenEnum.DECIMALS},
          {TokenEnum.ID, TokenEnum.BASE_URI},
          {TokenEnum.ID, TokenEnum.LAST_TRANSFER_TIMESTAMP},
          {TokenEnum.ID, TokenEnum.LAST_TRANSFER_BLOCK},
          {TokenEnum.ID, TokenEnum.LAST_TRANSFER_HASH},
          {TokenEnum.ID, TokenEnum.CURRENT_HOLDER_COUNT},
          {TokenEnum.ID, TokenEnum.TRANSFER_COUNT},
          {TokenEnum.ID, TokenEnum.TOKEN_TRAITS},
          {TokenEnum.ID, TokenEnum.TOKEN_BALANCE}
        };

      case "getTokensByThreeParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME,
          },
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.SYMBOL},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.TYPE},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.TOTAL_SUPPLY},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.DECIMALS},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.BASE_URI},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.LAST_TRANSFER_TIMESTAMP},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.LAST_TRANSFER_BLOCK},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.LAST_TRANSFER_HASH},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.CURRENT_HOLDER_COUNT},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.TRANSFER_COUNT},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.TOKEN_TRAITS},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.TOKEN_BALANCE}
        };

      case "getTokensByFourParamsTest":
        return new Object[][] {
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.SYMBOL},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.TYPE},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.TOTAL_SUPPLY},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.DECIMALS},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.BASE_URI},
          {
            TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.LAST_TRANSFER_TIMESTAMP,
          },
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.LAST_TRANSFER_BLOCK},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.LAST_TRANSFER_HASH},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.CURRENT_HOLDER_COUNT},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.TRANSFER_COUNT},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.TOKEN_TRAITS},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.TOKEN_BALANCE}
        };

      case "getTokensByFiveParamsTest":
        return new Object[][] {
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.SYMBOL, TokenEnum.TYPE},
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TOTAL_SUPPLY
          },
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.SYMBOL, TokenEnum.DECIMALS},
          {TokenEnum.ID, TokenEnum.CHAIN_ID, TokenEnum.NAME, TokenEnum.SYMBOL, TokenEnum.BASE_URI},
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.LAST_TRANSFER_TIMESTAMP
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensBySixParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.DECIMALS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.BASE_URI
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.LAST_TRANSFER_TIMESTAMP
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensBySevenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.BASE_URI
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.LAST_TRANSFER_TIMESTAMP
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByEightParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.LAST_TRANSFER_TIMESTAMP
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByNineParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByTenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByElevenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByTwelveParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByThirteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TRANSFER_COUNT
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByFourteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TRANSFER_COUNT,
            TokenEnum.TOKEN_TRAITS
          },
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TRANSFER_COUNT,
            TokenEnum.TOKEN_BALANCE
          }
        };

      case "getTokensByFifteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID,
            TokenEnum.CHAIN_ID,
            TokenEnum.NAME,
            TokenEnum.SYMBOL,
            TokenEnum.TYPE,
            TokenEnum.TOTAL_SUPPLY,
            TokenEnum.DECIMALS,
            TokenEnum.BASE_URI,
            TokenEnum.LAST_TRANSFER_TIMESTAMP,
            TokenEnum.LAST_TRANSFER_BLOCK,
            TokenEnum.LAST_TRANSFER_HASH,
            TokenEnum.CURRENT_HOLDER_COUNT,
            TokenEnum.TRANSFER_COUNT,
            TokenEnum.TOKEN_TRAITS,
            TokenEnum.TOKEN_BALANCE
          }
        };

      default:
        return new Object[][] {};
    }
  }
}
