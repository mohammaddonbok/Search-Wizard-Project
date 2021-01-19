package com.codingdojo.java.spring.group_project.repositories;


import com.codingdojo.java.spring.group_project.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
