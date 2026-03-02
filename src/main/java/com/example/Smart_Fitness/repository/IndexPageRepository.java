package com.example.Smart_Fitness.repository;

import com.example.Smart_Fitness.model.IndexPage;
import org.springframework.stereotype.Repository;

@Repository
public class IndexPageRepository {

    public IndexPage getWelcomeMessage() {
        return new IndexPage("Welcome to Smart Fitness Gym!");
    }
}
