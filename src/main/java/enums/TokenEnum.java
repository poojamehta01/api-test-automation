package enums;

import lombok.Getter;

public enum TokenEnum {
  ID("id\n"),
  CHAIN_ID("chainId\n"),
  NAME("name\n"),
  SYMBOL("symbol\n"),
  TYPE("type\n"),
  TOTAL_SUPPLY("totalSupply\n"),
  DECIMALS("decimals\n"),
  BASE_URI("baseURI\n"),
  LAST_TRANSFER_TIMESTAMP("lastTransferTimestamp\n"),
  LAST_TRANSFER_BLOCK("lastTransferBlock\n"),
  LAST_TRANSFER_HASH("lastTransferHash\n"),
  CURRENT_HOLDER_COUNT("currentHolderCount\n"),
  TRANSFER_COUNT("transferCount\n"),
  TOKEN_TRAITS("tokenTraits\n"),
  TOKEN_BALANCE("tokenBalance \n {tokenId\nowner\namount\n}");

  @Getter private final String value;

  TokenEnum(String value) {

    this.value = value;
  }
}
