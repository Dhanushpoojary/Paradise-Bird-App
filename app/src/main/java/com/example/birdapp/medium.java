package com.example.birdapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class medium extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Item>itemList;
    private ItemAdapter1 itemAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
        setTitle("Size: Medium");

        recyclerView=findViewById(R.id.r);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList=new ArrayList<>();


        itemList.add(new Item(22,"Halmahera paradise crow",R.drawable.hal));
        itemList.add(new Item(23,"Obi paradise crow ",R.drawable.obi));
        itemList.add(new Item(24,"Glossy-mantled manucode",R.drawable.glossy));
        itemList.add(new Item(25,"Jobi manucode",R.drawable.jobi));
        itemList.add(new Item(26,"Crinkel-collared manucode",R.drawable.crink));
        itemList.add(new Item(27,"Curl-crested manucode ",R.drawable.curl));
        itemList.add(new Item(28,"Trumpet manucode",R.drawable.trum));
        itemList.add(new Item(29,"Black-billed sicklebill",R.drawable.bbsick));
        itemList.add(new Item(30,"Pale-billed sicklebill",R.drawable.pbsick));
        itemList.add(new Item(31,"Twelve-wired bird-of-paradise",R.drawable.twel));
        itemList.add(new Item(32,"Blue bird-of-paradise",R.drawable.blue));






        itemAdapter1=new ItemAdapter1(itemList);
        recyclerView.setAdapter(itemAdapter1);


    }

}