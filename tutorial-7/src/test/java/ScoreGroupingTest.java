import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ScoreGroupingTest {
    // TODO Implement me!
    // Increase code coverage in ScoreGrouping class
    // by creating unit test(s)!
    private final Map<String, Integer> scores = new HashMap<>();

    @Test
    public void groupTest() {
        scores.put("A", 12);
        scores.put("B", 12);
        scores.put("C", 11);
        scores.put("D", 11);
        scores.put("E", 10);
        scores.put("F", 10);

        assertEquals("{10=[E, F], 11=[C, D], 12=[A, B]}", ScoreGrouping.groupByScores(scores).toString());
    }
}