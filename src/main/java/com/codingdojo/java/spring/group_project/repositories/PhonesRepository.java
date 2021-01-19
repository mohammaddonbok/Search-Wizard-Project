package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhonesRepository extends CrudRepository<Phone,Long> {
}
