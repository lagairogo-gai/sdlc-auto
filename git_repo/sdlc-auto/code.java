
import java.sql.*;

public class OracleDBConnectivity {

public static void connectToDatabase() {
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");
        System.out.println("Connection Established");
    } catch (SQLException e) {
        System.err.println("Error in connecting to database: " + e.getMessage());
    }
}

}

In the above code, we have created a Java class named OracleDBConnectivity that contains a method connectToDatabase() that is