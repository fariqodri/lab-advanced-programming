package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.DepokIngredientFactory;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.CheesePizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.ClamPizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.VeggiePizza;

public class DepokPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        DepokIngredientFactory depokIngredientFactory = new DepokIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(depokIngredientFactory);
            pizza.setName("Krusty Krab Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(depokIngredientFactory);
            pizza.setName("Krusty Krab Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(depokIngredientFactory);
            pizza.setName("Krusty Krab Style Clam Pizza");
        }
        return pizza;
    }
}
