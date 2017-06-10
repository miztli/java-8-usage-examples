package com.java8.examples.certification;

/**
 * Created by miztli on 10/06/17.
 */
public class GarbageCollection {
    public static void main(String[] args) throws InterruptedException {
        Finilize f1 = new Finilize(1);
        Finilize f2 = new Finilize(2);
        f1 = f2;
        f1 = null;
        System.gc();
    }
}
class Finilize{
    int someVal;

    public Finilize(int someVal) {
        super();
        this.someVal=someVal;
        System.out.println("creating finalizing instance");
    }

    // This method will only run once, even if the object couldn't be first collected and a
    // later garbage collection picked it
    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collector is deleting finilizing instance");
        super.finalize();
    }

    public int getSomeVal() {
        return someVal;
    }

    public void setSomeVal(int someVal) {
        this.someVal = someVal;
    }
}
