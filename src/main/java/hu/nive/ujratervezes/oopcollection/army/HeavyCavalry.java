package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
	
	boolean first = true;
	
	public HeavyCavalry() {
		life = 150;
		damage = 20;
		hasArmour = true;
	}	

	public int doDamage() {
		if (first) {
			first = false;
			return 3 * damage;
		}
		return damage;
	}
	
}