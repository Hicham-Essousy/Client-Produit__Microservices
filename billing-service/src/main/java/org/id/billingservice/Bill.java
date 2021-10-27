package org.id.billingservice;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
public class Bill {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate ;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    @Transient
    private Customer customer;
    private Long customerId;

}
