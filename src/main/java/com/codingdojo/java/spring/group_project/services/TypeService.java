package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.TypesRepository;

public class TypeService {
    private final TypesRepository typeRepo;

    public TypeService(TypesRepository typeRepo) {
        this.typeRepo = typeRepo;
    }
}
