package renta.auditorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"renta.auditorio.model"})
@SpringBootApplication

public class AuditorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditorioApplication.class, args);
	}

}
