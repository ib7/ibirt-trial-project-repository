package com.birt.undark.jpa.models;

import com.birt.undark.jpa.enums.AccessoriesCategory;
import com.birt.undark.jpa.enums.Manufacturer;
import com.birt.undark.jpa.enums.Material;
import com.birt.undark.jpa.enums.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

// UPD 08\01\22 +[Refactor class name]
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
public class Accessory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private String color;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private Manufacturer manufacturer;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private Material material;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private AccessoriesCategory accessoriesCategory;

    //TODO
//    @ManyToMany(mappedBy = "accessoriesApplyTo")
//    private Collection <Phone> phonesAppliedTo;
}
