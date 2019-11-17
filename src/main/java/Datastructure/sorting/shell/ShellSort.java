package Datastructure.sorting.shell;

import Datastructure.sorting.Sorting;

public class ShellSort extends Sorting {


    public static void main(String argp[]){
        Sorting sorting = new ShellSort();
        int array[] = new int[] {88, 9, 15, 77, 10, -10, -10, -1, 89};
        sorting.mySortAlgoImplemenation(array);

        sorting.print(array);
        int intArray[] = new int[] {88, 9, 15, 77, 10, -10, -10, -1, 89};
        sorting.instructorSortImplementation(intArray);
        sorting.print(intArray);
    }

    public int[]  mySortAlgoImplemenation(int array[]){


        for(int gap = array.length/2; gap > 0; gap /=2 ) {

            if(gap == 1)
                System.out.print("");
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                for (; j >= gap && array[j - gap] > newElement; j -= gap) {
                    array[j] = array[j - gap];
                }

                array[j] = newElement;
            }
        }

        return array;

    }


    public int[] instructorSortImplementation(int intArray[]) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;


            }
        }
        return intArray;
    }


}
