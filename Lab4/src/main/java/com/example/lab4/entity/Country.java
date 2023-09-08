package com.example.lab4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcountry;

    @Column(name="country_id",nullable = false,length = 40)
    private Integer countryid;

    @Column(name="country_name",nullable = false,length = 40)
    private String countryname;

    @Column(name="region_id",nullable = false,length = 40)
    private String regionid;

}
