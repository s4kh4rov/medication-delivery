package com.vsu.javaEnterprise.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Consignment {
    private Long id;
    private LocalDate manufactureDate;
    private Integer amount;
}
