package com.java8.examples.executors;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by miztli on 31/05/17.
 */
public class ExecutorsTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        //Creates and executes a one-shot action that becomes enabled after the given delay.
//        System.out.println("Strarting the task at: " + new Date());
//        Future future = scheduledExecutorService.schedule(logonProtocol(), 5, TimeUnit.SECONDS);

        System.out.println("Strarting the task at: " + new Date());
        Future future = scheduledExecutorService.scheduleAtFixedRate(logonProtocol(), 0, 1, TimeUnit.SECONDS);

//        System.out.println("Waiting for calling off the task");
//        Thread.sleep(20000);
//        System.out.println("calling off the task");
//        future.cancel(false);
//
//        System.out.println("Shooting down Scheduled Executor Service");
//        scheduledExecutorService.shutdown();
    }

    public static Runnable logonProtocol(){
        return () -> {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Doing the logon/echo task at: " + new Date());
            System.out.println("Server status: " + ServerStatus.getInstance().isAlive());

            //If the server is alive send echo message
            if(ServerStatus.getInstance().isAlive()){
                System.out.println("Creating ISO MESSAGE 0800 echo");
                try {
                    System.out.println("Waiting " + ServerStatus.getInstance().getResponseWaitTime() + " for echo response message");
                    Thread.sleep(ServerStatus.getInstance().getResponseWaitTime());
                    System.out.println("Looking for 0800 echo response");
                    if(responseArrived()){
                        System.out.println("Valid response from echo, setting serverAlive to true");
                        ServerStatus.getInstance().setAlive(true);
                        System.out.println("Waiting " + ServerStatus.getInstance().getNextExecutionTime() + " for the next execution");
                        Thread.sleep(ServerStatus.getInstance().getNextExecutionTime());
                    }else{
                        System.out.println("Invalid response from echo, setting serverAlive to false");
                        ServerStatus.getInstance().setAlive(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }else{//send login
                System.out.println("Create ISO MESSAGE 0800 logon");
                try {
                    System.out.println("Waiting " + ServerStatus.getInstance().getResponseWaitTime() + " for logon response message");
                    Thread.sleep(ServerStatus.getInstance().getResponseWaitTime());
                    System.out.println("Looking for 0800 logon response");
                    if(responseArrived()){
                        System.out.println("Valid response from logon, setting serverAlive to true");
                        ServerStatus.getInstance().setAlive(true);
                        System.out.println("Waiting " + ServerStatus.getInstance().getNextExecutionTime() + " for the next execution");
                        Thread.sleep(ServerStatus.getInstance().getNextExecutionTime());
                    }else{
                        System.out.println("Invalid response from logon, setting serverAlive to false");
                        ServerStatus.getInstance().setAlive(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static class ServerStatus{
        private static ServerStatus serverStatus;
        private boolean alive;
        private long responseWaitTime = 3;//seconds
        private long nextExecutionTime = 20000;//miliseconds

        public static ServerStatus getInstance() {
            if(serverStatus == null){
                serverStatus = new ServerStatus();
            }
            return serverStatus;
        }

        private ServerStatus() {
        }

        public synchronized boolean isAlive() {
            return alive;
        }

        public synchronized void setAlive(boolean alive) {
            this.alive = alive;
        }

        public long getResponseWaitTime() {
            return responseWaitTime;
        }

        public long getNextExecutionTime() {
            return nextExecutionTime;
        }
    }

    public static boolean responseArrived(){
        if(new Random().nextInt(10)<=5 ){
            System.out.println("Response arrived");
            return true;
        }
        System.out.println("Response didn't arrive");
        return false;
    }
}
