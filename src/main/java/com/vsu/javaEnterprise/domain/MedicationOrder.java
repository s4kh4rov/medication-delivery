package com.vsu.javaEnterprise.domain;

import com.vsu.javaEnterprise.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
public class MedicationOrder {
    @Id
    private Long id;
   // private Customer customer;
   // private Map<Medication, Integer> medications;
    private BigDecimal orderPrice;
    private OrderStatus orderStatus;

}
