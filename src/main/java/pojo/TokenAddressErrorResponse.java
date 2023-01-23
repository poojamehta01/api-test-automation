package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class TokenAddressErrorResponse {
  public ArrayList<Error> errors;
  public Object data;

  @Data
  @JsonIgnoreProperties
  public static class Error {
    public String message;
    public ArrayList<Location> locations;
    public Extensions extensions;
    public ArrayList<String> path;
  }

  @Data
  @JsonIgnoreProperties
  public static class Extensions {
    @JsonProperty("Code")
    public String code;

    @JsonProperty("INTERNAL_ERROR_CODE")
    public String iNTERNAL_ERROR_CODE;

    @JsonProperty("Reference")
    public String reference;
  }

  @Data
  @JsonIgnoreProperties
  public static class Location {
    public int line;
    public int column;
  }
}
