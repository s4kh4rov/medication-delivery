package com.vsu.javaEnterprise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsu.javaEnterprise.enums.MedicationGroup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "orders_count")
    private Integer ordersCount;
    @Column(name = "discount_card_number")
    private String discountCardNumber;
    @Column(name = "purchase_frequency")
    private Integer purchaseFrequency;
    @Column(name = "days_before_purchase")
    private Integer daysBeforePurchase;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_medication",
            joinColumns = { @JoinColumn(name = "cust_id") },
            inverseJoinColumns = { @JoinColumn(name = "med_id") }
    )
    @JsonIgnore
    private Set<Medication> purchasedMedications;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    @JsonIgnore
    private Set<MedicationOrder> orders;
}
