package com.example.birdapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class small extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Item>itemList;
    private ItemAdapter1 itemAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        setTitle("Size: Small");

        recyclerView=findViewById(R.id.r);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList=new ArrayList<>();


        itemList.add(new Item(1,"Long-tailed paradigalla",R.drawable.lpara));
        itemList.add(new Item(2,"Short-tailed paradigalla",R.drawable.spara));
        itemList.add(new Item(3,"Western parotia ",R.drawable.west));
        itemList.add(new Item(4,"Carola's parotia ",R.drawable.caro));
        itemList.add(new Item(5,"Bronze parotia",R.drawable.bron));
        itemList.add(new Item(6,"Lawes's parotia",R.drawable.law));
        itemList.add(new Item(7,"Eastern parotia ",R.drawable.east));
        itemList.add(new Item(8,"Wahnes's parotia",R.drawable.wah));
        itemList.add(new Item(9,"King of Saxony bird-of-paradise",R.drawable.king));
        itemList.add(new Item(10,"Greater lophorina",R.drawable.glop));
        itemList.add(new Item(11,"Crescent-caped lophorina",R.drawable.crlop));
        itemList.add(new Item(12,"Lesser lophorina",R.drawable.llop));
        itemList.add(new Item(13,"Magnificent riflebird",R.drawable.mrifl));
        itemList.add(new Item(14,"Growling riflebird",R.drawable.grifle));
        itemList.add(new Item(15,"Paradise riflebird ",R.drawable.prifle));
        itemList.add(new Item(16,"Victoria's riflebird ",R.drawable.vrifle));
        itemList.add(new Item(17,"King bird-of-paradise",R.drawable.kingp));
        itemList.add(new Item(18,"Magnificent bird-of-paradisea",R.drawable.mag));
        itemList.add(new Item(19,"Wilson's bird-of-paradise",R.drawable.wilson));
        itemList.add(new Item(20,"Standardwing bird-of-paradise",R.drawable.stdwg));


        itemAdapter1=new ItemAdapter1(itemList);
        recyclerView.setAdapter(itemAdapter1);


    }

}