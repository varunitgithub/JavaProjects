package labexcercise;

import labexcercise.City;
import labexcercise.Country;


public class CityMgr extends City {

    public CityMgr() {
        // TODO Auto-generated constructor stub
    }

    public City getCity(Country country) {
        switch (country) {
            case JAPAN:
                return new City("Tokyo", 123456);
            case LEBANON:
                return new City("Tokyo1", 123456);
            case SWEDEN:
                return new City("Tokyo2", 123456);
            case CANADA:
                return new City("Tokyo3", 123456);
            case NIGERIA:
                return new City("Tokyo4", 123456);
            case PERU:
                return new City("Tokyo5", 123456);
            default:
                return new City();
        }
    }
}
