package com.vsu.javaEnterprise.domain;

import lombok.Data;

import java.util.Map;

@Data
public class MedicationOrder {
    private Long id;
    private Customer customer;
    private Map<Medication, Integer> medications;
    private Double orderAmount;
    private OrderStatus orderStatus;

}
