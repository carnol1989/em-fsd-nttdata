package com.nttdata.springboot.category.controller;

import com.nttdata.springboot.category.model.Category;
import com.nttdata.springboot.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategoryAllController() {
        return categoryService.getCategoryAllService();
    }

    @GetMapping("/categoryProductFeign")
    public Category getCategoryProductFeignController() {
        return categoryService.getCategoryProductFeignService();
    }

}
