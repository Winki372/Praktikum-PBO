class Book extends LibraryItem implements Penalty{
double pricePerDay;

Book(String title, double pricePerDay){
super(title);
this.pricePerDay = pricePerDay;
}

    @Override
    double getBorrowCost() {
        return pricePerDay;
    }

    @Override
    public double calculatePenalty(int lateDays) {
    return 1000 * lateDays;
    }
}