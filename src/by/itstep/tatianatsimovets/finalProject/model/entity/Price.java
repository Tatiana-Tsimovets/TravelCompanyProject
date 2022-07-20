package by.itstep.tatianatsimovets.finalProject.model.entity;

public class Price {
    public static final double EXCURSION_PROGRAM = 1.5;
    public static final double OTHER_EXPENSES = 1.2;
    public static final double MIN_TOUR_PRICE = 65;
    private double tourPrice;


    public Price(double tourPrice) {
        this.tourPrice = tourPrice;
    }

    public double getTourPrice() {
        return tourPrice * EXCURSION_PROGRAM * OTHER_EXPENSES;
    }

    public void setTourPrice(double tourPrice) {
        if (tourPrice >= MIN_TOUR_PRICE) {
            this.tourPrice = tourPrice;
        }
    }
}

