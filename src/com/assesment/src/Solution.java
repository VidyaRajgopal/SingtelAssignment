package com.assesment.src;

public class Solution {
	public static void main(String[] args) {
		/* --Task1-- */
		/*Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing(); */
		
		/*-- Task2 --*/
		Bird duck = new Duck();
		duck.sing();
		duck.swim();
		
		Bird chicken = new Chicken();
		chicken.sing();
		
		/*-- Task3 --*/
		Bird rooster = new Rooster();
		rooster.sing();
		
		/*-- Task4 --*/
		Parrot p1 = new Parrot();
		System.out.println(p1.getType("with Dogs"));
		
		Parrot p2 = new Parrot();
		System.out.println(p2.getType("with Cats"));
		
		Parrot p3 = new Parrot();
		System.out.println(p3.getType("with Rooster"));

		Fish shark = new Shark();
		shark.size();
		shark.activity();
		
		Fish clownfish = new ClownFish();
		clownfish.size();
		clownfish.activity();
		
		Bird butterfly = new Butterfly();
		butterfly.fly();
		
		MetamorphosisStage ms = new MetamorphosisStage();
		Metamorphosis bfly = ms.getStage("Butterfly");
		bfly.activity();
		
		Metamorphosis caterpillar = ms.getStage("Caterpillar");
		caterpillar.activity();
		
		
	}
}
