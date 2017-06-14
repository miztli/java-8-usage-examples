package com.java8.examples.certification;

/**
 * Created by miztli on 4/06/17.
 */
public class Primitives {

    public void byteExamples(){
        //from -128 to 127
        byte b = 127;
            System.out.println("byte: " + b);

        char a = 'a';
            b = (byte) a;
            System.out.println("byte: " + b);

            a = (char) b;
            System.out.println("byte: " + a);
    }

    public void numberExamples(){
        short s = 12;
        long l = 2147483648L;
        double d =12.33;
        int i = 12;
        float f = 12.3f;

        System.out.println("short number: " + s);
        System.out.println("long number: " + l);
        System.out.println("double number: " + d);
        System.out.println("int number: " + i);
        System.out.println("float number: " + f);
    }

    public void baseNumbers(){
        int base10number = 56; //56
        System.out.println("Base 10 number: " +base10number); // 56
        int binaryNumber = 0b11; //3
        System.out.println("Binary number: " + binaryNumber); // 3
        int octalNumber = 017; //15
        System.out.println("Octal number: " + octalNumber); // 15
        int hexNumber = 0x1F; //31
        System.out.println("Hex number: " + hexNumber); //31
//        int amount = 9L; //DOES NOT COMPILE
        int amountBin = 0b101;
        System.out.println("Binary number: " + amountBin); //5
        int amountHex = 0xE;
        System.out.println("Hex number: " + amountHex); //14
        double amountDoubHex = 0xE;
        System.out.println("Double number: " + amountDoubHex); //14.0
//        double amountDoubHex2 = 1_2_.0_0; //DOES NOT COMPILE
//        int amount = 1_2_; //DOES NOT COMPILE
    }

    int defaultInt;
    public void defaultNumbers(){
        //int defaultInt; //Compile error variable not initialized
        System.out.println("Default int value: " + defaultInt);
    }

    public void underscoreNumbers(){
//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00;// DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles
        int million1 = 1000000;
        int million2 = 1_000_000;
    }

    public static void main(String[] args) {
        Primitives p = new Primitives();
            p.byteExamples();
            p.numberExamples();
            p.baseNumbers();
            p.defaultNumbers();
    }
}
