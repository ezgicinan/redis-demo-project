package ec.redis_demo_project;

import ec.redis_demo_project.SpringProperties.SpringDataProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringDataProperties.class)
public class RedisDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoProjectApplication.class, args);
	}

}
