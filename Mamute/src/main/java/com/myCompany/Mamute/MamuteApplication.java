package com.myCompany.Mamute;

import com.myCompany.Mamute.Repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MamuteApplication implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(MamuteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.logger.info("All users: {} ", personRepository.findAll());
	}
}
