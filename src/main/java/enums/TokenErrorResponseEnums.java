package enums;

import lombok.Getter;

public enum TokenErrorResponseEnums {
  GET_TOKEN_QUERY_INVALID_ID_FIELD_NAME(
      "Cannot query field \"id1\" on type \"Token\". Did you mean \"id\"?",
      "GRAPHQL_VALIDATION_FAILED",
      null,
      422),

  GET_TOKEN_QUERY_INVALID_CHAINID_FIELD_NAME(
      "Cannot query field \"chainId1\" on type \"Token\". Did you mean \"chainId\"?",
      "GRAPHQL_VALIDATION_FAILED",
      null,
      422),

  GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_NAME(
      "Cannot query field \"test\" on type \"Token\".", "GRAPHQL_VALIDATION_FAILED", null, 422),

  GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_INT(
      "Expected Name, found Int", "GRAPHQL_PARSE_FAILED", null, 422),

  GET_TOKEN_QUERY_INVALID_NOT_PRESENT_FIELD_STRING(
      "Expected Name, found String", "GRAPHQL_PARSE_FAILED", null, 422),

  CHAIN_ID_NULL("cannot be null", "GRAPHQL_VALIDATION_FAILED", null, 422);

  @Getter private final String message;
  @Getter private final String code;
  @Getter private final String data;

  @Getter private final int status;

  TokenErrorResponseEnums(String message, String code, String data, int status) {

    this.message = message;
    this.code = code;
    this.data = data;
    this.status = status;
  }
}
