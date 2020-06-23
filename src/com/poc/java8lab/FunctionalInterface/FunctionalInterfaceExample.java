package com.poc.java8lab.FunctionalInterface;

@FunctionalInterface
interface Draw {
    void draw(String pictureName);

    default void printSomeThing(String str) {
        System.out.println(str);
    }

    static int addTwoNumbers(int a, int b){
        System.out.println("sum of two numbers "+(a+b));
        return  a + b;
    }
}

@FunctionalInterface
interface print extends Draw{
    // you cannot have one more abstract method when you are extending one functional interface
    // void printSomething(); // this is not possible
    // however, you can have more than one default methods and static methods

    default void printSomething(){

    }

    static void readingSomething(){

    }
}

public class FunctionalInterfaceExample  implements  Draw{
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();
        functionalInterfaceExample.printSomeThing("ashok");
        functionalInterfaceExample.draw("Elephant");
    }

    @Override
    public void draw(String pictureName) {
        System.out.println("I will draw "+pictureName);
    }

}
