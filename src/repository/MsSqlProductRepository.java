package repository;

import entity.Product;

public class MsSqlProductRepository  implements ProductRepository {
    @Override
    public void add(Product product) {
        // sql query
        System.out.println("Product added with mssql: " + product.getName());
    }
}
