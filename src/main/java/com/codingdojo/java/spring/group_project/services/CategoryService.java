package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.CategoryRepository;

public class CategoryService {
    private final CategoryRepository catRepo;

    public CategoryService(CategoryRepository catRepo) {
        this.catRepo = catRepo;
    }
}
