package com.vsu.javaEnterprise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vsu.javaEnterprise.enums.MedicationForm;
import com.vsu.javaEnterprise.enums.MedicationGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cons_id", referencedColumnName = "id")
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private Consignment consignment;
    @ManyToMany(mappedBy = "purchasedMedications", fetch = FetchType.LAZY)
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private Set<Customer> regularCustomers;
    @OneToMany(mappedBy = "medication", fetch = FetchType.LAZY)
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private Set<OrderItem> items;
}
