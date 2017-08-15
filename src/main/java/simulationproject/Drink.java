package simulationproject;

public enum Drink {
    COKE(10),
    PEPSI(20),
    WATER(30),
    UNSUPPORTED(-1);
    
    private double itemPrice = 0.0;
    
    private Drink() {
        itemPrice = 0.0;
    }
    private Drink(double price) {
        this.itemPrice = price;
    }
    
    public double getPrice()
    {
        return itemPrice;
    }
}
