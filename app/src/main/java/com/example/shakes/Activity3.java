package com.example.shakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView,textViewCount;
    private String TAG = "mytag";
    private Button increment , decrement , btnFinal;
    private Integer price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        init();
        increment();
        decrement();
    }
    private void init(){

        price = getIntent().getIntExtra("price",0);
        Log.d(TAG, "onCreate: price "+price);

        imageView = findViewById(R.id.pImage);
        textView = findViewById(R.id.txtTotalPrice);
        increment = findViewById(R.id.btnIncrement);
        decrement = findViewById(R.id.btnDecrement);
        textViewCount = findViewById(R.id.txtCount);
        btnFinal = findViewById(R.id.btnFinalOrder);

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity3.this, "Order Placed", Toast.LENGTH_SHORT).show();
            }
        });

        textView.setText(price.toString());
    }
    void increment(){
        increment.setOnClickListener(v->{
            int count = Integer.parseInt(textViewCount.getText().toString());
            Integer newPrice = ++count * price;
            textView.setText(Integer.toString(newPrice));
            textViewCount.setText(Integer.toString(count));
        });
    }
    void decrement(){
        decrement.setOnClickListener(v->{
            int count = Integer.parseInt(textViewCount.getText().toString());
            Integer newPrice = --count * price;
            textView.setText(Integer.toString(newPrice));
            textViewCount.setText(Integer.toString(count));
        });
    }
    public  void Back2(View v){
        Intent i= new Intent(Activity3.this, OrderNow.class);
        startActivity(i);
    }
}
