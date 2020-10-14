package com.codewithchris;

public class Main {
    public static void main(String[] args) {
        /*To use the Wolf and Elephant class, we need to create instances of those classes.
         * Creating objects of the class*/

        //instance (object) of the Elephant class
        Elephant myElephant = new Elephant();
        //instance (object) of the Wolf class
        Wolf myWolf = new Wolf();

        myElephant.sound = "Pffff";
        myWolf.sound = "Grrrr";

        myElephant.begForBellyrubs();
        myWolf.begForBellyrubs();

        System.out.println(" The Elephant goes " + myElephant.sound + " and the Wolf goes " + myWolf.sound);
    }
}