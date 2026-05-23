import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {

        try {

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/smilecaredb",
                    "root",
                    "");

            return connection;

        } catch (Exception e) {

            System.out.println("Database connection failed");
            return null;
        }
    }
}