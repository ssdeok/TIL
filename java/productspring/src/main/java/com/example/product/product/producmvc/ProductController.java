package com.example.product.product.producmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc/products")
public class ProductController {
   private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
