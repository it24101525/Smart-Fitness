package com.example.Smart_Fitness.service;

import com.example.Smart_Fitness.model.IndexPage;
import com.example.Smart_Fitness.repository.IndexPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexPageService {

    private final IndexPageRepository indexPageRepository;

    @Autowired
    public IndexPageService(IndexPageRepository indexPageRepository) {
        this.indexPageRepository = indexPageRepository;
    }

    public IndexPage getWelcomeMessage() {
        return indexPageRepository.getWelcomeMessage();
    }
}
