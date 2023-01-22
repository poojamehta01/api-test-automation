package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenRequests {
  private String query;
  private QueryVariables variables;

  @Data
  @Builder
  public static class QueryVariables {

    private Input input;
  }

  @Data
  @Builder
  public static class Input {
    private Filter filter;
    private int limit;
    private String cursor;
  }

  @Data
  @Builder
  public static class Filter {
    private String chainId;
    private String type;
    private String address;
    private String name;
    private String symbol;
  }
}
