package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepokPizzaStoreTest {

    @Test
    void canOrderPizza() {
        DepokPizzaStore depokPizzaStore = new DepokPizzaStore();
        assertNotNull(depokPizzaStore.orderPizza("cheese"));
    }
}