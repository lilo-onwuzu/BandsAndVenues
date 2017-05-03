import org.sql2o.*;

public class DB {
  // connect with local server
  //public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/band_tracker", null, null);

  // connect to heroku through maven dependency manager
  public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-23-23-220-163.compute-1.amazonaws.com:5432/d4nussmo57b64n","opgatahnoziluu", "dd5f17208a6eb57363d9029c05294367268377ffe89a5279640469d98a647513");
}
