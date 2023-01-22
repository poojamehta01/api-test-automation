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
          {TokenEnum.ID_ENUM},
          {TokenEnum.CHAIN_ID_ENUM},
          {TokenEnum.NAME_ENUM},
          {TokenEnum.SYMBOL_ENUM},
          {TokenEnum.TYPE_ENUM},
          {TokenEnum.TOTAL_SUPPLY_ENUM},
          {TokenEnum.DECIMALS_ENUM},
          {TokenEnum.BASE_URI_ENUM},
          {TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM},
          {TokenEnum.LAST_TRANSFER_BLOCK_ENUM},
          {TokenEnum.LAST_TRANSFER_HASH_ENUM},
          {TokenEnum.CURRENT_HOLDER_COUNT_ENUM},
          {TokenEnum.TRANSFER_COUNT_ENUM},
          {TokenEnum.TOKEN_TRAITS_ENUM},
          {TokenEnum.TOKEN_BALANCE_ENUM}
        };

      case "getTokensByTwoParamsTest":
        return new Object[][] {
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.NAME_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.SYMBOL_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.TYPE_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.TOTAL_SUPPLY_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.DECIMALS_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.BASE_URI_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.LAST_TRANSFER_BLOCK_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.LAST_TRANSFER_HASH_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CURRENT_HOLDER_COUNT_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.TRANSFER_COUNT_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.TOKEN_TRAITS_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.TOKEN_BALANCE_ENUM}
        };

      case "getTokensByThreeParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.NAME_ENUM,
          },
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.SYMBOL_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.TYPE_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.TOTAL_SUPPLY_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.DECIMALS_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.BASE_URI_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.LAST_TRANSFER_BLOCK_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.LAST_TRANSFER_HASH_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.CURRENT_HOLDER_COUNT_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.TRANSFER_COUNT_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.TOKEN_TRAITS_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.TOKEN_BALANCE_ENUM}
        };

      case "getTokensByFourParamsTest":
        return new Object[][] {
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.NAME_ENUM, TokenEnum.SYMBOL_ENUM},
          {TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.NAME_ENUM, TokenEnum.TYPE_ENUM},
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM
          },
          {
            TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.NAME_ENUM, TokenEnum.DECIMALS_ENUM
          },
          {
            TokenEnum.ID_ENUM, TokenEnum.CHAIN_ID_ENUM, TokenEnum.NAME_ENUM, TokenEnum.BASE_URI_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByFiveParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.DECIMALS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.BASE_URI_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensBySixParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.DECIMALS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.BASE_URI_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensBySevenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.BASE_URI_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByEightParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByNineParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByTenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByElevenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByTwelveParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByThirteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByFourteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM
          },
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      case "getTokensByFifteenParamsTest":
        return new Object[][] {
          {
            TokenEnum.ID_ENUM,
            TokenEnum.CHAIN_ID_ENUM,
            TokenEnum.NAME_ENUM,
            TokenEnum.SYMBOL_ENUM,
            TokenEnum.TYPE_ENUM,
            TokenEnum.TOTAL_SUPPLY_ENUM,
            TokenEnum.DECIMALS_ENUM,
            TokenEnum.BASE_URI_ENUM,
            TokenEnum.LAST_TRANSFER_TIMESTAMP_ENUM,
            TokenEnum.LAST_TRANSFER_BLOCK_ENUM,
            TokenEnum.LAST_TRANSFER_HASH_ENUM,
            TokenEnum.CURRENT_HOLDER_COUNT_ENUM,
            TokenEnum.TRANSFER_COUNT_ENUM,
            TokenEnum.TOKEN_TRAITS_ENUM,
            TokenEnum.TOKEN_BALANCE_ENUM
          }
        };

      default:
        return new Object[][] {};
    }
  }
}
