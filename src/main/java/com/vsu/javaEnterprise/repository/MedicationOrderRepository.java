package com.vsu.javaEnterprise.repository;

import com.vsu.javaEnterprise.domain.MedicationOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationOrderRepository extends JpaRepository<MedicationOrder,Long> {
}
