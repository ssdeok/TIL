package com.example.product.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductApi {

    List<Product> products = new ArrayList<>();
    private Long id = 0L;

    {
        products.add(new Product(++id, "치토스", 1000));
    }

    // create
    // product /
    @GetMapping("/products/create")
    public Product createProduct() {
        Product product = new Product(++id, "치토스", 1000);

        products.add(product);

        return product;
    }

    // read - 전체 조회
    @GetMapping("/products")
    public List<Product> readProducts() {
        return products;
    }

    // read - 단일 조회
    @GetMapping("/products/{id}")
    public Product readProductById(@PathVariable Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    // update
    @GetMapping("/products/{id}/update")
    public Product updateProduct(@PathVariable Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName("수정된 이름");
                product.setPrice(3000);
                return product;

            }
        }
        return null;
    }

    // delete

    @GetMapping("/products/{id}/delete")
    public Product deleteProduct(@PathVariable Long id) {
        Product removeProduct = null;
        for (Product product : products) {
            if (product.getId().equals(id)) {
                removeProduct = product;
                break;
            }
        }
        products.remove(removeProduct);
        return null;
    }
}
