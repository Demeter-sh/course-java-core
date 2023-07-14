package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonsOfYear {
    SUMMER("summer", 30) {
        @Override
        public String getDescription() {
            return "Hot season of year";
        }
    },
    AUTUMN("autumn", 10),
    WINTER("winter", -10),
    SPRING("spring", 14);
    public String seasonsOfYearName;
    int averageTemperature;
    private String favoriteSeason;

    SeasonsOfYear(String name, int averageTemperature) {
        this.seasonsOfYearName = name;
        this.averageTemperature = averageTemperature;
    }

    public String getSeasonsOfYearName() {
        return seasonsOfYearName;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getFavoriteSeason() {
        return favoriteSeason;
    }

    public String getDescription() {
        return "Cold season of year";
    }

    public String getMyFavoriteSeason(SeasonsOfYear seasonsOfYear) {
        switch (seasonsOfYear) {
            case SUMMER:
                favoriteSeason = "I love " + SeasonsOfYear.SUMMER.getSeasonsOfYearName() + ". Average temperature - " + SeasonsOfYear.SUMMER.getAverageTemperature();
                break;
            case AUTUMN:
                favoriteSeason = "I love " + SeasonsOfYear.AUTUMN.getSeasonsOfYearName() + ". Average temperature - " + SeasonsOfYear.AUTUMN.getAverageTemperature();
                break;
            case WINTER:
                favoriteSeason = "I love " + SeasonsOfYear.WINTER.getSeasonsOfYearName() + ". Average temperature - " + SeasonsOfYear.WINTER.getAverageTemperature();
                break;
            case SPRING:
                favoriteSeason = "I love " + SeasonsOfYear.SPRING.getSeasonsOfYearName() + ". Average temperature - " + SeasonsOfYear.SPRING.getAverageTemperature();
                break;
        }
        return favoriteSeason;
    }
}
