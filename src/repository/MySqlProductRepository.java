package repository;

import entity.Product;

public class MySqlProductRepository implements ProductRepository {
    @Override
    public void add(Product product) {
        // sql query
        System.out.println("Product added with mysql: " + product.getName());
    }
}
