package com.product.shopinsta.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(nullable = false)
    private String productName;

    @OneToOne(mappedBy = "product")
    private ProductCategory productCategory;

    private String productDescription;

    private String units;

}
