package com.example.shakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void order(View v){
        Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this , OrderNow.class);
        startActivity(i);
    }

}