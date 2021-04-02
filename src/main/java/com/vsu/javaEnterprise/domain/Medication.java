package com.vsu.javaEnterprise.domain;

import lombok.Data;

import javax.persistence.*;

@Data
public class Medication {
    private Long id;
    private String medicationName;
    private Double dosage;
    private MedicationForm form;
    private Consignment consignment;
    private MedicationGroup medicationGroup;
    private Integer shelfLife;
    private Double discountRate;
    private Boolean isExpired;
    private Double price;
}
