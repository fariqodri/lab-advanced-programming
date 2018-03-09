package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.BunCheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FreshClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.SpoiledClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.CrustyKrabDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.UnSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.BlackOlives;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Eggplant;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.PondokCabe;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;

public class DepokIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CrustyKrabDough();
    }

    @Override
    public Cheese createCheese() {
        return new BunCheese();
    }

    @Override
    public Clams createClam() {
        return new SpoiledClams();
    }

    @Override
    public Sauce createSauce() {
        return new UnSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Eggplant(), new PondokCabe()};
        return veggies;
    }
}
