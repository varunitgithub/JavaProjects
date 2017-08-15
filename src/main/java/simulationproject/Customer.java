package simulationproject;
import java.util.ArrayList;

public class Customer {

    private Order order;
    
    
    public Customer() {
        // TODO Auto-generated constructor stub
        order = new Order();
    }
    
    public void chooseItems() {
        int randomNum = (int)(Math.random()*3+1); // randomize the selection of orders
        Drink dr;
        Meal meal;
        Salad salad;
        ArrayList<Drink> drs = new ArrayList<>();
        ArrayList<Meal> meals = new ArrayList<>();
        ArrayList<Salad> salads = new ArrayList<>();
        Menu menu = new Menu();
       switch(randomNum) {
           case 1:
               dr = Drink.COKE;
               meal = Meal.BRIYANI;
               salad = Salad.GARDEN_SALAD;
               drs.add(dr);
               meals.add(meal);
               salads.add(salad);
               menu.setDrinks(drs);
               menu.setMeals(meals);
               menu.setSalads(salads);
               order.setCustName("CUSTOMER-COKECOMBO");
               order.setCustMenu(menu);
               return;
           case 2:
               dr = Drink.PEPSI;
               meal = Meal.CHICKENNOODLES;
               salad = Salad.GENERAL_SALAD;
               drs.add(dr);
               meals.add(meal);
               salads.add(salad);
               menu.setDrinks(drs);
               menu.setMeals(meals);
               menu.setSalads(salads);
               order.setCustName("CUSTOMER-PEPSICOMBO");
               order.setCustMenu(menu);
               return;
           case 3:
               dr = Drink.WATER;
               meal = Meal.VEGNOODLES;
               salad = Salad.MACARONI_SALAD;
               drs.add(dr);
               meals.add(meal);
               salads.add(salad);
               menu.setDrinks(drs);
               menu.setMeals(meals);
               menu.setSalads(salads);
               order.setCustName("CUSTOMER-WATERCOMBO");
               order.setCustMenu(menu);
               return;
           default:
               dr = Drink.UNSUPPORTED;
               meal = Meal.UNSUPPORTED;
               salad = Salad.UNSUPPORTED;
               drs.add(dr);
               meals.add(meal);
               salads.add(salad);
               menu.setDrinks(drs);
               menu.setMeals(meals);
               menu.setSalads(salads);
               order.setCustName("CUSTOMER-UNSUPPCOMBO");
               order.setCustMenu(menu);
               return;
       }
        
    }

    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return  "[" + order +"]";
    }

}
