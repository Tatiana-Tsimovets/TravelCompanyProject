package by.itstep.tatianatsimovets.finalProject.model.entity;

public enum TourCategoryEnum {
    DIRECTION("DIRECTION"),
    JOURNEY("JOURNEY"),
    ACCOMMODATION("ACCOMMODATION"),
    EXCURSION_PROGRAM("EXCURSION_PROGRAM");

    private String category;

    TourCategoryEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category;
    }
}
