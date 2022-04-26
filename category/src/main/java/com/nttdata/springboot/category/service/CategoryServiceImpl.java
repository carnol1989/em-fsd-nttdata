package com.nttdata.springboot.category.service;

import com.nttdata.springboot.category.client.ProductClient;
import com.nttdata.springboot.category.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductClient productClient;

    @Override
    public List<Category> getCategoryAllService() {
        List<Category> listCategoryList = new ArrayList<>();
        listCategoryList.add(Category.builder()
                                .id(1)
                                .description("categoria 01")
                                .build());
        listCategoryList.add(Category.builder()
                .id(2)
                .description("categoria 02")
                .build());
        listCategoryList.add(Category.builder()
                .id(3)
                .description("categoria 03")
                .build());
        return listCategoryList;
    }

    @Override
    public Category getCategoryProductFeignService() {
        return Category.builder()
                    .id(1)
                    .description("Categoria 01")
                    .listProduct(productClient.getProductAllFeign())
                    .build();
    }
}
