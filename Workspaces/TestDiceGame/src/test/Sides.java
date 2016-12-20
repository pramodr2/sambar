package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Sides {
	
	List<Integer> sides;
	Integer points=0;
	
	public List<Integer> getSides() {
		return sides;
	}
	public void setSides(List<Integer> sides) {
		this.sides = sides;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

	public Sides(Integer... i) {
		sides = new ArrayList<>();
		for (int ii = 0;ii<i.length;ii++)
			sides.add(i[ii]);
		
		Collections.sort(sides);
	}
	
	public Integer getPoints(Sides result) {
		return points;
	}
}


