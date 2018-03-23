class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double determineAmount() {
        double thisAmount = 0;
        int priceCode = getMovie().getPriceCode();
        if (priceCode == Movie.REGULAR) {
            thisAmount += 2;
            if (getDaysRented() > 2) {
                thisAmount += (getDaysRented() - 2) * 1.5;
            }
        } else if (priceCode == Movie.NEW_RELEASE) {
            thisAmount += getDaysRented() * 3;
        } else if (priceCode == Movie.CHILDREN) {
            thisAmount += 1.5;
            if (getDaysRented() > 3) {
                thisAmount += (getDaysRented() - 3) * 1.5;
            }
        }
        return thisAmount;
    }

    public int addFrequentRenterPoints(int freq) {
        return ++freq;
    }

}