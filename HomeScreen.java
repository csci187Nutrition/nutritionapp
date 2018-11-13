package com.example.deepfriedkittuns.mealtrackertemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    private MyRecyclerViewAdapter upAdapter, histAdapter;
    RecyclerView rvUp, rvHist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ArrayList<String> mn = new ArrayList<>();
        mn.add("spaghetti");
        mn.add("apples");
        mn.add("farts");
        mn.add("garlic");
        mn.add("borscht");

        ArrayList<String> dt = new ArrayList<>();
        dt.add("1/1/1");
        dt.add("11/12/12");
        dt.add("2/4/65");
        dt.add("1/2/3/4");
        dt.add("12/31/12");

        rvUp = findViewById(R.id.rvUpcoming);
        rvHist = findViewById(R.id.rvHistory);

        upAdapter = new MyRecyclerViewAdapter(this, mn, dt);
        upAdapter.setClickListener(this);
        rvUp.setAdapter(upAdapter);

        /*
        histAdapter = new MyRecyclerViewAdapter(this, dt);
        histAdapter.setClickListener(this);
        rvHist.setAdapter(histAdapter);
        */
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "clicked " + upAdapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}
