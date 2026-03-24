public class DriverCheck {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver found and loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NOT found. Check your Build Path/Libraries.");
            e.printStackTrace();
        }
    }
}