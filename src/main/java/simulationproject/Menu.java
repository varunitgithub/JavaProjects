package simulationproject;

import java.util.ArrayList;
public class Menu {

    private ArrayList<Salad>  salads;
    private ArrayList<Drink> drinks;
    private ArrayList<Meal> meals;
  
    public Menu() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the salads
     */
    public ArrayList<Salad> getSalads() {
        return salads;
    }

    /**
     * @param salads the salads to set
     */
    public void setSalads(ArrayList<Salad> salads) {
        this.salads = salads;
    }

    /**
     * @return the drinks
     */
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    /**
     * @param drinks the drinks to set
     */
    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    /**
     * @return the meals
     */
    public ArrayList<Meal> getMeals() {
        return meals;
    }

    /**
     * @param meals the meals to set
     */
    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Menu [salads=" + salads + ", drinks=" + drinks + ", meals=" + meals + "]";
    }
    
    

}
