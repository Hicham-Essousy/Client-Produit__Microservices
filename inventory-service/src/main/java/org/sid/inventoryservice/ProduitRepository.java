package org.sid.inventoryservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Product, Long> {
    
}
