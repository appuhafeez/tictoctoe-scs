package io.github.appuhafeez.tiktoktoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
//@CrossOrigin(origins = "${allowed.origins:*}",allowedHeaders = "*")
public class TictoctoeZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictoctoeZuulProxyApplication.class, args);
	}

}
