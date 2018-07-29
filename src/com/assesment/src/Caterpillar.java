package com.assesment.src;

public class Caterpillar extends Animal implements Metamorphosis{

	@Override
	public void activity() {
		System.out.println("Caterpillar can walk but cannot fly!");
	}

}
