package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.SubCategoriesRepository;

public class SubCategoryService {
    private final SubCategoriesRepository subRepo;

    public SubCategoryService(SubCategoriesRepository subRepo) {
        this.subRepo = subRepo;
    }
}
