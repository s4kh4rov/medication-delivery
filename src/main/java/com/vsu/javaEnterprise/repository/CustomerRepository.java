package com.vsu.javaEnterprise.repository;

import com.vsu.javaEnterprise.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer getCustomerById(Long id);
}
