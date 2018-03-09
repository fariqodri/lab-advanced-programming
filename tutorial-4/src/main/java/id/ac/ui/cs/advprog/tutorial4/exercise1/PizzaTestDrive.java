package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        // TODO Complete me!
        // Create a new Pizza Store franchise at Depok
        PizzaStore depokStore = new DepokPizzaStore();

        Pizza pizza1 = depokStore.orderPizza("cheese");
        System.out.println("Imron ordered a " + pizza1 + "\n");

        pizza1 = depokStore.orderPizza("clam");
        System.out.println("Imron ordered a " + pizza1 + "\n");

        pizza1 = depokStore.orderPizza("veggie");
        System.out.println("Imron ordered a " + pizza1 + "\n");
    }
}
