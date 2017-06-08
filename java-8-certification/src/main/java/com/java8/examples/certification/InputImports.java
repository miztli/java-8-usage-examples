package com.java8.examples.certification;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.*;

/**
 * Class created for imports examples
 *
 * Created by miztli on 3/06/17.
 */
public class InputImports {
    public void read(Files file){
        Paths.get("name");
    }

    public static void main(String[] args) {

        StaticInitialization swan = new StaticInitialization();
        swan.numberOfEgg = 3;

        System.out.println("Number of eggs: " + swan.numberOfEgg);
    }
}
