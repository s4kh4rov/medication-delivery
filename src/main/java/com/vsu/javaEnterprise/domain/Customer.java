package com.vsu.javaEnterprise.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {
    private Long id;
    private String surname;
    private Integer ordersCount;
    private String discountCardNumber;
    private Set<MedicationGroup> purchasedMedications;
    private Integer purchaseFrequency;
    private Integer daysBeforePurchase;
}
