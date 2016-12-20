package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sides {
	
	List<Integer> sides;
	Integer points=0;

	private Integer get(Integer i) {
		return sides.get(i);
	}

	public Integer getPoints() {
		
		if (match(new Sides(1,1,1)) == 0) {
			remove(new Sides(1,1,1));
			points=1000;
		} else if (match(new Sides(2,2,2)) == 0) {
			points=200;
			remove(new Sides(2,2,2));
		} else if (match(new Sides(3,3,3)) == 0) {
			remove(new Sides(3,3,3));
			points=300;
		} else if (match(new Sides(4,4,4)) == 0) {
			remove(new Sides(4,4,4));
			points=400;
		} else if (match(new Sides(5,5,5)) == 0) {
			remove(new Sides(5,5,5));
			points=500;
		} else if (match(new Sides(6,6,6)) == 0) {
			remove(new Sides(6,6,6));
			points=600;
		}
		
		
		for (int i=0;i<size();i++) {
				
			switch(get(i)) {
			case 1:
				points+=100;
				break;
			case 4:
				points+=40;
				break;
			default:
				points+=0;
				break;
			}
			
		}
		
		return points;
		
	}

	private void remove(Sides sides2) {
		
	}
	
	public Sides(Integer... i) {
		sides = new ArrayList<>();
		for (int ii = 0;ii<i.length;ii++)
			sides.add(i[ii]);
		
		Collections.sort(sides);
	}
	
	private Integer size() {
		return sides.size();
	}
	

	public String toString() {
		return ""+sides+"\n"+points;
	}
	
	private Integer match(Sides s) {
		
		return 1;
	}
	
}


