package com.birt.undark.jpa.models;

import com.birt.undark.jpa.enums.Manufacturer;
import com.birt.undark.jpa.enums.Material;
import com.birt.undark.jpa.enums.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
public class Phone {
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
    private String cpu;
    @Column
    private Integer ram;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private Manufacturer manufacturer;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private Material material;
    @Column
    private Double displayResolution;

    //TODO
//    @ManyToMany
//    @JoinTable(
//            name = "phone_accessories_comb",
//            joinColumns = @JoinColumn(name = "phone_id"),
//            inverseJoinColumns = @JoinColumn(name = "accessory_id"))
//    private Collection <Accessories> accessoriesApplyTo;
}