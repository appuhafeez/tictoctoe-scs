package io.github.appuhafeez.tiktoktoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TictoctoeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictoctoeEurekaServerApplication.class, args);
	}

}
