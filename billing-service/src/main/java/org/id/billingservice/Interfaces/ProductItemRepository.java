package org.id.billingservice.Interfaces;

import org.id.billingservice.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
   public Collection<ProductItem> findByBillId(Long billID);
}
