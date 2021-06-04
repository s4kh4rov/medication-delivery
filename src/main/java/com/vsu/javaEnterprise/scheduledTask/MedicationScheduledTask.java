package com.vsu.javaEnterprise.scheduledTask;

import com.vsu.javaEnterprise.domain.Consignment;
import com.vsu.javaEnterprise.service.ConsignmentService;
import com.vsu.javaEnterprise.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class MedicationScheduledTask {
    private final ConsignmentService consignmentService;

    @Autowired
    public MedicationScheduledTask(ConsignmentService consignmentService) {
        this.consignmentService = consignmentService;
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void updateConsignmentValidityData() {
        List<Consignment> medicationConsignment = consignmentService.findAll();
        for (Consignment c : medicationConsignment) {
            if (LocalDate.now().compareTo(c.getManufactureDate()) == 0) {
                c.setIsExpired(true);
            } else if (LocalDate.now().plusDays(30)
                    .compareTo(c.getManufactureDate().plusDays(c.getMedication().getShelfLife())) == 0) {
                c.setDiscountRate(0.5);
            }
            consignmentService.save(c);
        }
    }
}
