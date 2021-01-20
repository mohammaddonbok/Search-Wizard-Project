package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.CityRepository;

public class CityService {
    private final CityRepository cityRepo;

    public CityService(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }
}
