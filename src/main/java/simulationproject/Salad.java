package simulationproject;

public enum Salad {
    GARDEN_SALAD(10),
    MACARONI_SALAD(20),
    GENERAL_SALAD(30),
    UNSUPPORTED(-1);
    
    private double itemPrice = 0.0;
    
    private Salad() {
        itemPrice = 0.0;
    }
    private Salad(double price) {
        this.itemPrice = price;
    }
    
    public double getPrice()
    {
        return itemPrice;
    }
}
