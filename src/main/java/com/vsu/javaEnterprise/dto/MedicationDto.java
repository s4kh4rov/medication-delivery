package com.vsu.javaEnterprise.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MedicationDto {
    private String medicationName;
    private Double dosage;
    private String form;
    private String medicationGroup;
    private Integer shelfLife;
    private BigDecimal price;
    private Integer amount;
}
