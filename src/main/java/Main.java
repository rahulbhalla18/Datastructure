import Datastructure.DoubleEmployeeLinkedList;
import Datastructure.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("fEmp1", "lEmp1", 1);
        Employee employee2 = new Employee("fEmp2", "lEmp2", 2);
        Employee employee3 = new Employee("fEmp3", "lEmp3", 3);
        Employee employee4 = new Employee("fEmp4", "lEmp4", 4);
        Employee employee5 = new Employee("fEmp5", "lEmp5", 5);

        DoubleEmployeeLinkedList doubleEmployeeLinkedList = new DoubleEmployeeLinkedList();
        doubleEmployeeLinkedList.insertFrontOfList(employee1);
        doubleEmployeeLinkedList.insertFrontOfList(employee2);
        doubleEmployeeLinkedList.insertFrontOfList(employee3);
        doubleEmployeeLinkedList.insertFrontOfList(employee4);
        doubleEmployeeLinkedList.insertFrontOfList(employee5);



        doubleEmployeeLinkedList.printDoubleEmployeeLinkedList();

        doubleEmployeeLinkedList.printDoubleEmployeeLinkedListReverse();



        doubleEmployeeLinkedList.removeFromFrontOfList();

        doubleEmployeeLinkedList.printDoubleEmployeeLinkedList();

        doubleEmployeeLinkedList.removeFromEndOfList();
        doubleEmployeeLinkedList.printDoubleEmployeeLinkedList();


        Employee employee6 = new Employee("fEmp6", "lEmp6", 6);
        Employee employee7 = new Employee("fEmp7", "lEmp7", 7);
        Employee employee8 = new Employee("fEmp8", "lEmp8", 8);
        Employee employee9 = new Employee("fEmp9", "lEmp9", 9);
        Employee employee10 = new Employee("fEmp10", "lEmp10", 10);

        DoubleEmployeeLinkedList tailDoubleLinkedList = new DoubleEmployeeLinkedList();
        tailDoubleLinkedList.insertTailOfList(employee6);
        //tailDoubleLinkedList.insertTailOfList(employee7);
        tailDoubleLinkedList.insertTailOfList(employee8);
        tailDoubleLinkedList.insertTailOfList(employee9);
        tailDoubleLinkedList.insertTailOfList(employee10);

        tailDoubleLinkedList.printDoubleEmployeeLinkedList();

        tailDoubleLinkedList.printDoubleEmployeeLinkedListReverse();


      //  tailDoubleLinkedList.removeFromFrontOfList();

       // tailDoubleLinkedList.printDoubleEmployeeLinkedList();

     //   tailDoubleLinkedList.removeFromEndOfList();
       // tailDoubleLinkedList.removeFromEndOfList();
        //tailDoubleLinkedList.removeFromEndOfList();
        //tailDoubleLinkedList.removeFromEndOfList();
     //   tailDoubleLinkedList.printDoubleEmployeeLinkedList();



        tailDoubleLinkedList.addBefore(employee6, employee7);
        tailDoubleLinkedList.printDoubleEmployeeLinkedList();
        tailDoubleLinkedList.printDoubleEmployeeLinkedListReverse();


    }
}
