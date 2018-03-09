package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewYorkPizzaStoreTest {
    @Test
    void canOrderPizza() {
        assertNotNull(new NewYorkPizzaStore().orderPizza("cheese"));
    }
}