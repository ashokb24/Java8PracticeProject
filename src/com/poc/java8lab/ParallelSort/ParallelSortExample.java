package com.poc.java8lab.ParallelSort;

import java.util.Arrays;
import java.util.List;

public class ParallelSortExample {

    public static void main(String[] args) {
        int[] numbers = {22, 89, 1, 32, 19, 5};
        Arrays.parallelSort(numbers);
        Arrays.stream(numbers).forEach(n-> System.out.println(n+" "));
        System.out.println("========================");
        int[] nums = {45,21,34,12,66,88,102};
        Arrays.parallelSort(nums, 2,6);
        Arrays.stream(nums).forEach(p-> System.out.println(p+" "));

    }
}
