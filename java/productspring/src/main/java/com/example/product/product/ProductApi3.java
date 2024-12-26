package com.example.product.product;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v3/products")
public class ProductApi3 {

    List<Product> products = new ArrayList<>();
    private Long id = 0L;

    {
        products.add(new Product(++id, "치토스", 1000));
    }

    // create
    // product /
    @PostMapping
    public Product createProduct() {
        Product product = new Product(++id, "치토스", 1000);

        products.add(product);

        return product;
    }

    // read - 전체 조회
    @GetMapping
    public List<Product> readProducts() {
        return products;
    }

    // read - 단일 조회
    @GetMapping("/{id}")
    public Product readProductById(@PathVariable Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    // update
    @PutMapping("/{id}")
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

    @DeleteMapping("/{id}")
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
