package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.RolesRepository;

public class RoleService {
    private final RolesRepository roleRepo;

    public RoleService(RolesRepository roleRepo) {
        this.roleRepo = roleRepo;
    }
}
