package com.vsu.javaEnterprise.domain;

import com.vsu.javaEnterprise.enums.MedicationForm;
import com.vsu.javaEnterprise.enums.MedicationGroup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@Entity
public class Medication {
    @Id
    private Long id;
    private String medicationName;
    private Double dosage;
    private MedicationForm form;
    //private Consignment consignment;
    private MedicationGroup medicationGroup;
    private Integer shelfLife;
    private Double discountRate;
    private Boolean isExpired;
    private BigDecimal price;
}
