package simulationproject;
import java.util.ArrayList;
import java.util.Iterator;

public class Cashier {

    private ArrayList<Order> orders;
    
    public Cashier() {
        // TODO Auto-generated constructor stub
        orders = new ArrayList<>();
    }
    
    // Validates the given orders and returns the results
    public boolean isValidItems(ArrayList<Order> orders) {
        Iterator<Order> it = orders.iterator();
        boolean isValid = false;
        while(it.hasNext()) {
           Order or = it.next();
           Menu menu = or.getCustMenu();
            isValid = (menu.getDrinks().size() <=1 && menu.getMeals().size() <= 1 && menu.getSalads().size() <= 1);
        }
        return isValid;
    }
    

    /**
     * @return the orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(ArrayList<Order> orders) {
        this.orders.addAll(orders);
    }
        
    
    // Process the given orders and returns the results
    public boolean processOrders(ArrayList<Order> orders) {
        if(isValidItems(orders)) {
            setOrders(orders);
            return true;
        }
        
        return false;
    }
    
    public double totalAmountProceesed() {
        double totalAmount = 0.0;
        for(Order or: orders) {
            totalAmount += or.getCustCost();
        }
        return totalAmount;
    }
}
