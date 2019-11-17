package Datastructure;

import java.util.Stack;

public class DoubleEmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void insertFrontOfList(Employee employee) {

        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);

        if (head != null) {

            head.setPrevious(newNode);

        } else {

            tail = newNode;
        }
        head = newNode;
        size++;

    }

    public Employee removeFromFrontOfList() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode newNode = head;
        if (newNode.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = newNode.getNext();
        newNode.setNext(null);

        size--;
        return newNode.getEmployee();

    }

    public Employee removeFromEndOfList() {


        if (isEmpty()) {
            return null;
        }
        EmployeeNode newNode = tail;
        if (newNode.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = newNode.getPrevious();
        newNode.setPrevious(null);
        size--;
        return newNode.getEmployee();

    }

    public void insertTailOfList(Employee employee) {

        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setPrevious(tail);
        if (tail == null) {
            head = newNode;

        } else {
            tail.setNext(newNode);


        }

        tail = newNode;

        size++;

    }

    public void printDoubleEmployeeLinkedList() {
        EmployeeNode traverseNode = head;

        System.out.print("HEAD -> ");
        while (traverseNode != null) {
            System.out.print(traverseNode.getEmployee() + "-> ");
            traverseNode = traverseNode.getNext();
        }
        System.out.print("null \n");
    }

    public void printDoubleEmployeeLinkedListReverse() {
        EmployeeNode traverseNode = tail;

        System.out.print("Tail <- ");
        while (traverseNode != null) {
            System.out.print(traverseNode.getEmployee() + "<- ");
            traverseNode = traverseNode.getPrevious();
        }
        System.out.print("null \n");
    }


    private boolean isEmpty() {
        return head == null;
    }



    public void addBefore(Employee beforeEmployee, Employee addEmployee){

        EmployeeNode current = null;
        if(head == null){
            throw new RuntimeException("Object not found");
        }
        current = head;

        while(current != null&& !current.getEmployee().equals(beforeEmployee)){

            current  = current.getNext();
        }

        if(current == null)
            throw new RuntimeException("Flag Object not found");

        EmployeeNode newNode = new EmployeeNode(addEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);

        if(current.getPrevious() == null)
            head = newNode;
        else
            newNode.getPrevious().setNext(newNode);

        current.setPrevious(newNode);

        size++;



    }

}
