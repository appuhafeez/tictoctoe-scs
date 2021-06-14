package io.github.appuhafeez.tiktoktoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TictoctoeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictoctoeConfigServerApplication.class, args);
	}

}
