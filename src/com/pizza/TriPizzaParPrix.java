package com.pizza;

import java.util.Comparator;

public class TriPizzaParPrix implements Comparator<Pizza> {
	
	@Override
	public int compare(Pizza o1, Pizza o2) {

		if(o1.getPrix() > o2.getPrix()) {
			
			return 1;
			
		} else if (o1.getPrix() < o2.getPrix()) {
			
			return -1;
			
		} else {
			
			return 0;
			
		}
		
	}
	
}
