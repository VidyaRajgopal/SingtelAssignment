package com.assesment.src;

public class Chicken extends Bird{
	@Override 
	public void sing() {
		System.out.println("Chciken: Cluck, cluck!");
    }

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
	public void noFly() {
		System.out.println("Chicken cannot fly!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
