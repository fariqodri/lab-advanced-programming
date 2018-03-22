import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    // TODO: Remove redundancy in setting up test fixture in each test methods
    // Hint: Make the test fixture into an instance variable

    private Movie movie;
    private Customer customer;
    private Rental rent;

    @Before
    public void setUp() throws Exception {
        movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        customer = new Customer("Alice");
        rent = new Rental(movie, 3);
    }

    @Test
    public void getName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    public void statementWithSingleMovie() {
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");
        System.out.println(result);
        assertEquals(4, lines.length);
        assertTrue(result.contains("Amount owed is 3.5"));
        assertTrue(result.contains("1 frequent renter points"));
    }

    // TODO Implement me!
    @Test
    public void statementWithMultipleMovies() {
        // TODO Implement me!
        customer.addRental(rent);
        movie = new Movie("Blade Runner", Movie.REGULAR);
        rent = new Rental(movie, 3);
        customer.addRental(rent);

        String result = customer.statement();
        String[] lines = result.split("\n");
        System.out.println(result);
        assertEquals(5, lines.length);
        assertTrue(result.contains("Amount owed is 7"));
        assertTrue(result.contains("3 frequent renter points"));
    }
}