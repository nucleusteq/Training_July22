package com.nt.training.VendingMachine.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.training.VendingMachine.repository.VendorRepository;
import com.nt.training.VendingMachine.vendor.Vendor;

@Configuration
public class VendorConfig {
	@Bean
	CommandLineRunner clr(VendorRepository repository) {
		return args -> {
			Vendor water = new Vendor(
					101L,
					"Water Bottle",
					20,
					10
					);
			Vendor lays = new Vendor(
					102L,
					"Lays Masala",
					20,
					10
					);
			Vendor kurkure = new Vendor(
					103L,
					"Kurkure Masala",
					20,
					10
					);
			Vendor Parleg = new Vendor(
					104L,
					"Parle G",
					10,
					10
					);
			Vendor biscuit = new Vendor(
					105L,
					"50-50 Biscuit",
					10,
					10
					);
			Vendor chocolate = new Vendor(
					106L,
					"Dairy Milk",
					50,
					10
					);
			Vendor namkeen = new Vendor(
					107L,
					"Aloo Bhujia",
					10,
					10
					);
			Vendor sev = new Vendor(
					108L,
					"Ratlami Sev",
					10,
					10
					);
			Vendor peanuts = new Vendor(
					109L,
					"Tasty Masala Peanuts",
					10,
					10
					);
			Vendor munch = new Vendor(
					110L,
					"Nestle Munch",
					5,
					10
					);
			repository.saveAll(
					List.of(water, lays, kurkure, Parleg, biscuit, chocolate, namkeen, sev, peanuts, munch));
					
		};
	}
	
}
