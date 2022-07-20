package by.itstep.tatianatsimovets.finalProject.model.entity;

import by.itstep.tatianatsimovets.finalProject.model.entity.TourCategoryEnum;

public class Journey {
    private int distance;

    public Journey(TourCategoryEnum category, TourEnum tourName, double journeyPrice, int distance) {
        super(category, tourName, journeyPrice);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + distance + " km)";
    }
}

