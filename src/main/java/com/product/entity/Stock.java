package com.product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_stocks", schema = "product_ms")
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false, unique = true)
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer minimumQuantity;

    @Column(nullable = false)
    private String location;
} 