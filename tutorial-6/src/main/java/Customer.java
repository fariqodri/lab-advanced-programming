import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Iterator<Rental> iterator = rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (iterator.hasNext()) {
            Rental each = iterator.next();

            // Determine amount for each line
            double thisAmount = each.determineAmount();

            // Show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
        }

        // Add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints())
                + " frequent renter points";

        return result;
    }

    public int frequentRenterPoints() {
        Iterator<Rental> iter = rentals.iterator();
        int res = 0;
        while (iter.hasNext()) {
            Rental each = iter.next();
            res = each.addFrequentRenterPoints(res);
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    && each.getDaysRented() > 1) {
                res = each.addFrequentRenterPoints(res);
            }
        }
        return res;
    }

    public double totalAmount() {
        Iterator<Rental> iter = rentals.iterator();
        double res = 0;
        while (iter.hasNext()) {
            Rental each = iter.next();
            res += each.determineAmount();
        }
        return res;
    }

}