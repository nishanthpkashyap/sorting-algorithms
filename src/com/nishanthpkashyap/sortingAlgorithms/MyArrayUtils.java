package com.nishanthpkashyap.sortingAlgorithms;

import java.util.Random;

public class MyArrayUtils {

    private static final int bound = 100;
    private static final int origin = 0;
    private static final Random random = new Random();

    public static int[] generateArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static int[] generateArray(int arrayLength, int bound){
        int[] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(origin, bound);
        }
        return array;
    }

    public static int[] generateArray(int arrayLength, int origin, int bound) {
        int[] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(origin, bound);
        }
        return array;
    }

    public  static void printArray(int[] array){
        for(int value: array){
            System.out.print(value+ " ");
        }
        System.out.println();
    }

    public  static void printArray(String[] array){
        for(String value: array){
            System.out.print(value+ " ");
        }
        System.out.println();
    }
}
