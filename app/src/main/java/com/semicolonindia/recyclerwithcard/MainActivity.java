package com.semicolonindia.recyclerwithcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pojo> listItem = getAllItems();
        // RecyclerView
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView1);
        // size argesment
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), listItem);
        recyclerView.setAdapter(recyclerAdapter);
    }
    private List<Pojo> getAllItems() {
        List<Pojo> list = new ArrayList<>();
        list.add(new Pojo(R.drawable.sample_0, "First"));
        list.add(new Pojo(R.drawable.sample_1, "Second"));
        list.add(new Pojo(R.drawable.sample_2, "Third"));
        list.add(new Pojo(R.drawable.sample_3, "Fourth"));
        list.add(new Pojo(R.drawable.sample_4, "Fifth"));
        list.add(new Pojo(R.drawable.sample_5, "Sixth"));
        list.add(new Pojo(R.drawable.sample_6, "Seventh"));
        list.add(new Pojo(R.drawable.sample_0, "Eighth"));


        return list;
    }

}
