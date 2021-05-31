package de.karriereTutor.learngroup.luigisPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LuigisPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuigisPizzaApplication.class, args);
	}
	/* you need to fill out the resources.application.properties
	you also need to create a postgreSQL database containing a table called student
	adjust	spring.datasource.url=jdbc:postgresql://localhost:5432/luigis_pizza   ... change luigis_pizza to your database name
	*/
}
