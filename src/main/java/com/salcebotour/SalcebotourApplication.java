package com.salcebotour;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class SalcebotourApplication {

	public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load();

        SpringApplication.run(SalcebotourApplication.class, args);
	}

}
