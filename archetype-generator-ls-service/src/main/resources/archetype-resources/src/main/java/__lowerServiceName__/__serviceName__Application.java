package ${groupId}.${lowerServiceName};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"${package}.shared.*",
		"${package}.config.*"		})
public class ${serviceName}Application {

	public static void main(String[] args) {
		SpringApplication.run(${serviceName}Application.class, args);
	}

}
