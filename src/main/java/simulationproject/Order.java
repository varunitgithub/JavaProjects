package simulationproject;

public class Order {

    private String custName;
    private Menu custMenu;
    private double custCost;
    
    public Order() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the custMenu
     */
    public Menu getCustMenu() {
        return custMenu;
    }

    /**
     * @param custMenu the custMenu to set
     */
    public void setCustMenu(Menu custMenu) {
        this.custMenu = custMenu;
    }

    /**
     * @return the custCost
     */
    public double getCustCost() {
        return custCost;
    }

    /**
     * @param custCost the custCost to set
     */
    public void setCustCost(double custCost) {
        this.custCost = custCost;
        calculateTotalCost();
    }
    
    public void calculateTotalCost() {
        if(custMenu.getDrinks().size() > 0 ) {
            custCost += custMenu.getDrinks().get(0).getPrice();
        }
        if(custMenu.getMeals().size() > 0) {
            custCost += custMenu.getMeals().get(0).getPrice();
        }
        if(custMenu.getSalads().size() > 0 ) {
            custCost += custMenu.getSalads().get(0).getPrice();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "\n" + "Order [custName=" + custName + ", custMenu=" + custMenu + ", custCost=" + custCost + "]";
    }

}
