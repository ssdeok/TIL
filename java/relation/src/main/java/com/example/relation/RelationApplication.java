package com.example.relation;

import com.example.relation.domain.test.Tennis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationApplication.class, args);

//		Tennis tennis = new Tennis();
//		Tennis tennis1 = new Tennis(1L,"nadal",40);
//
//		tennis.getId();
//
//		System.out.println(tennis.getId());
//
	}

}
