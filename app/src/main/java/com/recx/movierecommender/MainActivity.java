package com.recx.movierecommender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Toast.makeText(this,"Logged in as:"+intent.getStringExtra("Name")+" Email:"+intent.getStringExtra("Email"),Toast.LENGTH_LONG).show();
    }
}
