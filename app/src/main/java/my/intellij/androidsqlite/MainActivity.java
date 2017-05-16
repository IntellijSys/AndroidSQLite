package my.intellij.androidsqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Tasks
        Log.d("Insert: ", "Inserting ..");
        db.addTask(new Task("Breakfast", "Nasi Lemak"));
        db.addTask(new Task("Lunch", "Nasi Ayam"));
        db.addTask(new Task("Dinner", "MCD"));

        // Reading all tasks
        Log.d("Reading: ", "Reading all tasks..");
        List<Task> tasks = db.getAllTasks();

        for (Task cn : tasks) {
            String log = "TaskId: "+cn.getTaskId()+" ,Name: " + cn.getName() + " ,Description: " + cn.getDescription();
            // Writing Tasks to log
            Log.d("Name: ", log);
        }
    }
}