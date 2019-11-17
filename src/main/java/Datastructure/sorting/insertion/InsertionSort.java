package  Datastructure.sorting.insertion;

import Datastructure.sorting.Sorting;

public class InsertionSort extends Sorting
{

    public static void main(String [] args) {
        Sorting sorting = new InsertionSort();
        int array[] = new int[] {10, 9, 15, 77, 88, -10, -10, -1, 89};
        sorting.mySortAlgoImplemenation(array);
        sorting.print(array);

        int array2[] = new int[] {9, 10, 15, 77, 88, -10, -10, -1, 89};
        sorting.instructorSortImplementation(array2);
        sorting.print(array2);
    }



    /**
     * Good thing with method is first find a place for an element in sorted list and then insertion of element is happening
     * @param array
     */
    public int[] instructorSortImplementation(int array[]){

        int temp;
        int count;

        for(int firstUnSortedIndex = 1; firstUnSortedIndex < array.length ;  firstUnSortedIndex++){
            temp = array[firstUnSortedIndex];

            for( count = firstUnSortedIndex ; count > 0 &&  array[count-1] > temp; count--){
                    array[count] = array[count-1];

            }
            array[count] = temp;
        }

        return array;
    }
    /**
     * Problem with method is multiple time swapping of element
     * @param array
     */
    public int[] mySortAlgoImplemenation(int array[]){
    //10, 9, 15, 77, 88, -10, -10, -1, 89

        int lastSortedIndex = 0;
        int temp;
        for(int firstUnSortedIndex = 1; firstUnSortedIndex < array.length ;  firstUnSortedIndex++){

            int swapIndex=firstUnSortedIndex;
            for(int count = lastSortedIndex; count >= 0; count--){
                if(array[count] > array[swapIndex] ){
                    temp = array[swapIndex];
                    array[swapIndex] = array[count];
                    array[count]= temp;
                    swapIndex --;
                }else
                     break;
            }
            lastSortedIndex++;
        }
        return array;
    }
}
