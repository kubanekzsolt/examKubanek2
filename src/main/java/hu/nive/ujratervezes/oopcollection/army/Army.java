package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {
	
	List<MilitaryUnit> units = new ArrayList();
	
	public int getArmySize() {
		return units.size();
	}
	
	public void addUnit(MilitaryUnit unit) {
		units.add(unit);
	}

	public int getArmyDamage() {
		int sum = 0;
		for (MilitaryUnit unit : units) {
			sum += unit.doDamage();
		}
		return sum;
	}

	public void damageAll(int hit) {
		units.stream()
			.forEach(u -> u.sufferDamage(hit));
		
		units = units.stream()
				.filter(u -> u.getHitPoints() >= 25)
				.collect(Collectors.toList());
	}
}