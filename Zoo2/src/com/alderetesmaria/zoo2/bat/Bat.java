package com.alderetesmaria.zoo2.bat;

public class Bat extends Extraño{
	
	//volar
	public String fly() {
		setEnergyLevel(getEnergyLevel()-50);
		return "El Bat despega, su nivel de energía disminuyó 50...";
	}
	//comer
	public String eatHumans() {
		setEnergyLevel(getEnergyLevel()+25);
		return "Bueno, no importa...Su nivel de energía aumentó 25...";
	}
	//atacar
	public String attackTown() {
		setEnergyLevel(getEnergyLevel()-50);
		return "La ciudad está en llamas, su nivel de energía disminuyó 100...";
	}
}
