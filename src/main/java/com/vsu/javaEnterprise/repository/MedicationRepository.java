package com.vsu.javaEnterprise.repository;

import com.vsu.javaEnterprise.domain.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {
    Medication getById(Long id);
}
