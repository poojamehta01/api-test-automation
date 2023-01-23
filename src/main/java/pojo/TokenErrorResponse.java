package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class TokenErrorResponse {
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
    public String code;
  }

  @Data
  @JsonIgnoreProperties
  public static class Location {
    public int line;
    public int column;
  }
}
