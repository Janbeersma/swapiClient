package com.example.florian.swapiClient;

import domain.ConcretePerson;
import domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import service.ConcreteDatabaseService;
import service.ConcretePersonservice;

import java.util.List;
import java.util.Optional;

/**
 * the main functie that uses the person search function to search for a person append that search to the analytics db and gets those db rows and deletes one, channge the id of the delete function with an existing id in the db
 *
 */
@SpringBootApplication
public class SwapiClientApplication {
	private static final Logger log = LoggerFactory.getLogger(SwapiClientApplication.class);
	public static void main(String[] args) {
		ConcretePersonservice personservice = new ConcretePersonservice();

		//function for getting a person based on id from the star wars api
		Optional<Person> person = personservice.get(1);

		List<ConcretePerson> searchResults = personservice.search("verwijder deze entry");
		ConcreteDatabaseService databaseService = new ConcreteDatabaseService();
		databaseService.getFromDB();

		//change this id
		databaseService.deleteFromDB(1);

		databaseService.getFromDB();
		SpringApplication.run(SwapiClientApplication.class, args);
	}
}
