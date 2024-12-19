package com.example.Client;

import com.example.Client.entities.Voiture;
import com.example.Client.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@EnableDiscoveryClient
@SpringBootApplication
public class VoitureApplication {

	@Autowired
	private VoitureRepository voitureRepository;

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

	// Bean to insert Voitures at startup
	@Bean
	public CommandLineRunner insertVoitures() {
		return (args) -> {
			Voiture voiture1 = new Voiture("Renault", "1234XYZ", "Clio", 1L, null);
			Voiture voiture2 = new Voiture("Peugeot", "5678ABC", "208", 2L, null);
			Voiture voiture3 = new Voiture("Tesla", "9123XYZ", "Model 3", 3L, null);

			// Saving voitures to the database
			voitureRepository.save(voiture1);
			voitureRepository.save(voiture2);
			voitureRepository.save(voiture3);
		};
	}
}

