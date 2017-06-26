package com.java8.examples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by miztli on 26/06/17.
 */
public class CallableTest {

    private static volatile AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask callableTask = new CallableTask();

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(r-> new Thread(r, "MyThread_" + count));
        Future<String> future = scheduledExecutorService.schedule(callableTask, 0L, TimeUnit.SECONDS);
        System.out.println("Executing future task: ");
        System.out.println(future.get());



//        scheduledExecutorService.shutdown();

    }

    static class CallableTask implements Callable<String>{
        @Override
        public String call() throws Exception {
            System.out.println("Waiting for callable task to be completed");
            Thread.sleep(5000);
            return "done in thread: " + Thread.currentThread().getName();
        }
    }
}
