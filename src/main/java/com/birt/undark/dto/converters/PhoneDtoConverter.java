package com.birt.undark.dto.converters;

import com.birt.undark.dto.PhoneDTO;
import com.birt.undark.jpa.models.Phone;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public final class PhoneDtoConverter {

    public static Phone convert(PhoneDTO phoneDto) {
        Phone phone = new Phone();
        phone.setName(phoneDto.getTitle());
        phone.setPrice(phoneDto.getPrice());
        phone.setManufacturer(phoneDto.getManufacturer());
        phone.setMaterial(phoneDto.getMaterial());

        // UPD 08\01\22 Added default values to Nullable fields.
        if (phoneDto.getColor() != null){
            phone.setColor(phoneDto.getColor());
        } else phone.setColor("default");

        if (phoneDto.getCpu() != null){
            phone.setCpu(phoneDto.getCpu());
        } else phone.setCpu("unknown");

        if (phoneDto.getRam() !=null){
            phone.setRam(phoneDto.getRam());
        } else phone.setRam(3);

        if (phoneDto.getDisplayResolution() != null){
            phone.setDisplayResolution(phoneDto.getDisplayResolution());
        } else phone.setDisplayResolution(1.3);

        return phone;
    }

    public static void convertForUpdate(PhoneDTO phoneDto, Phone phone) {
        if (phoneDto.getTitle() != null) {
            phone.setName(phoneDto.getTitle());
        }
        if (phoneDto.getPrice() != null) {
            phone.setPrice(phoneDto.getPrice());
        }
        if (phoneDto.getManufacturer() != null) {
            phone.setManufacturer(phoneDto.getManufacturer());
        }
        if (phoneDto.getMaterial() != null) {
            phone.setMaterial(phoneDto.getMaterial());
        }
        if (phoneDto.getColor() != null) {
            phone.setColor(phoneDto.getColor());
        }
        if (phoneDto.getCpu() != null) {
            phone.setCpu(phoneDto.getCpu());
        }
        if (phoneDto.getRam() != null) {
            phone.setRam(phoneDto.getRam());
        }
        if (phoneDto.getDisplayResolution() != null) {
            phone.setDisplayResolution(phoneDto.getDisplayResolution());
        }
    }
}
