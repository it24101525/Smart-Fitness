package com.example.Smart_Fitness.service;

import com.example.Smart_Fitness.model.MemberProgress;
import com.example.Smart_Fitness.repository.MemberProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberProgressService {

    @Autowired
    private MemberProgressRepository repository;

    public void logProgress(MemberProgress progress) {
        repository.saveProgress(progress);
    }

    public void deleteProgress(Long id) {
        repository.deleteProgress(id);
    }

    public List<MemberProgress> getProgressForMember(int memberId) {
        return repository.findProgressByMemberId(memberId);
    }
}

