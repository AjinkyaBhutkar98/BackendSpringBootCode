package org.spring.practise;

public class Task {

    private String taskName;

    public Task(){

    }

    public Task(String taskName){

        this.taskName=taskName;
    }

    public void assignTask(){

        System.out.println(taskName+" task has been assigned");

    }
}
