package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class MyEurekaProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaProvideApplication.class, args);
	}

}
