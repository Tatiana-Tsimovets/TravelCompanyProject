package by.itstep.tatianatsimovets.finalProject.model.entity;

public enum TourEnum {
    GOMEL("GOMEL PROVENCE"),
    BRASLAV("BRASLAV WEEKEND"),
    OLSHANY("GASTRONOMIC PARADISE"),
    GRODNO("ROYAL GRODNO"),
    MOSCOW("THE MANY FACES OF MOSCOW");


    private String tour;

    TourEnum(String tour) {
        this.tour = tour;
    }

    public String getTour() {
        return tour;
    }

    public String toString() {
        return tour;
    }
}


