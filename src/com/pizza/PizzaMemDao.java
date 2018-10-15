package com.pizza;

import java.util.List;
import java.util.ArrayList;

public class PizzaMemDao implements IPizzaDao {

	private ArrayList<Pizza> listPizza = new ArrayList<Pizza>();

	Pizza pizza1 = new Pizza("REI", "Reine", 12);
	Pizza pizza2 = new Pizza("PEP", "Pepperoni", 13);
	Pizza pizza3 = new Pizza("FRO", "Fromage", 14);

	{
		listPizza.add(pizza1);
		listPizza.add(pizza2);
		listPizza.add(pizza3);
	}

	public List getList() {
		return listPizza;
	}

	public void setList(List list) {
		this.listPizza = (ArrayList<Pizza>) list;
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return listPizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		listPizza.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza pizzaOld = findPizzaByCode(codePizza);
		if (pizzaOld != null) {
			listPizza.remove(pizzaOld);
			listPizza.add(pizza);
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		Pizza pizza = findPizzaByCode(codePizza);
		
		if (pizza != null) {
			listPizza.remove(pizza);
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		
		boolean trouveP = false;
		Pizza result = null;
		
		for(int i = 0; i < listPizza.size() && !trouveP; i++) {
			Pizza pizza = listPizza.get(i);
			if(pizza.getCode().equalsIgnoreCase(codePizza)) {
				trouveP = true;
				result = pizza;
			}
		}
		return result;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		Pizza pizza = findPizzaByCode(codePizza);
		return pizza != null;
	}

	
	
	@Override
	public boolean isPizzaExists(String codePizza) {
		Pizza pizza = findPizzaByCode(codePizza);
		return pizza != null;
	}
	
	
	
	
	
	@Override
	public String toString() {
		String result = new String();
		
		for (Pizza pizza : listPizza) {
			result += pizza.toString() + "\r\n";
		}
		return result + "\r\n" + "\r\n";
		
	}

}
