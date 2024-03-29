package net.ghilaste.inventoryservice.repository;

import net.ghilaste.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
