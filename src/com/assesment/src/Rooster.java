package com.assesment.src;

public class Rooster extends Bird implements IRooster{

	@Override
	public void isRooster(boolean flag) {
		if(flag) {
			System.out.println("This is a Rooster!");
		}else {
			System.out.println("This is not a Rooster!");
		}
	}

	@Override
	public void sing() {
		System.out.println("Rooster: Cock-a-doodle-doo!");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
