package org.id.billingservice;

import javax.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity;
    private double price;
    @Transient
    private Product product;
    private Long productID;
    @ManyToOne
    private Bill bill;

}
