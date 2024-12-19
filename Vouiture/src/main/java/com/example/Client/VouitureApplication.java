package com.example.Client;

import com.example.Client.entities.Client;
import com.example.Client.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class VouitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VouitureApplication.class, args);
	}

		@Bean
		CommandLineRunner initializeBaseH2(VoitureRepository voitureRepository) {
			return args -> {
				voitureRepository.save(new Client(null, "Rabab SELIMANI", 23f));
				voitureRepository.save(new Client(null, "Arra RAMI", 22f));
				voitureRepository.save(new Client(null, "Samir SAFI", 22f));
			};
		}


}
