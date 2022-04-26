package com.nttdata.springboot.category.model;

import com.nttdata.springboot.category.client.model.Product;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Category {

    private Integer id;
    private String description;
    private List<Product> listProduct;

}
