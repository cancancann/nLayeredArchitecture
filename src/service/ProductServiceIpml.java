package service;

import entity.Product;
import repository.ProductRepository;

public class ProductServiceIpml implements ProductService {

    private ProductRepository productRepository;

    // dependency injection
    public ProductServiceIpml(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void add(Product product) {
        this.productRepository.add(product);
    }
}
