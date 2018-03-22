import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();
    private int frequentRenterPoints;

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
        double totalAmount = 0;
//        int frequentRenterPoints = 0;

        Iterator<Rental> iterator = rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (iterator.hasNext()) {
            Rental each = iterator.next();
            double thisAmount;

            // Determine amount for each line
            thisAmount = each.determineAmount();
            // Add frequent renter points
            setFrequentRenterPoints(each.addFrequentRenterPoints(getFrequentRenterPoints()));

            totalAmount+=thisAmount;

            // Add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1)
                setFrequentRenterPoints(each.addFrequentRenterPoints(frequentRenterPoints));

            // Show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
        }

        // Add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double totalAmount(){
        return 0;
    }

    private int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    private void setFrequentRenterPoints(int change){
        frequentRenterPoints += change;
    }
}