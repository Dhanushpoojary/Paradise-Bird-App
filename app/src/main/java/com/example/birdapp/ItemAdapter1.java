package com.example.birdapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter1 extends RecyclerView.Adapter<ItemAdapter1.ItemViewHolder>{


    private Context context;
    private List<Item>itemList;

    public ItemAdapter1(List<Item> itemList) {
        this.itemList=itemList;
    }
    public void setFilteredList(List<Item>filteredList){
        this.itemList=filteredList;
        notifyDataSetChanged();

    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item1, parent, false);
        return new ItemViewHolder(view);


    }


    @SuppressLint("RecyclerView")

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        Item item=itemList.get(position);
        holder.itemNameTv.setText(item.getItemName());
        holder.itemImageTv.setImageResource(item.getItemImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (item.getId()) {
                    case 1:
                        intent = new Intent(context, longp.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(context, shortp.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(context, west.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(context, carol.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(context, bron.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(context, law.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(context, east.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(context, wah.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(context, kings.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(context, grtl.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(context, crstl.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(context, lessl.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(context, mgrif.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(context, grwrif.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(context, prif.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(context, vcrif.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(context, kingp.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(context, mag.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(context, wils.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(context, std.class);
                        intent.putExtra("FROM_ACTIVITY", "small");
                        context.startActivity(intent);
                        break;

                    case 22:
                        intent = new Intent(context, hal.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 23:
                        intent = new Intent(context, obi.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 24:
                        intent = new Intent(context, gloss.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 25:
                        intent = new Intent(context, jobi.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 26:
                        intent = new Intent(context, crink.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 27:
                        intent = new Intent(context, curl.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 28:
                        intent = new Intent(context, trump.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 29:
                        intent = new Intent(context, bbsk.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 30:
                        intent = new Intent(context, pbsk.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 31:
                        intent = new Intent(context, twl.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 32:
                        intent = new Intent(context, blue.class);
                        intent.putExtra("FROM_ACTIVITY", "medium");
                        context.startActivity(intent);
                        break;
                    case 33:
                        intent = new Intent(context, arfak.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 34:
                        intent = new Intent(context, splend.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 35:
                        intent = new Intent(context, rib.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 36:
                        intent = new Intent(context, step.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 37:
                        intent = new Intent(context, huon.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 38:
                        intent = new Intent(context, blsk.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 39:
                        intent = new Intent(context, brsk.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 40:
                        intent = new Intent(context, lessp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 41:
                        intent = new Intent(context, grtp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 42:
                        intent = new Intent(context, ragp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 43:
                        intent = new Intent(context, goldp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 44:
                        intent = new Intent(context, redp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;
                    case 45:
                        intent = new Intent(context, empp.class);
                        intent.putExtra("FROM_ACTIVITY", "large");
                        context.startActivity(intent);
                        break;

                    // add more cases for additional activities
                    default:
                        break;
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        if (itemList == null) {
            return 0;
        } else {
            return itemList.size();
        }
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView itemNameTv;
        private ImageView itemImageTv;
        private CardView cardView;
        public ItemViewHolder(@NonNull View itemView){
            super(itemView);
            cardView =itemView.findViewById(R.id.eachCardView);
            itemImageTv =itemView.findViewById(R.id.eachItemImageView);
            itemNameTv =itemView.findViewById(R.id.eachItemTextView);
            context = itemView.getContext();

        }

    }

}
