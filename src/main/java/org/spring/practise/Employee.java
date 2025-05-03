package org.spring.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {

    private int empId;
    private String empName;
    private Task taskName;



    Employee(){

        System.out.println("Default constructor of Employee");
    }

    @Autowired
    Employee(@Qualifier("empIdBean") int empId,@Qualifier("empNameBean") String empName, Task taskName){
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
        System.out.println("Stting employee using setter");
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
