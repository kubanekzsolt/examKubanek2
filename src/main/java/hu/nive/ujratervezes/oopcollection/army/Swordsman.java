package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

	boolean hasTarget = true;
	
	public Swordsman(boolean armour) {
		life = 100;
		damage = 10;
		hasArmour = armour;
	}	

	public void sufferDamage(int hit) {
		if (hasTarget) {
			hasTarget = false;
			return;
		}
		if (hasArmour) {
			life -= (hit / 2);
		} else {
			life -= hit;
		}
	}
}