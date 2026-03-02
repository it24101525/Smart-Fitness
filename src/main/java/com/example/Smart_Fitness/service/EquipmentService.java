package com.example.Smart_Fitness.service;

import com.example.Smart_Fitness.model.Equipment;
import com.example.Smart_Fitness.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> getAll() { return equipmentRepository.getAll(); }
    public Equipment getById(String id) { return equipmentRepository.getById(id); }
    public void add(Equipment equipment) { equipmentRepository.add(equipment); }
    public void delete(String id) { equipmentRepository.delete(id); }
}
