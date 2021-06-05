package com.vsu.javaEnterprise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "amount")
    private Integer amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private MedicationOrder order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "med_id")
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private Medication medication;
}
