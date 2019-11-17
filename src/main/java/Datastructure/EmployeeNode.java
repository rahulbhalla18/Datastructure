package Datastructure;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode previous;
    private EmployeeNode  next;

    /**
     * Constuctor
     * @param employee
     */
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }


    public String toString(){
        return employee.toString();
    }

}
