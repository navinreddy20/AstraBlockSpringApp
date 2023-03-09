package com.telusko.AstraBlockSpringApp;

import com.datastax.oss.driver.api.core.CqlSession;
import com.telusko.AstraBlockSpringApp.tokens.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.core.CassandraTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AstraBlockSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstraBlockSpringAppApplication.class, args);
	}

}
