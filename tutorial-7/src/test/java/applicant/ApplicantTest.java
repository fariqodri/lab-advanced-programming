package applicant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicantTest {
    // TODO Implement me!
    // Increase code coverage in Applicant class
    // by creating unit test(s)!
    Applicant applicant;

    @BeforeEach
    void setUp() {
        applicant = new Applicant();
    }

    @Test
    void testCredible() {
        assertTrue(applicant.isCredible());
    }

    @Test
    void testCreditScore() {
        assertEquals(700, applicant.getCreditScore());
    }

    @Test
    void testEmploymentYears() {
        assertEquals(10, applicant.getEmploymentYears());
    }

    @Test
    void evaluateCreditScore() {
        assertTrue(Applicant.evaluate(applicant, applicant1 -> applicant1.getCreditScore() > 600));
    }

    @Test
    void evaluateCriminal() {
        assertFalse(Applicant.evaluate(applicant, applicant1 -> !applicant1.hasCriminalRecord()));
    }

    @Test
    void evaluateEmployment() {
        assertTrue(Applicant.evaluate(applicant, applicant1 -> applicant1.getEmploymentYears() > 0));
    }
}
