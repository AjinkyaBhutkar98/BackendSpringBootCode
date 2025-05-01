package org.spring.practise;

public class Employee {

    private int empId;
    private String empName;
    private Task taskName;

    Employee(){

    }

    Employee(int empId,String empName, Task taskName){
        this.empId=empId;
        this.empName=empName;
        this.taskName=taskName;

    }

    public void assignTask(){

        System.out.println("Emp id "+empId+" "+empName+" have got his task");
        taskName.assignTask();
    }

}
