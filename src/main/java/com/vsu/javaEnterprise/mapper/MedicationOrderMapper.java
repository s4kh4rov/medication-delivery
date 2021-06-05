package com.vsu.javaEnterprise.mapper;

import com.vsu.javaEnterprise.domain.MedicationOrder;
import com.vsu.javaEnterprise.dto.MedicationOrderDto;
import com.vsu.javaEnterprise.service.CustomerService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class, CustomerService.class})
public interface MedicationOrderMapper {
    @Mapping(source = "customerId", target = "customer")
    MedicationOrder toMedicationOrder(MedicationOrderDto medicationOrderDto);
}
