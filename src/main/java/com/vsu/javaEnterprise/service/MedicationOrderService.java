package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.repository.MedicationOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicationOrderService {
    private final MedicationOrderRepository medicationOrderRepository;

    @Autowired
    public MedicationOrderService(MedicationOrderRepository medicationOrderRepository) {
        this.medicationOrderRepository = medicationOrderRepository;
    }
}
