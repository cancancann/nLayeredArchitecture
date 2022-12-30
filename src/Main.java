import entity.Product;
import repository.MsSqlProductRepository;
import repository.MySqlProductRepository;
import service.ProductService;
import service.ProductServiceIpml;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductServiceIpml(new MySqlProductRepository());

        Product product = new Product("Laptop", 10000);

        productService.add(product);

    }
}