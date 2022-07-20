package by.itstep.tatianatsimovets.finalProject.controller;

import by.itstep.tatianatsimovets.finalProject.model.entity.TourEnum;
import by.itstep.tatianatsimovets.finalProject.model.entity.Price;

public class CalculateTour {
    public static void main(Price[] tour) {
        double sum = 0;

        for (int i = 0; i < tour.length; i++) {
            sum += tour[i].getTourPrice();
        }

        System.out.println(sum);
    }
}
