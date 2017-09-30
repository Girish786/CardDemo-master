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
String[] title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_food_cooking);
        nameFood=(TextView)findViewById(R.id.nameFood);
        quantityFood=(TextView)findViewById(R.id.quantityFood);
        OrderItemImage=(ImageView)findViewById(R.id.OrderItemImage);
//        for(int )

       nameFood.setText(getIntent().getStringExtra("title"));
      quantityFood.setText(getIntent().getStringExtra("itemDetail"));
        int image=getIntent().getIntExtra("image",0);
//        Bitmap b = (Bitmap) getIntent().getParcelableExtra("image");
//       OrderItemImage.setImageBitmap(b);
      Picasso.with(NotifyFoodCookingActivity.this).load(image).into(OrderItemImage);
    }
}
