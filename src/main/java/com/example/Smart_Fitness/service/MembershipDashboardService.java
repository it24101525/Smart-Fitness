package com.example.Smart_Fitness.service;

import com.example.Smart_Fitness.model.MembershipDashboard;
import com.example.Smart_Fitness.repository.MembershipDashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipDashboardService {

    private final MembershipDashboardRepository dashboardRepository;

    @Autowired
    public MembershipDashboardService(MembershipDashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public Optional<MembershipDashboard> getDashboardByUserId(Long userId) {
        return dashboardRepository.findByUserId(userId);
    }

    public List<MembershipDashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }

    // Add business logic here if needed
}
