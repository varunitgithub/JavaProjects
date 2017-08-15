package simulationproject;

public enum Meal {
    BRIYANI(10),
    CHICKENNOODLES(20),
    VEGNOODLES(30),
    UNSUPPORTED(-1);
    
    private double itemPrice = 0.0;
    
    private Meal() {
        itemPrice = 0.0;
    }
    private Meal(double price) {
        this.itemPrice = price;
    }
    
    public double getPrice()
    {
        return itemPrice;
    }
}
