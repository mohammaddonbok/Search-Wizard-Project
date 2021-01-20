package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.AddressRepository;

public class AddressService {
    private final AddressRepository addressRepo;

    public AddressService(AddressRepository addressRepo) {
        this.addressRepo = addressRepo;
    }
}
