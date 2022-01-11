package com.birt.undark.dto.converters;

import com.birt.undark.dto.AccessoryDTO;
import com.birt.undark.jpa.models.Accessory;
import lombok.NoArgsConstructor;

//UPD 08\01\22

@NoArgsConstructor
public class AccessoryDtoConverter {

    public static Accessory convert(AccessoryDTO accessoryDto) {
        Accessory accessory = new Accessory();
        accessory.setName(accessoryDto.getTitle());
        accessory.setPrice(accessoryDto.getPrice());
        accessory.setColor(accessoryDto.getColor());
        accessory.setManufacturer(accessoryDto.getManufacturer());
        accessory.setMaterial(accessoryDto.getMaterial());
        accessory.setAccessoriesCategory(accessoryDto.getAccessoriesCategory());
        return accessory;
    }

    public static void convertForUpdate(AccessoryDTO accessoryDto, Accessory accessory) {
        if (accessoryDto.getTitle() != null) {
            accessory.setName(accessoryDto.getTitle());
        }
        if (accessoryDto.getPrice() != null) {
            accessory.setPrice(accessoryDto.getPrice());
        }
        if (accessoryDto.getManufacturer() != null) {
            accessory.setManufacturer(accessoryDto.getManufacturer());
        }
        if (accessoryDto.getMaterial() != null) {
            accessory.setMaterial(accessoryDto.getMaterial());
        }
        if (accessoryDto.getAccessoriesCategory() != null) {
            accessory.setMaterial(accessoryDto.getMaterial());
        }
        if (accessoryDto.getColor() != null) {
            accessory.setColor(accessoryDto.getColor());
        }
    }
}
