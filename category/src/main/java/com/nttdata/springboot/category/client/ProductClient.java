package com.nttdata.springboot.category.client;

import com.nttdata.springboot.category.client.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "service-product", url = "http://localhost:8081")//Sin eureka-server
@FeignClient(name = "service-product")
public interface ProductClient {

    @GetMapping("/products")
    List<Product> getProductAllFeign();

}
