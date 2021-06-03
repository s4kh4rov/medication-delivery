package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.repository.ConsignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsignmentService {
    private final ConsignmentRepository consignmentRepository;

    @Autowired
    public ConsignmentService(ConsignmentRepository consignmentRepository) {
        this.consignmentRepository = consignmentRepository;
    }
}
