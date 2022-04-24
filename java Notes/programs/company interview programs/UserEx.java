//package com.exception 

class AgeInvalid extends RuntimeException {

	AgeInvalid(){
		super("not allowed to vote");
	}

	AgeInvalid(String message){
		super(message);
	}
}
	

class UserEx{

public static void main(String[] args){
	int a=17;

		try{
		if(a < 18 ){
			throw new AgeInvalid();
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	

	System.out.println(" mina end ");

}
}