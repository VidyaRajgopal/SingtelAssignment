package com.assesment.src;

public class Parrot extends Bird implements IParrot{

	@Override
	public String getType(String type) {
		String sound = "";
		if(type.equalsIgnoreCase("with Dogs")) {
			sound = "Parrot living with Dogs: Woof, woof!";
		}else if(type.equalsIgnoreCase("with Cats")){
			sound = "Parrot living with Cats: Meow!";
		}else if(type.equalsIgnoreCase("with Rooster")){
			sound = "Parrot living with Rooster: Cock-a-doodle-doo!";
		}
		return sound;
	}

	@Override
	public void sing() {
		
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
