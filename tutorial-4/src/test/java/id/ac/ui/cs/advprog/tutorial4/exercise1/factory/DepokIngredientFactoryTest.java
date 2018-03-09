package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DepokIngredientFactoryTest {
    private DepokIngredientFactory depokIngredientFactory;
    private String ingredients;
    @BeforeEach
    void setUp() {
        depokIngredientFactory = new DepokIngredientFactory();
    }

    @Test
    void createDough() {
        ingredients = depokIngredientFactory.createDough().toString();
        assertEquals("Crusty Krab Dough", ingredients);
    }

    @Test
    void createCheese() {
        ingredients = depokIngredientFactory.createCheese().toString();
        assertEquals("Bun Cheese", ingredients);
    }

    @Test
    void createClam() {
        ingredients = depokIngredientFactory.createClam().toString();
        assertEquals("Spoiled Clam from Karimun Jawa", ingredients);
    }

    @Test
    void createSauce() {
        ingredients = depokIngredientFactory.createSauce().toString();
        assertEquals("Ansos Sauce", ingredients);
    }

    @Test
    void createVeggies() {
        Veggies[] veggies = depokIngredientFactory.createVeggies();
        String[] strings = {"Black Olives", "Eggplant", "Very Hot Cabe"};
        assertEquals(Arrays.toString(strings), Arrays.toString(veggies));
    }
}