package org.sid.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
    @Bean
	CommandLineRunner start(CostumerRepository costumerRepository){
	    return  args -> {
	        costumerRepository.save(new Customer(null,"Ensa","Ensa@mail.com"));
            costumerRepository.save(new Customer(null,"Fst","fst@mail.com"));
            costumerRepository.save(new Customer(null,"encg","encg@mail.com"));
            costumerRepository.save(new Customer(null,"emmi","emmi@mail.com"));

        };
    }
}
