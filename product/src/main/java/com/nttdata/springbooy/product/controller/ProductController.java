package com.nttdata.springbooy.product.controller;

import com.nttdata.springbooy.product.configuration.CacheProperties;
import com.nttdata.springbooy.product.model.Product;
import com.nttdata.springbooy.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CacheProperties cacheProperties;

    @GetMapping("/products")
    public List<Product> getProductAllController() {
        return productService.getProductAllService();
    }

    @GetMapping("/product/{id}")
    public Product getProductByIdController(@PathVariable(value = "id") Integer idProducto) {
        return productService.getProductByIdService(idProducto);
    }

    @PostMapping("/product")
    public void saveProductController(@RequestBody Product product) {
        productService.saveProductService(product);
    }

    @PutMapping("/product")
    public void updateProductController(@RequestBody Product product) {
        productService.updateProductService(product);
    }

    @DeleteMapping("/product/{id}")
    public void updateProductController(@PathVariable Integer id) {
        productService.deleteProductService(id);
    }

    @GetMapping("/cacheProperties")
    public CacheProperties getCachePropertiesController() {
        return cacheProperties;
    }

}
