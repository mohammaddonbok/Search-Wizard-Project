package com.codingdojo.java.spring.group_project.repositories;


import com.codingdojo.java.spring.group_project.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
