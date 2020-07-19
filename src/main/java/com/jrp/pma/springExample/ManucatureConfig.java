package com.jrp.pma.springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManucatureConfig {

	@Bean
	public Car newCar() {
		Doors door = new Doors();
		Engine engine = new Engine();
		Tires tires = new Tires();
		return new Car(door, engine, tires);
	}
	
}
