package com.alderetesmaria.maestro.human;

import como.alderetesmaria.maestro.Ninja;
import como.alderetesmaria.maestro.Samurai;
import como.alderetesmaria.maestro.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maestro de Objetos");
		
		Wizard wizard1 = new Wizard();
		Ninja ninja1 = new Ninja();
		Samurai samurai1 = new Samurai();
		
		wizard1.attack(samurai1);
		System.out.println("La salud de samura1 es de: " + samurai1.getHealth());
		System.out.println("La salud de wizard1 es de: " + wizard1.getHealth());
		System.out.println("La salud de ninja1 es de: " + ninja1.getHealth());
	}

}
