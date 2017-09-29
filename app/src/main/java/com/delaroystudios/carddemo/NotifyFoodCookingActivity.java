package com.delaroystudios.carddemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NotifyFoodCookingActivity extends AppCompatActivity {
public TextView nameFood,quantityFood;
public     ImageView OrderItemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_food_cooking);
        nameFood=(TextView)findViewById(R.id.nameFood);
        quantityFood=(TextView)findViewById(R.id.quantityFood);
        OrderItemImage=(ImageView)findViewById(R.id.item_image);
//        for(int )
//        nameFood.setText(getIntent().getStringArrayExtra("title")[]);
//        quantityFood.setText(getIntent().getStringExtra("itemDetail"));
//       // Bitmap b = (Bitmap) getIntent().getParcelableExtra("image");
//       // OrderItemImage.setImageBitmap(b);
//        Picasso.with(NotifyFoodCookingActivity.this).load(R.drawable.android_image_1).into(OrderItemImage);
    }
}
