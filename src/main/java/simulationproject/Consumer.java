package simulationproject;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class Consumer implements Callable<String> {
	protected BlockingQueue<Customer> queue = null;
	private Cashier cashier = null;

    public Consumer(BlockingQueue<Customer> queue) {
        this.queue = queue;
        this.cashier = new Cashier();
    }


    @Override
    public String call() {
        String ret = new String();
        try {
            Thread.sleep(200);
            System.out.println("Cashier Started Processing the order......");
                do {
            		Customer cust = queue.take();
            		ArrayList<Order> orders = new ArrayList<>(1);
            		orders.add(cust.getOrder());
            		if(!cashier.processOrders(orders)) {
            		    ret += "Invalid Items,";
            		} else {
            		    System.out.println(cust);
            		    ret += "Item Processed,";
            		}
                } while(queue.size() > 0);
          
          System.out.println("Cashier finished processing the order......");
          System.out.println("--------------------------------------------");
          System.out.println("Total number of items Proceesed Today:");
          System.out.println(cashier.getOrders());
          System.out.println("Total Amount received is " + cashier.totalAmountProceesed() );
        		
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch( Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
