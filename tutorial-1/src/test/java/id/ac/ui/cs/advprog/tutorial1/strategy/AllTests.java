package id.ac.ui.cs.advprog.tutorial1.strategy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DuckTest.class, FlyBehaviorTest.class, FlyNoWayTest.class, FlyRocketPoweredTest.class,
		FlyWithWingsTest.class, MallardDuckTest.class, ModelDuckTest.class, MuteQuackTest.class,
		QuackBehaviorTest.class, QuackTest.class, SqueakTest.class })
public class AllTests {

}
