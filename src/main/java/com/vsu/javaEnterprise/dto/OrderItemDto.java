package com.vsu.javaEnterprise.dto;

import lombok.Data;

@Data
public class OrderItemDto {
    private Integer amount;
    private Long medicationId;
}
