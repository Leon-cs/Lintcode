package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/11/3 18:46.
 */
public class SortIntegers2 {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers2(int[] A) {
        // Write your code here
        if (A.length > 0){
            quickSort(A,0,A.length-1);
        }
        for (int i : A) {
            System.out.print(i + "  ");
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = array[left];
            int low = left;
            int high = right;
            while (low < high) {
                while (low < high && array[high] >= pivot) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] <= pivot) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = pivot;
            quickSort(array, left, low - 1);
            quickSort(array, low + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{234,423,54,6,76,756,7,4,23,4,24,6,5};
        new SortIntegers2().sortIntegers2(a);
    }
}