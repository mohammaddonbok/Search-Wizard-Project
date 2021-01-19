package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,Long> {
}
