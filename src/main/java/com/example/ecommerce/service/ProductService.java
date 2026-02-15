package com.example.ecommerce.service;
import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product getProductById(Integer id) {
        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}