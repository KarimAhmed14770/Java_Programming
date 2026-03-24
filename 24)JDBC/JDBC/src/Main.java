public class Main {
    public static void main(String[] args){
        SalesDBService service = new SalesDBService();

        // 1. Add some products
        service.addProduct(2, "Spoon", "Home Accessories", 20);

        // 2. Search for a product
        System.out.println("--- Searching for Product 1 ---");
        service.getProductById(103);
    }
}
