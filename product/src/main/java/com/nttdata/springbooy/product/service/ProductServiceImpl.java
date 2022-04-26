package com.nttdata.springbooy.product.service;

import com.nttdata.springbooy.product.dao.ProductDao;
import com.nttdata.springbooy.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductAllService() {
        List<Product> listProduct = new ArrayList<>();
        productDao.findAll().forEach(p -> listProduct.add(p));
        /*listProduct.add(Product.builder()
                            .id(1)
                            .name("Producto 01")
                            .build());
        listProduct.add(Product.builder()
                .id(2)
                .name("Producto 02")
                .build());
        listProduct.add(Product.builder()
                .id(3)
                .name("Producto 03")
                .build());*/
        return listProduct;
    }

    @Override
    public void saveProductService(Product product) {
        productDao.save(product);
    }

    @Override
    public void updateProductService(Product product) {
        productDao.save(product);
    }

    @Override
    public Product getProductByIdService(Integer idProduct) {
        return productDao.findById(idProduct).orElse(null);
    }

    @Override
    public void deleteProductService(Integer idProduct) {
        productDao.deleteById(idProduct);
    }
}
