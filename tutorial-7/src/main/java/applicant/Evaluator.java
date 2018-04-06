package applicant;

import java.util.function.Predicate;

public interface Evaluator {

    boolean evaluate(Applicant applicant);
}
