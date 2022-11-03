package com.dinku.microservice.productservice.repo;

import com.dinku.microservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
