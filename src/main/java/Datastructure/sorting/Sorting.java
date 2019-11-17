package Datastructure.sorting;

public abstract class Sorting {
   public abstract int[] mySortAlgoImplemenation(int[] unsortedArray) ;
   public abstract int[] instructorSortImplementation(int[] unsortedArray) ;

    public void print(int[] sortedArray) {

        for(int element : sortedArray){
            System.out.print(element + " -> ");
        }

        System.out.println("done");
    }
}
