package io.swagger.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;


public class MongodbConfig {
	@ComponentScan
	@Configuration
	@EnableMongoRepositories (basePackages = { "io.swagger", "io.swagger.api", "io.swagger.service" })
	public class dbConfig extends AbstractMongoConfiguration {

		
		@Bean
		@Override	
		public MongoClient mongoClient() {
			return new MongoClient("127.0.0.1", 27017);
		}

		@Override
		protected String getDatabaseName() {
			return "test";
		}

	}
}
