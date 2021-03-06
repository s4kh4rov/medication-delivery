package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.domain.MedicationOrder;
import com.vsu.javaEnterprise.domain.OrderItem;
import com.vsu.javaEnterprise.dto.MedicationOrderDto;
import com.vsu.javaEnterprise.enums.OrderStatus;
import com.vsu.javaEnterprise.mapper.MedicationOrderMapper;
import com.vsu.javaEnterprise.repository.MedicationOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicationOrderService {
    private final MedicationOrderRepository medicationOrderRepository;
    private final MedicationOrderMapper orderMapper;

    @Autowired
    public MedicationOrderService(MedicationOrderRepository medicationOrderRepository, MedicationOrderMapper orderMapper) {
        this.medicationOrderRepository = medicationOrderRepository;
        this.orderMapper = orderMapper;
    }

    public Long saveOrder(MedicationOrderDto orderDto) {
        Double orderPrice = 0.0;
        MedicationOrder order = orderMapper.toMedicationOrder(orderDto);
        order.setOrderStatus(OrderStatus.CREATED);
        for (OrderItem item : order.getItems()) {
            item.setOrder(order);
            orderPrice+=item.getMedication().getPrice()*item.getMedication().getConsignment().getDiscountRate()*item.getAmount();
        }
        order.setOrderPrice(orderPrice);
        return medicationOrderRepository.save(order).getId();

    }
}
