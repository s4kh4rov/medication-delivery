package com.vsu.javaEnterprise.domain;

import com.vsu.javaEnterprise.enums.MedicationGroup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private Long id;
    private String surname;
    private Integer ordersCount;
    private String discountCardNumber;
    //@ElementCollection(targetClass = MedicationGroup.class)
//    @JoinTable(name = "tblInterests", joinColumns = @JoinColumn(name = "personID"))
//    @Column(name = "interest", nullable = false)
   // @Enumerated(EnumType.STRING)
   // private Set<MedicationGroup> purchasedMedications;//отдельная таблица
    private Integer purchaseFrequency;
    private Integer daysBeforePurchase;
}
