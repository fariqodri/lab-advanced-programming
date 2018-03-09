package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NewYorkPizzaIngredientFactoryTest {
    private NewYorkPizzaIngredientFactory newYorkPizzaIngredientFactory;
    private String ingredients;
    @BeforeEach
    void setUp() {
        newYorkPizzaIngredientFactory = new NewYorkPizzaIngredientFactory();

    }

    @Test
    void createDough() {
        ingredients = newYorkPizzaIngredientFactory.createDough().toString();
        assertEquals("Thin Crust Dough", ingredients);
    }

    @Test
    void createSauce() {
        ingredients = newYorkPizzaIngredientFactory.createSauce().toString();
        assertEquals("Marinara Sauce", ingredients);
    }

    @Test
    void createCheese() {
        ingredients = newYorkPizzaIngredientFactory.createCheese().toString();
        assertEquals("Reggiano Cheese", ingredients);

    }

    @Test
    void createVeggies() {
        Veggies[] veggies = newYorkPizzaIngredientFactory.createVeggies();
        String[] strings = {"Garlic", "Onion", "Mushrooms", "Red Pepper"};
        assertEquals(Arrays.toString(strings), Arrays.toString(veggies));
    }

    @Test
    void createClam() {
        ingredients = newYorkPizzaIngredientFactory.createClam().toString();
        assertEquals("Fresh Clams from Long Island Sound", ingredients);
    }
}