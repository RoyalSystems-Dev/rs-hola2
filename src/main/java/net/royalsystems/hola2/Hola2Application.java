package net.royalsystems.hola2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration
public class Hola2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Hola2Application.class, args);
	}

}
