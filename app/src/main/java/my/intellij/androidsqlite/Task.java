package my.intellij.androidsqlite;

/**
 * Created by ZERO on 16/05/2017.
 */

public class Task {

    //private variables
    int taskId;
    String name;
    String description;

    // Empty constructor
    public Task(){

    }
    // constructor
    public Task(int taskId, String name, String description){
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    // constructor
    public Task(String name, String description){
        this.name = name;
        this.description = description;
    }
    // getting taskId
    public int getTaskId(){
        return this.taskId;
    }

    // setting taskId
    public void setID(int taskId){
        this.taskId = taskId;
    }

    // getting name
    public String getName(){
        return this.name;
    }

    // setting name
    public void setName(String name){
        this.name = name;
    }

    // getting description
    public String getDescription(){
        return this.description;
    }

    // setting description
    public void setDescription(String description){
        this.description = description;
    }
}
