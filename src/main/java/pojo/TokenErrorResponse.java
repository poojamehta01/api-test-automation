package pojo;

import java.util.ArrayList;
import lombok.Data;

@Data
public class TokenErrorResponse {
  public ArrayList<Error> errors;
  public Object data;

  @Data
  public static class Error {
    public String message;
    public ArrayList<Location> locations;
    public Extensions extensions;
  }

  @Data
  public static class Extensions {
    public String code;
  }

  @Data
  public static class Location {
    public int line;
    public int column;
  }
}
