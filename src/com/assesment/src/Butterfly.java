package com.assesment.src;

public class Butterfly extends Bird implements Metamorphosis{

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activity() {
		System.out.println("Butterfly can fly and does not make sound");
	}

	@Override
	public void fly() {
		System.out.println("Butterfly can fly!");
	}

}
