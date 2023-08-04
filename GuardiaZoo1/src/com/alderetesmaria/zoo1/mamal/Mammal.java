package com.alderetesmaria.zoo1.mamal;

public class Mammal {
	
	private int energyLevel = 100;
	
	//get
	public int getEnergyLevel() {
		return energyLevel;
	}
	//set
	public void setEnergyLevel(int nivel) {
		energyLevel = nivel;
	}
	
	public String desiplayEnergy() {
		return "El nivel de energia es de " + energyLevel;
	}

}
