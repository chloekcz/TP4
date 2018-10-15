package com.pizza;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		PizzaMemDao dao = new PizzaMemDao();
		System.out.println(dao.toString());
		
		Pizza pizza = dao.findPizzaByCode("REI");
		System.out.println("\r\n" + pizza.toString());
		
		dao.deletePizza(pizza.getCode());
		System.out.println("\r\n" + dao.toString());
		
		dao.saveNewPizza(pizza);
		System.out.println("\r\n" + dao.toString());
		
		Pizza pizzaTest = new Pizza("JAM", "Jambon", 13.50);
		dao.updatePizza(pizza.getCode(), pizzaTest);
		System.out.println("\r\n" + dao.toString());
		
		TriPizzaParDesignation triPizzaParDesignation = new TriPizzaParDesignation();
		Collections.sort(dao.findAllPizzas(), triPizzaParDesignation);
		System.out.println("\r\n" + dao.toString());
		
		
		TriPizzaParPrix triPizzaParPrix = new TriPizzaParPrix();
		Collections.sort(dao.findAllPizzas(), triPizzaParPrix);
		System.out.println("\r\n" + dao.toString());
		
		
		
		/**
		 * forEach
		 */
		List<String> liste = new ArrayList<String>();
		liste.add("Crudité");
		for (String nom : liste) {
			System.out.println("\r\n" + nom);
		}
	}

}
