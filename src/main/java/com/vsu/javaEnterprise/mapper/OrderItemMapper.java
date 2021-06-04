package com.vsu.javaEnterprise.mapper;

import com.vsu.javaEnterprise.domain.Medication;
import com.vsu.javaEnterprise.domain.OrderItem;
import com.vsu.javaEnterprise.dto.OrderItemDto;
import com.vsu.javaEnterprise.service.MedicationService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {MedicationService.class})
public interface OrderItemMapper {
    OrderItemDto toOrderItemDto(OrderItem orderItem);

    List<OrderItemDto> toOrderItemDtos(List<OrderItem> items);

    @Mapping(source = "medicationId", target = "medication")
    OrderItem toOrderItem(OrderItemDto orderItemDto);
}
