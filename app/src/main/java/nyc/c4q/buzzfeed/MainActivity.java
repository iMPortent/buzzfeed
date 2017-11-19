package nyc.c4q.buzzfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import nyc.c4q.buzzfeed.controller.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Quiz>myList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_quiz);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        myList.add(new Quiz());
        myList.add(new Quiz());
        myList.add(new Quiz());
        myList.add(new Quiz());

        for(int i = 0; i < myList.size();i++){
            myList.get(i).setFocusQuestion("How many");
            for(int j = 0; j <4;j++){
                myList.get(i).setOptions(""+i);
            }
        }

        MyAdapter adapter = new MyAdapter(myList);
        recyclerView.setAdapter(adapter);

    }
}
