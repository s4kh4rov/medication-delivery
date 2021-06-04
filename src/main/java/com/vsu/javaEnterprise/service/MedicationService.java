package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.domain.Medication;
import com.vsu.javaEnterprise.dto.MedicationDto;
import com.vsu.javaEnterprise.mapper.MedicationMapper;
import com.vsu.javaEnterprise.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    private final MedicationRepository medicationRepository;
    private final MedicationMapper medicationMapper;

    @Autowired
    public MedicationService(MedicationRepository medicationRepository, MedicationMapper medicationMapper) {
        this.medicationRepository = medicationRepository;
        this.medicationMapper = medicationMapper;
    }
    public Medication getById(Long id){
        return medicationRepository.getById(id);
    }
    public List<MedicationDto> getAll(){
        return medicationMapper.toMedicationDtos(medicationRepository.findAll());
    }
}
