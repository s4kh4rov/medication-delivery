package com.vsu.javaEnterprise.mapper;

import com.vsu.javaEnterprise.domain.Medication;
import com.vsu.javaEnterprise.dto.MedicationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;


@Mapper(componentModel = "spring")
public interface MedicationMapper {
    @Mapping(source = "medication",target = "price",qualifiedByName = "priceDto")
    @Mapping(source = "consignment.amount",target = "amount")
    MedicationDto toMedicationDto(Medication medication);

    List<MedicationDto> toMedicationDtos(List<Medication> medications);

    @Named("priceDto")
    default Double priceToPriceDto(Medication medication) {
        return medication.getPrice() * medication.getConsignment().getDiscountRate();
    }
}
