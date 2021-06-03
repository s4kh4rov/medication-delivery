package com.vsu.javaEnterprise.repository;

import com.vsu.javaEnterprise.domain.Consignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsignmentRepository extends JpaRepository<Consignment,Long> {
}
