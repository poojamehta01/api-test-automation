package enums;

import lombok.Getter;

public enum TokenEnum {
  ID_ENUM("id\n"),
  CHAIN_ID_ENUM("chainId\n"),
  NAME_ENUM("name\n"),
  SYMBOL_ENUM("symbol\n"),
  TYPE_ENUM("type\n"),
  TOTAL_SUPPLY_ENUM("totalSupply\n"),
  DECIMALS_ENUM("decimals\n"),
  BASE_URI_ENUM("baseURI\n"),
  LAST_TRANSFER_TIMESTAMP_ENUM("lastTransferTimestamp\n"),
  LAST_TRANSFER_BLOCK_ENUM("lastTransferBlock\n"),
  LAST_TRANSFER_HASH_ENUM("lastTransferHash\n"),
  CURRENT_HOLDER_COUNT_ENUM("currentHolderCount\n"),
  TRANSFER_COUNT_ENUM("transferCount\n"),
  TOKEN_TRAITS_ENUM("tokenTraits\n"),
  TOKEN_BALANCE_ENUM("tokenBalance \n {tokenId\nowner\namount\n}");

  @Getter private final String value;

  TokenEnum(String value) {

    this.value = value;
  }
}
