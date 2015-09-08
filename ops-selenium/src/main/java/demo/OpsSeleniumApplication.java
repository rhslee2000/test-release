package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpsSeleniumApplication {

	@Bean
	WebDriver webDriver() {
		// TODO setup capabilities
		// some change for 0.0.2
		return new ChromeDriver();
	}

	public static void main(String[] args) {
		SpringApplication.run(OpsSeleniumApplication.class, args);
	}
}
