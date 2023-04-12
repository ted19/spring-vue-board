package com.vgam.vue.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.Charset;

@SpringBootApplication
public class VueBackboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueBackboardApplication.class, args);
		System.out.println(Charset.defaultCharset().displayName());
	}

}
