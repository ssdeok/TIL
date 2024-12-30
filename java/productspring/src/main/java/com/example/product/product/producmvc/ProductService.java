package com.example.product.product.producmvc;

import com.example.product.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product newProduct) {
        validateProductData(newProduct);
        return productRepository.save(newProduct);
    }

    public List<Product> readProducts() {
        return productRepository.findAll();
    }

    public Product readProductById(Long id) {
        Product product = productRepository.findById(id);

        checkProductIsNull(product);
        return product;
    }

    public Product updatedProduct(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id);

        checkProductIsNull(product);
        validateProductData(updatedProduct);
        return productRepository.modify(id, updatedProduct);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id);
        checkProductIsNull(product);

        productRepository.delete(product);
    }

    public void checkProductIsNull(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("없는 id입니다.");
        }
    }

    public void validateProductData(Product product) {
        String name = product.getName();
        int price = product.getPrice();

        if (name == null || name.isBlank()) {
            throw new RuntimeException("name을 입력해주세요");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("price는 0보다 커야 합니다.");
        }
    }
}
