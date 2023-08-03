package com.example.birdapp;

public class Item {
    private int id;
    private  String itemName;
    private  int itemImage;
    public Item(int id,String itemName, int itemImage) {
        this.id=id;
        this.itemImage=itemImage;
        this.itemName=itemName;
    }
    public int getId() {return id;}
    public int getItemImage() {
        return itemImage;
    }
    public String getItemName(){
        return itemName;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

