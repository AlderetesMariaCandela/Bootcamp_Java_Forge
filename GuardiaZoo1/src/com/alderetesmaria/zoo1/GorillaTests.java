package com.alderetesmaria.zoo1;

import com.alderetesmaria.zoo1.mamal.Gorilla;

public class GorillaTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		Gorilla gorilla1 = new Gorilla();
		
		String arrojar = gorilla1.throwSomething();
		System.out.println(arrojar);
		
		System.out.println(gorilla1.climb());
		System.out.println(gorilla1.eatBananas());
		System.out.println(gorilla1.throwSomething());
		System.out.println(gorilla1.throwSomething());
		System.out.println(gorilla1.eatBananas());
		
		System.out.println(gorilla1.desiplayEnergy());
	}

}
