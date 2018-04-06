package applicant;

import java.util.function.Predicate;

/**
 * 4th exercise.
 */
public class Applicant {

    public boolean isCredible() {
        return true;
    }

    public int getCreditScore() {
        return 700;
    }

    public int getEmploymentYears() {
        return 10;
    }

    public boolean hasCriminalRecord() {
        return true;
    }

    public static boolean evaluate(Applicant applicant, Evaluator evaluator) {
        return evaluator.evaluate(applicant);
    }

    private static void printEvaluation(boolean result) {
        String msg = "Result of evaluating applicant: %s";
        msg = result ? String.format(msg, "accepted") : String.format(msg, "rejected");

        System.out.println(msg);
    }

    public static void main(String[] args) {
        Applicant applicant = new Applicant();

        Predicate<Applicant> checkCredit = applicant1 -> applicant1.getCreditScore() > 600;

        Predicate<Applicant> checkCriminal = applicant1 -> !applicant1.hasCriminalRecord();

        Predicate<Applicant> checkEmployment = applicant1 -> applicant1.getEmploymentYears() > 0;

        evaluate(applicant, (Evaluator) checkCredit);

        evaluate(applicant, (Evaluator) checkCriminal);

        evaluate(applicant, (Evaluator) checkEmployment);
//        printEvaluation(evaluate(applicant, new CreditEvaluator(new QualifiedEvaluator())));
//        printEvaluation(evaluate(applicant,
//                new CreditEvaluator(new EmploymentEvaluator(new QualifiedEvaluator()))));
//        printEvaluation(evaluate(applicant,
//                new CriminalRecordsEvaluator(
//                        new EmploymentEvaluator(new QualifiedEvaluator()))));
//        printEvaluation(evaluate(applicant,
//                new CriminalRecordsEvaluator(
//                        new CreditEvaluator(
//                                new EmploymentEvaluator(new QualifiedEvaluator())))));
    }
}
