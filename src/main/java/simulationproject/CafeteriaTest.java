package simulationproject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CafeteriaTest {
	public static void main(String[] args) throws Exception {

	    // Create a blocking queue of size 10
        BlockingQueue<Customer> queue = new ArrayBlockingQueue<Customer>(10);

        Cafeteria producer = new Cafeteria(queue);
        Consumer consumer = new Consumer(queue);

        // Create ExecutorService of fixed thread pool size 2
        ExecutorService executorService =  Executors.newFixedThreadPool(2);
        Set<Callable<String>> callables =new HashSet<>(); 
        
        // Add the producer and consumer to the callables
        callables.add(producer);
        callables.add(consumer);
        
        // Invoke all the callables
        List<Future<String>> results = executorService.invokeAll(callables); 
        executorService.shutdown();
        executorService.awaitTermination(150, TimeUnit.SECONDS);
        
        // Loop through the array and print the return value
        for(int i=0;i < results.size();i++)
        {
            System.out.println(results.get(i).get());
        }
    }
}
