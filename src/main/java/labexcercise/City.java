package labexcercise;

public class City {

    private String cityName;
    private double cityPopulation;

    public City() {
        // TODO Auto-generated constructor stub
        this.cityName = "";
        this.cityPopulation = 0;
    }

    public City(String cityName, double cityPopulation) {
        setCityName(cityName);
        setCityPopulation(cityPopulation);
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     *            the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the cityPopulation
     */
    public double getCityPopulation() {
        return cityPopulation;
    }

    /**
     * @param cityPopulation
     *            the cityPopulation to set
     */
    public void setCityPopulation(double cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", cityPopulation=" + cityPopulation + "]";
    }

}
