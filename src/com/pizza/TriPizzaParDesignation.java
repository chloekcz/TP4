package com.pizza;

import java.util.Comparator;

public class TriPizzaParDesignation implements Comparator<Pizza> {

	@Override
	public int compare(Pizza arg0, Pizza arg1) {

		if (arg0.getDesignation().compareTo(arg1.getDesignation()) > 1) {
			
			return 1;
			
		} else if (arg0.getDesignation().compareTo(arg1.getDesignation()) < 1) {
			
			return -1;
			
		} else {
			
			return 0;
			
		}
	}

}
