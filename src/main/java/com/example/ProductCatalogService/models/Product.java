package com.example.ProductCatalogService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String description;

    private String imageUrl;

    private Double amount;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    private Boolean isPrimeSpecific;
}
