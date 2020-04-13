package com.demo.jpa.springjpahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="com.demo.jpa.springjpahibernateexample.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	/* This will override the application server name and its port for the application runtime. */
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}
}
