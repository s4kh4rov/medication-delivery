package com.vsu.javaEnterprise.controller;

import com.vsu.javaEnterprise.domain.MedicationOrder;
import com.vsu.javaEnterprise.dto.MedicationDto;
import com.vsu.javaEnterprise.dto.MedicationOrderDto;
import com.vsu.javaEnterprise.mapper.MedicationOrderMapper;
import com.vsu.javaEnterprise.mapper.OrderItemMapper;
import com.vsu.javaEnterprise.service.MedicationOrderService;
import com.vsu.javaEnterprise.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderItemMapper orderItemMapper;
    private final MedicationOrderMapper medicationOrderMapper;
    private final MedicationOrderService medicationOrderService;
    private final MedicationService medicationService;

    @Autowired
    public OrderController(OrderItemMapper orderItemMapper, MedicationOrderMapper medicationOrderMapper, MedicationOrderService medicationOrderService, MedicationService medicationService) {
        this.orderItemMapper = orderItemMapper;
        this.medicationOrderMapper = medicationOrderMapper;
        this.medicationOrderService = medicationOrderService;
        this.medicationService = medicationService;
    }
    @GetMapping("/medications/all")
    public ResponseEntity<List<MedicationDto>> getMedications(){
        return new ResponseEntity<>(medicationService.getAll(),HttpStatus.OK);
    }
    @PostMapping("/order/save")
    public ResponseEntity<MedicationOrder> saveOrder(@RequestBody MedicationOrderDto orderDto){
        medicationOrderService.saveOrder(orderDto);
        return new ResponseEntity<>(medicationOrderMapper.toMedicationOrder(orderDto), HttpStatus.OK);
    }
}
