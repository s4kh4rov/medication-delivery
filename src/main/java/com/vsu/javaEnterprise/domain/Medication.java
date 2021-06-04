package com.vsu.javaEnterprise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsu.javaEnterprise.enums.MedicationForm;
import com.vsu.javaEnterprise.enums.MedicationGroup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "med_name")
    private String medicationName;
    @Column(name = "dosage")
    private Double dosage;
    @Column(name = "med_form")
    @Enumerated(EnumType.STRING)
    private MedicationForm form;
    @Column(name = "med_group")
    @Enumerated(EnumType.STRING)
    private MedicationGroup medicationGroup;
    @Column(name = "shelf_life")
    private Integer shelfLife;
    @Column(name = "price")
    private Double price;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "cons_id",referencedColumnName = "id")
    @JsonIgnore
    private Consignment consignment;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "purchasedMedications", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Customer> regularCustomers;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "medication",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<OrderItem> items;
}
