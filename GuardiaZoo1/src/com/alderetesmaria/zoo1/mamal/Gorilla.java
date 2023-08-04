package com.alderetesmaria.zoo1.mamal;


public class Gorilla extends Mammal{
	
	//tirar objetos
	public String throwSomething() {
		setEnergyLevel(getEnergyLevel()-5);
		return "El gorila ha lanzado algo, su nivel de energía disminuyó 5...";
	}
	//comer bananas
	public String eatBananas() {
		setEnergyLevel(getEnergyLevel()+10);
		return "El gorila ha comido,su nivel de energía aumentó 5...";
	}
	//trepar
	public String climb() {
		setEnergyLevel(getEnergyLevel()-10);
		return "El gorila trepó un arbol, su nivel de nergía disminuyó 10...";
	}
}
