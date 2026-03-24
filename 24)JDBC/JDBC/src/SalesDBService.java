import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesDBService {

    // Method to add a product to the SQL Server
    public void addProduct(int id, String name, String Category, int price) {
        String sql = "INSERT INTO Sales.Products (ProductID, Product, Category, Price) VALUES (?, ?, ?, ?)";

        // try-with-resources: This automatically CLOSES the connection and statement
        try (Connection conn = DataBaseHandler.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn == null) return;

            pstmt.setInt(1, id);       // Replaces the 1st '?'
            pstmt.setString(2, name);   // Replaces the 2nd '?'
            pstmt.setString(3, Category);  // Replaces the 3rd '?'
            pstmt.setInt(4, price);     // Replaces the 4th '?'

            pstmt.executeUpdate();
            System.out.println("Product '" + name + "' added successfully!");

        } catch (SQLException e) {
            System.err.println("Error inserting product: " + e.getMessage());
        }
    }
    // Method to find a product by ID (O(log n) because of the DB Index)
    public void getProductById(int id) {
        String sql = "SELECT * FROM Sales.Products WHERE ProductID = ?";

        try (Connection conn = DataBaseHandler.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("ProductID"));
                System.out.println("Name: " + rs.getString("Product"));
                System.out.println("Category: $" + rs.getString("Category"));
                System.out.println("Price: " + rs.getInt("Price"));
            } else {
                System.out.println("Product with ID " + id + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}