package com.birt.undark.dto;

import com.birt.undark.jpa.enums.Manufacturer;
import com.birt.undark.jpa.enums.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PhoneDTO {
    private long id;
    private String title;
    private Double price;
    private Manufacturer manufacturer;
    private Material material;
    // UPD 08\01\22 Added default values to Nullable fields. in DTO converter
    private String color;
    private String cpu;
    private Integer ram;
    private Double displayResolution;

}
