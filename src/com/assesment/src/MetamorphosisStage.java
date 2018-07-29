package com.assesment.src;

public class MetamorphosisStage {

	 //use getShape method to get object of type shape 
	   public Metamorphosis getStage(String stage){
	      if(stage == null){
	         return null;
	      }		
	      if(stage.equalsIgnoreCase("Butterfly")){
	         return new Butterfly();
	         
	      } else if(stage.equalsIgnoreCase("Caterpillar")){
	         return new Caterpillar();
	         
	      } 
	      return null;
	   }
}
