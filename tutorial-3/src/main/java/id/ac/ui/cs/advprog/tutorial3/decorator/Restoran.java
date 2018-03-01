package id.ac.ui.cs.advprog.tutorial3.decorator;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.CrustySandwich;
import id.ac.ui.cs.advprog.tutorial3.decorator.bread.NoCrustSandwich;
import id.ac.ui.cs.advprog.tutorial3.decorator.bread.ThickBunBurger;
import id.ac.ui.cs.advprog.tutorial3.decorator.bread.ThinBunBurger;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.*;

public class Restoran {
    public static void main(String[] args) {
        ThinBunBurger bunBurger = new ThinBunBurger();
        Cheese cheese = new Cheese(bunBurger);
        System.out.println(cheese.getDescription());
        System.out.println("Harga: " + cheese.cost());

        ThickBunBurger thickBunBurger = new ThickBunBurger();
        BeefMeat beefMeat = new BeefMeat(thickBunBurger);
        System.out.println(beefMeat.getDescription());
        System.out.println("Harga: " + beefMeat.cost());

        CrustySandwich crustySandwich = new CrustySandwich();
        ChickenMeat chickenMeat = new ChickenMeat(crustySandwich);
        System.out.println(chickenMeat.getDescription());
        System.out.println("Harga: " + chickenMeat.cost());

        NoCrustSandwich noCrustSandwich = new NoCrustSandwich();
        Cucumber cucumber = new Cucumber(noCrustSandwich);
        System.out.println(cucumber.getDescription());
        System.out.println("Harga: " + cucumber.cost());

        ChiliSauce chiliSauce = new ChiliSauce(crustySandwich);
        Lettuce lettuce = new Lettuce(noCrustSandwich);
        Tomato tomato = new Tomato(thickBunBurger);
        TomatoSauce tomatoSauce = new TomatoSauce(bunBurger);
        System.out.println(chiliSauce.getDescription());
        System.out.println("Harga: " + chiliSauce.cost());
        System.out.println(lettuce.getDescription());
        System.out.println("Harga: " + lettuce.cost());
        System.out.println(tomato.getDescription());
        System.out.println("Harga: " + tomato.cost());
        System.out.println(tomatoSauce.getDescription());
        System.out.println("Harga: " + tomatoSauce.cost());
    }
}
