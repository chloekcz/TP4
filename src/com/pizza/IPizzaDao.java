package com.pizza;

import java.util.List;

public interface IPizzaDao {

	List<Pizza> findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);
	boolean isPizzaExists(String codePizza);

	
}
