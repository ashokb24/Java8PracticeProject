package com.poc.java8lab.LambdaExpression;

@FunctionalInterface
interface Draw {
    public void draw();
}

interface sumOfTwoNumbers{
    public int addTwoNumbers(int a, int b);
}

public class LambdaExpressionImpl {
    public static void main(String[] args) {
        int width = 10;
        Draw d1 = () -> {
            System.out.println("Drawing with width "+width);
        };
        d1.draw();

        sumOfTwoNumbers sum1 = Integer::sum;
        System.out.println(sum1.addTwoNumbers(10,20));

    }
}
