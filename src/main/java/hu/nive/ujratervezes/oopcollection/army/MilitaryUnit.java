package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
	
	int life;
	int damage;
	boolean hasArmour;

	public int doDamage() {
		return damage;
	}
	
	public void sufferDamage(int hit) {
		if (hasArmour) {
			life -= (hit / 2);
		} else {
			life -= hit;
		}
	}
	
	public int getHitPoints() {
		return life;
	}

}
