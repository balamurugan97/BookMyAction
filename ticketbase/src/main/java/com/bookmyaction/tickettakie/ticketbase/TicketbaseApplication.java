package com.bookmyaction.tickettakie.ticketbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = { "com.bookmyaction.tickettakie" })
@ComponentScan("com.bookmyaction.tickettakie")
@EnableJpaRepositories(basePackages = "com.bookmyaction.tickettakie")
@EntityScan(basePackages = "com.bookmyaction.tickettakie")
@EnableJpaAuditing
@EnableAsync
@EnableScheduling
public class TicketbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketbaseApplication.class, args);
	}

}
