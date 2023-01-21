package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponse {
  public DataToken data;

  @Data
  public static class DataToken {
    @JsonProperty("Tokens")
    public Tokens tokens;
  }

  @Data
  public static class PageInfo {
    public String prevCursor;
    public String nextCursor;
  }

  @Data
  public static class Token {
    public String id;
    public String chainId;
    public String name;
    public String symbol;
    public String type;
    public String totalSupply;
    public int decimals;
    public String baseURI;
    public Date lastTransferTimestamp;
    public int lastTransferBlock;
    public String lastTransferHash;
    public int currentHolderCount;
    public int transferCount;
    public Object tokenTraits;
    public Object tokenBalance;
  }

  @Data
  public static class Tokens {
    public ArrayList<Token> tokens;
    public PageInfo pageInfo;
  }
}
