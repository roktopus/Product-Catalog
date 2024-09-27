package com.example.ProductCatalogService.TableInheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name ="tpc_ta")
public class Ta extends User{
    private Double ratings;
}
