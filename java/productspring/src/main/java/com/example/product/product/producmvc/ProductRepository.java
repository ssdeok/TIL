package com.example.product.product.producmvc;

import com.example.product.product.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    private Long id = 0L;

    public Product save(Product newProduct) {
        Product product = new Product(++id, newProduct.getName(), newProduct.getPrice());
        products.add(product);
        return product;
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product modify(Long id, Product updatedProduct) {

        String newName = updatedProduct.getName();
        int newPrice = updatedProduct.getPrice();

        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(newName);
                product.setPrice(newPrice);
                return product;
            }
        }
        return null;
    }

    public void delete(Product product) {
        products.remove(product);
    }
}
