package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.domain.Consignment;
import com.vsu.javaEnterprise.repository.ConsignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsignmentService {
    private final ConsignmentRepository consignmentRepository;

    @Autowired
    public ConsignmentService(ConsignmentRepository consignmentRepository) {
        this.consignmentRepository = consignmentRepository;
    }
    public List<Consignment> findAll(){
        return consignmentRepository.findAll();
    }
    public void saveAll(List<Consignment> consignments){
        consignmentRepository.saveAll(consignments);
    }
    public void save(Consignment consignment){
        consignmentRepository.save(consignment);
    }
}
