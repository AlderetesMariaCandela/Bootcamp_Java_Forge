package como.alderetesmaria.maestro;

public class Human {
	
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	//get
	public int getHealth() {
		return health;
	}
	//set
	public void setHealth(int nivel) {
		health = nivel;
	}
	public void attack(Human atacado) {
		atacado.setHealth(atacado.getHealth()-this.strength);
		
	}

}
