package com.nishanthpkashyap.sortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = MyArrayUtils.generateArray(7, 1, 20);

        System.out.print("Before sorting: ");
        MyArrayUtils.printArray(array);
        quickSort(array, 0, array.length - 1);
        System.out.print("After sorting: ");
        MyArrayUtils.printArray(array);
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;
        
        int pivotIndex = partition(array, start, end);
        System.out.println("Pivot index: " + pivotIndex);

        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; //choose last element as pivot
        int i = start - 1;
        int temp;
        for(int j = start; j < end; j++){
            //increment i by 1 and swap ith and jth element
            if(array[j] < pivot){
                i++;
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        //now increment i and swap pivot and ith element
        i++;
        temp = array[i];
        array[i] = pivot;
        array[end] = temp;
        return i;
    }
}
