package org.sid.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProduitRepository produitRepository){
		return args -> {
			produitRepository.save(new Product(null, "HP 4300 ", 147.25));
			produitRepository.save(new Product(null, "Canon ", 452.25));
			produitRepository.save(new Product(null, "Ipad ", 720.25));
			produitRepository.save(new Product(null, "HP 43 ", 155.25));
		};
	}
}
