import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/my_restaurant?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";
        String username = "root"; // Replace with your username
        String password = "rootpass"; // Replace with your password

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
