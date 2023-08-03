package com.example.birdapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Explore extends AppCompatActivity {
    private SQLiteDatabase db;


    private RecyclerView recyclerView;
    private List<Item>itemList;
    private ItemAdapter itemAdapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        searchView=findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return false;
            }
        });
        recyclerView=findViewById(R.id.r);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList=new ArrayList<>();


        itemList.add(new Item(1,"Halmahera paradise crow",R.drawable.hal));
        itemList.add(new Item(2,"Obi paradise crow ",R.drawable.obi));
        itemList.add(new Item(3,"Glossy-mantled manucode",R.drawable.glossy));
        itemList.add(new Item(4,"Jobi manucode",R.drawable.jobi));
        itemList.add(new Item(5,"Crinkel-collared manucode",R.drawable.crink));
        itemList.add(new Item(6,"Curl-crested manucode ",R.drawable.curl));
        itemList.add(new Item(7,"Trumpet manucode",R.drawable.trum));
        itemList.add(new Item(8,"Long-tailed paradigalla",R.drawable.lpara));
        itemList.add(new Item(9,"Short-tailed paradigalla",R.drawable.spara));
        itemList.add(new Item(10,"Arfak astrapia ",R.drawable.arfak));
        itemList.add(new Item(11,"Splendid astrapia",R.drawable.slpend));
        itemList.add(new Item(12,"Ribbon-tailed astrapia",R.drawable.ribb));
        itemList.add(new Item(13,"Stephanie's astrapia",R.drawable.step));
        itemList.add(new Item(14,"Huon astrapia ",R.drawable.huon));
        itemList.add(new Item(15,"West parotia",R.drawable.west));
        itemList.add(new Item(16,"Carol's parotia",R.drawable.caro));
        itemList.add(new Item(17,"Bronze parotia",R.drawable.bron));
        itemList.add(new Item(18,"Lawes's parotia",R.drawable.law));
        itemList.add(new Item(19,"Eastern parotia",R.drawable.east));
        itemList.add(new Item(20,"Wahnes's parotia",R.drawable.wah));
        itemList.add(new Item(21,"King of Saxony bird-of-paradise",R.drawable.king));
        itemList.add(new Item(22,"Greater lophorina ",R.drawable.glop));
        itemList.add(new Item(23,"Crescent-caped lophorina ",R.drawable.crlop));
        itemList.add(new Item(24,"Lesser lophorina",R.drawable.llop));
        itemList.add(new Item(25,"Magnificent riflebird ",R.drawable.mrifl));
        itemList.add(new Item(26,"Growling riflebird ",R.drawable.grifle));
        itemList.add(new Item(27,"Paradise riflebird ",R.drawable.prifle));
        itemList.add(new Item(28,"Victoria's riflebird ",R.drawable.vrifle));
        itemList.add(new Item(29,"Black sicklebill ",R.drawable.blsick));
        itemList.add(new Item(30,"Brown sicklebill ",R.drawable.brsick));
        itemList.add(new Item(31,"Black-billed sicklebill",R.drawable.bbsick));
        itemList.add(new Item(32,"Pale-billed sicklebill ",R.drawable.pbsick));
        itemList.add(new Item(33,"King bird-of-paradise",R.drawable.kingp));
        itemList.add(new Item(34,"Magnificent bird-of-paradise ",R.drawable.mag));
        itemList.add(new Item(35,"Wilson's bird-of-paradise",R.drawable.wilson));
        itemList.add(new Item(36,"Standardwing bird-of-paradise ",R.drawable.stdwg));
        itemList.add(new Item(37,"Twelve-wired bird-of-paradise ",R.drawable.twel));
        itemList.add(new Item(38,"Lesser bird-of-paradise ",R.drawable.lessp));
        itemList.add(new Item(39,"Greater bird-of-paradise ",R.drawable.gratp));
        itemList.add(new Item(40,"Raggiana bird-of-paradise ",R.drawable.ragp));
        itemList.add(new Item(41,"Goldie's bird-of-paradise ",R.drawable.goldp));
        itemList.add(new Item(42,"Red bird-of-paradise",R.drawable.redp));
        itemList.add(new Item(43,"Emperor bird-of-paradise",R.drawable.empp));
        itemList.add(new Item(44,"Blue bird-of-paradise ",R.drawable.blue));







        itemAdapter=new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);


    }
    private void filterList(String text) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : itemList) {
            if (item instanceof Item) {
                // If the item is a regular item, check if it matches the search text
                Item currentItem = (Item) item;
                if (currentItem.getItemName().toLowerCase(Locale.getDefault()).contains(text.toLowerCase(Locale.getDefault()))) {
                    filteredList.add(currentItem);
                }
            } else {
                // If the item is a heading item, add it to the filtered list unconditionally
                filteredList.add(item);
            }
        }
        if (filteredList.isEmpty()) {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        } else {
            itemAdapter.setFilteredList(filteredList);
        }
    }
}