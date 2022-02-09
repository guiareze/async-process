package br.com.guiareze.asyncprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncprocessApplication.class, args);
	}

}
