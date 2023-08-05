package com.alderetesmaria.zoo2.bat;

public class Extraño {
	
	private int energyLevel = 300;

	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int nivel) {
		energyLevel = nivel;
	}
	public String desiplayEnergy() {
		return "El nivel de energia es de " + energyLevel;
	}
	
}
