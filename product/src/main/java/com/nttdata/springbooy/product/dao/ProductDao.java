package com.nttdata.springbooy.product.dao;

import com.nttdata.springbooy.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
