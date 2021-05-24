package com.product.shopinsta.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name="productId", nullable = false, insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="categoryId", insertable = false, updatable = false)
    private Category category;
}
