package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.SubCategory;

import org.springframework.data.repository.CrudRepository;

public interface SubCategoriesRepository extends CrudRepository<SubCategory,Long> {
}
