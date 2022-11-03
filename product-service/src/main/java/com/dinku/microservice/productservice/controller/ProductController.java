package com.dinku.microservice.productservice.controller;

import com.dinku.microservice.productservice.model.Product;
import com.dinku.microservice.productservice.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor

public class ProductController {

  private ProductRepository productRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createProduct(@RequestBody Product product) {
    productRepository.save(product);
  }
}
