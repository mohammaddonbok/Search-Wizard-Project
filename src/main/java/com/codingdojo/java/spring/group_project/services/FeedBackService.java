package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.FeedBacksRepository;

public class FeedBackService {
    private final FeedBacksRepository feedRepo;

    public FeedBackService(FeedBacksRepository feedRepo) {
        this.feedRepo = feedRepo;
    }
}
