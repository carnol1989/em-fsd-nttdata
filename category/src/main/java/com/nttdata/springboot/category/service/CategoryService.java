package com.nttdata.springboot.category.service;

import com.nttdata.springboot.category.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoryAllService();

    Category getCategoryProductFeignService();

}
