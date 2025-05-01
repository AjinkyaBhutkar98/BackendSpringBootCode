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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Task getTaskName() {
        return taskName;
    }

    public void setTaskName(Task taskName) {
        this.taskName = taskName;
    }
}
