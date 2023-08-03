package com.example.birdapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class large extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Item>itemList;
    private ItemAdapter1 itemAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large);
        setTitle("Size: Large");

        recyclerView=findViewById(R.id.r);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList=new ArrayList<>();


        itemList.add(new Item(33,"Arfak astrapia",R.drawable.arfak));
        itemList.add(new Item(34,"Splendid astrapia",R.drawable.slpend));
        itemList.add(new Item(35,"Ribbon-tailed astrapia",R.drawable.ribb));
        itemList.add(new Item(36,"Stephanie's astrapia",R.drawable.step));
        itemList.add(new Item(37,"Huon astrapia",R.drawable.huon));
        itemList.add(new Item(38,"Black sicklebill",R.drawable.blsick));
        itemList.add(new Item(39,"Brown sicklebill ",R.drawable.brsick));
        itemList.add(new Item(40,"Lesser bird-of-paradise",R.drawable.lessp));
        itemList.add(new Item(41,"Greater bird-of-paradise",R.drawable.gratp));
        itemList.add(new Item(42,"Raggiana bird-of-paradise",R.drawable.ragp));
        itemList.add(new Item(43,"Goldie's bird-of-paradise",R.drawable.goldp));
        itemList.add(new Item(44,"Red bird-of-paradise",R.drawable.redp));
        itemList.add(new Item(45,"Emperor bird-of-paradise",R.drawable.empp));







        itemAdapter1=new ItemAdapter1(itemList);
        recyclerView.setAdapter(itemAdapter1);


    }

}