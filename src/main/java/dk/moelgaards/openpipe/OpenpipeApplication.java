package dk.moelgaards.openpipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dk.moelgaards.openpipe")
public class OpenpipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenpipeApplication.class, args);
	}

}
