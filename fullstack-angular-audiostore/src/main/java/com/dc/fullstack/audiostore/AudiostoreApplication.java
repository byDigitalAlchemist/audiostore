package com.dc.fullstack.audiostore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class AudiostoreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AudiostoreApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}
}
