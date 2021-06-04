package com.vsu.javaEnterprise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "consignment")
public class Consignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "is_expired")
    private Boolean isExpired;
    @Column(name = "discount_rate")
    private Double discountRate;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "consignment",fetch = FetchType.EAGER)
    @JsonIgnore
    private Medication medication;
}
