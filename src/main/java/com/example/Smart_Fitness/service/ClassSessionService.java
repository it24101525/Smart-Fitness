package com.example.Smart_Fitness.service;

import com.example.Smart_Fitness.model.ClassSession;
import com.example.Smart_Fitness.repository.ClassSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassSessionService {
    private final ClassSessionRepository repo;

    @Autowired
    public ClassSessionService(ClassSessionRepository repo) {
        this.repo = repo;
    }

    public List<ClassSession> getAllClasses() {
        return repo.getAllClasses();
    }

    public void addClass(ClassSession cs) {
        repo.addClass(cs);
    }

    public void deleteClass(String id) {
        repo.deleteClass(id);
    }
}
