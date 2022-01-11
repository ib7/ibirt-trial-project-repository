package com.birt.undark.dto;

import com.birt.undark.jpa.enums.AccessoriesCategory;
import com.birt.undark.jpa.enums.Manufacturer;
import com.birt.undark.jpa.enums.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// UPD 08\01\22

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccessoryDTO {
    private long id;
    private String title;
    private Double price;
    private String color;
    private Manufacturer manufacturer;
    private Material material;
    private AccessoriesCategory accessoriesCategory;
}
