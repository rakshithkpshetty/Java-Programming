package tutorial.springbootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringbootAppplication {
	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(FirstSpringbootAppplication.class,args);
		
	}

}
