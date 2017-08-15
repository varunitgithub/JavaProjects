package simulationproject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class Cafeteria implements Callable<String> {
	protected BlockingQueue<Customer> queue = null;

	public Cafeteria(BlockingQueue<Customer> queue) {
        this.queue = queue;
    }

    @Override
    public String call() {
        try {

            System.out.println("Customer Starting the order ........");
        	Customer c1 = new Customer();
        	Customer c2 = new Customer();
        	Customer c3 = new Customer();
        	c1.chooseItems();
        	c2.chooseItems();
        	c3.chooseItems();
        	c3.getOrder().calculateTotalCost();
        	c1.getOrder().calculateTotalCost();
        	c2.getOrder().calculateTotalCost();
            queue.put(c1);
            System.out.println("First Customer's Order:" + c1);
            queue.put(c2);
            System.out.println("Next Customer's Order:" + c2);

            queue.put(c3);
            System.out.println("Next Customer's Order:" + c3);
            
            System.out.println("Cusomer Order done .........");
            System.out.println("");
            System.out.println("");            

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Items added to the Queue";
    }
}
