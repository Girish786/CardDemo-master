package com.delaroystudios.carddemo;

/**
 * Created by Shade on 5/9/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.delaroystudios.carddemo.Model.CardDemoModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Activity context;


    List<CardDemoModel> cardemoArraylist;
    public RecyclerAdapter(Activity context,List<CardDemoModel> cardemoArraylist) {
        this.context = context;
        this.cardemoArraylist = cardemoArraylist;
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemTitle;
        TextView itemDetail;
        Button  btnAccept,btnReject;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =(TextView)itemView.findViewById(R.id.item_detail);
            btnAccept=(Button)itemView.findViewById(R.id.btnAccept);
            btnReject=(Button)itemView.findViewById(R.id.btnReject);
            //position = getAdapterPosition();
           // Log.e("Mytag","titles[position]"+titles[position]);



        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {


        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int Position) {
         CardDemoModel cardemomodel = cardemoArraylist.get(Position);
        viewHolder.itemTitle.setText(cardemomodel.getTitles()[Position]);
        viewHolder.itemDetail.setText(cardemomodel.getDetails()[Position]);
        Picasso.with(context).load(cardemomodel.getImageUrl()[Position]).into(viewHolder.itemImage);
        viewHolder.btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,NotifyFoodCookingActivity.class);
              //  intent.putExtra("title",cardemomodel.getTitles()[Position]);
                //intent.putExtra("itemDetail",cardemomodel.getDetails()[Position]);
                //intent.putExtra("image",cardemomodel.getTitles()[Position]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        Log.e("Mytag","size"+cardemoArraylist.size());
        return cardemoArraylist.size();
    }
}