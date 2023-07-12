package com.nishanthpkashyap.sortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = MyArrayUtils.generateArray(7, 1, 30);

        System.out.print("Before sorting:");
        MyArrayUtils.printArray(array);

        bubbleSort(array);

        System.out.print("After sorting:");
        MyArrayUtils.printArray(array);
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
