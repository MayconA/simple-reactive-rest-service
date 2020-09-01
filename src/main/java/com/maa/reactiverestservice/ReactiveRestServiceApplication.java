package com.maa.reactiverestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maa.reactiverestservice.hello.GreetingWebClient;

@SpringBootApplication
public class ReactiveRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestServiceApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
