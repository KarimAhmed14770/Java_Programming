import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseHandler {
    // 1433 is the default port. Change 'MarketDB' to your actual database name.
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SalesDB;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa"; // Your SQL login
    private static final String PASS = "ITSME";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Connection Error: " + e.getMessage());
            return null;
        }
    }
}