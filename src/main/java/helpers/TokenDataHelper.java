package helpers;

import enums.TokenEnum;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TokenDataHelper {
  @DataProvider(name = "token_dataProvider")
  public static Object[][] token_dataProvider(Method m) {

    switch (m.getName()) {
      case "getTokensByOneParamTest":
        return new Object[][] {
          {TokenEnum.id},
          {TokenEnum.chainId},
          {TokenEnum.name},
          {TokenEnum.symbol},
          {TokenEnum.type},
          {TokenEnum.totalSupply},
          {TokenEnum.decimals},
          {TokenEnum.baseURI},
          {TokenEnum.lastTransferTimestamp},
          {TokenEnum.lastTransferBlock},
          {TokenEnum.lastTransferHash},
          {TokenEnum.currentHolderCount},
          {TokenEnum.transferCount},
          {TokenEnum.tokenTraits},
          {TokenEnum.tokenBalance}
        };

      case "getTokensByTwoParamsTest":
        return new Object[][] {
          {TokenEnum.id, TokenEnum.chainId},
          {TokenEnum.id, TokenEnum.name},
          {TokenEnum.id, TokenEnum.symbol},
          {TokenEnum.id, TokenEnum.type},
          {TokenEnum.id, TokenEnum.totalSupply},
          {TokenEnum.id, TokenEnum.decimals},
          {TokenEnum.id, TokenEnum.baseURI},
          {TokenEnum.id, TokenEnum.lastTransferTimestamp},
          {TokenEnum.id, TokenEnum.lastTransferBlock},
          {TokenEnum.id, TokenEnum.lastTransferHash},
          {TokenEnum.id, TokenEnum.currentHolderCount},
          {TokenEnum.id, TokenEnum.transferCount},
          {TokenEnum.id, TokenEnum.tokenTraits},
          {TokenEnum.id, TokenEnum.tokenBalance}
        };

      case "getTokensByThreeParams":
        return new Object[][] {
          {
            TokenEnum.id, TokenEnum.chainId, TokenEnum.name,
          },
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.symbol},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.type},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.totalSupply},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.decimals},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.baseURI},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.lastTransferTimestamp},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.lastTransferBlock},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.lastTransferHash},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.currentHolderCount},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.transferCount},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.tokenTraits},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.tokenBalance}
        };

      case "getTokensByFourParams":
        return new Object[][] {
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.type},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.totalSupply},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.decimals},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.baseURI},
          {
            TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.lastTransferTimestamp,
          },
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.lastTransferBlock},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.lastTransferHash},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.currentHolderCount},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.transferCount},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.tokenTraits},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.tokenBalance}
        };

      case "getTokensByFiveParams":
        return new Object[][] {
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol, TokenEnum.type},
          {
            TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol, TokenEnum.totalSupply
          },
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol, TokenEnum.decimals},
          {TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol, TokenEnum.baseURI},
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.lastTransferTimestamp
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id, TokenEnum.chainId, TokenEnum.name, TokenEnum.symbol, TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensBySixParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.decimals
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.baseURI
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.lastTransferTimestamp
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensBySevenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.baseURI
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.lastTransferTimestamp
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByEightParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.lastTransferTimestamp
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByNineParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByTenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByElevenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByTwelveParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByThirteenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.transferCount
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByFourteenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.transferCount,
            TokenEnum.tokenTraits
          },
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.transferCount,
            TokenEnum.tokenBalance
          }
        };

      case "getTokensByFifteenParams":
        return new Object[][] {
          {
            TokenEnum.id,
            TokenEnum.chainId,
            TokenEnum.name,
            TokenEnum.symbol,
            TokenEnum.type,
            TokenEnum.totalSupply,
            TokenEnum.decimals,
            TokenEnum.baseURI,
            TokenEnum.lastTransferTimestamp,
            TokenEnum.lastTransferBlock,
            TokenEnum.lastTransferHash,
            TokenEnum.currentHolderCount,
            TokenEnum.transferCount,
            TokenEnum.tokenTraits,
            TokenEnum.tokenBalance
          }
        };

      default:
        return new Object[][] {};
    }
  }
}
