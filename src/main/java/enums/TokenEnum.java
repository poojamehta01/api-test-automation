package enums;

import lombok.Getter;

public enum TokenEnum {
  id("id\n"),
  chainId("chainId\n"),
  name("name\n"),
  symbol("symbol\n"),
  type("type\n"),
  totalSupply("totalSupply\n"),
  decimals("decimals\n"),
  baseURI("baseURI\n"),
  lastTransferTimestamp("lastTransferTimestamp\n"),
  lastTransferBlock("lastTransferBlock\n"),
  lastTransferHash("lastTransferHash\n"),
  currentHolderCount("currentHolderCount\n"),
  transferCount("transferCount\n"),
  tokenTraits("tokenTraits\n"),
  tokenBalance("tokenBalance \n {tokenId\nowner\namount\n}");

  @Getter private final String value;

  TokenEnum(String value) {

    this.value = value;
  }
}
