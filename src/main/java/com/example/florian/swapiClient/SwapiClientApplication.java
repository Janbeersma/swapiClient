package com.example.florian.swapiClient;

import domain.ConcretePerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import service.ConcretePersonservice;

@SpringBootApplication
public class SwapiClientApplication {
	private static final Logger log = LoggerFactory.getLogger(SwapiClientApplication.class);
	public static void main(String[] args) {
		ConcretePersonservice personservice = new ConcretePersonservice();
		personservice.get(1);
		SpringApplication.run(SwapiClientApplication.class, args);
	}
}
