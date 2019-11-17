package Datastructure.sorting.merge;

import Datastructure.sorting.Sorting;

public class MergeSorting extends Sorting {


    public static void main(String args[]) {
        int unsortedArray[] = new int[]{
                20, -15, 35, 7, 55, 1, -22, 1
        };
        MergeSorting sorting = new MergeSorting();
        int sortedArray[] = sorting.mySortAlgoImplemenation(unsortedArray);
     //   sorting.print(sortedArray);
    }
    // was unable to implement at the time when i goes through video
    public int[] mySortAlgoImplemenation(int[] unsortedArray) {
        //;mergeSort(unsortedArray, 0, unsortedArray.length-1);

        return unsortedArray;
    }

    @Override
    public int[] instructorSortImplementation(int[] unsortedArray) {
        mergeSort(unsortedArray, 0, unsortedArray.length-1);
        return unsortedArray;
    }
/*
    private int[] mergeSort(int[] unsortedArray, int startIndex, int lastIndex) {

    if(startIndex < lastIndex) {
        int mid = (lastIndex + startIndex) / 2;
          //  if(startIndex != mid) {
                System.out.println("Start: " + startIndex + "mid: " + mid);
                mergeSort(unsortedArray, startIndex, mid);
          //  }
           // if((mid+1)!= lastIndex) {
                System.out.println("mid: " + (mid + 1) + "last: " + lastIndex);
                mergeSort(unsortedArray, mid + 1, lastIndex);
           // }
    }
        return null;
    }*/


    private void mergeSort(int[] unsortedArray, int startIndex, int length) {

    }
}
