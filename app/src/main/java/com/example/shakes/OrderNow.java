package com.example.shakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class OrderNow extends AppCompatActivity {
    private int position;
    private  int price[] = {50,80,70,60};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_now);

        ImageButton bt1 =findViewById(R.id.image1);
        ImageButton bt2 =findViewById(R.id.image2);
        ImageButton bt3 =findViewById(R.id.image3);
        ImageButton bt4 =findViewById(R.id.image4);

        bt1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderNow.this,"Button 1 Clicked",Toast.LENGTH_SHORT).show();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame1,new FragmentA());
                ft.commit();
                position =0;
            }
        });

        bt2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderNow.this,"Button 2 Clicked",Toast.LENGTH_SHORT).show();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame1,new FragmentC());
                ft.commit();
                position=1;
            }
        });

        bt3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderNow.this,"Button 3 Clicked",Toast.LENGTH_SHORT).show();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame1,new FragmentB());
                ft.commit();
                position =2;
            }
        });

        bt4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderNow.this,"Button 4 Clicked",Toast.LENGTH_SHORT).show();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame1,new FragmentD());
                ft.commit();
                position=3;
            }
        });
    }
    public void addCart(View v){
        Toast.makeText(OrderNow.this,"Add to Cart Button Clicked",Toast.LENGTH_SHORT).show();
        Intent i =new Intent(OrderNow.this, Activity3.class);
        i.putExtra("price","price[position]");
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(OrderNow.this, MainActivity.class);
        startActivity(i);
    }
}

