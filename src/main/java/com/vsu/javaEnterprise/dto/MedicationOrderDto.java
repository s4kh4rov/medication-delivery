package com.vsu.javaEnterprise.dto;

import lombok.Data;

import java.util.Set;

@Data
public class MedicationOrderDto {
    private Long customerId;
    private Set<OrderItemDto> items;
}
