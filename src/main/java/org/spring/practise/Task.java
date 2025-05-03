package org.spring.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Task {

    private String taskName;

    public Task(){

        System.out.println("Default constructor of Task");
    }


    public Task(@Qualifier("emptaskNameBean") String taskName){

        this.taskName=taskName;
    }

    public void assignTask(){

        System.out.println(taskName+" task has been assigned");

    }

    public String getTaskName() {
        return taskName;
    }

//    @Autowired
    public void setTaskName(String taskName) {
        this.taskName = taskName;
        System.out.println("Setting task using setter");
    }
}
