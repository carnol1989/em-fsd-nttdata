package com.nttdata.springbooy.product.service;

import com.nttdata.springbooy.product.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProductAllService();

    void saveProductService(Product product);

    void updateProductService(Product product);

    Product getProductByIdService(Integer idProduct);

    void deleteProductService(Integer idProduct);

}
