package com.jrp.pma.springExample;

public class Car {

	private Doors door;
	private Engine engine;
	private Tires tires;

	public Car(Doors door, Engine engine, Tires tires) {
		super();
		this.door = door;
		this.engine = engine;
		this.tires = tires;
	}

	public String diplayCar() {
		
		return this.door + " " + this.engine + " " + this.tires;
	}
}
