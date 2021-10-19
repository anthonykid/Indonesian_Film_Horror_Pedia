package com.example.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilList extends AppCompatActivity implements View.OnClickListener{
    TextView listfilm,descfilm;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_list);
        listfilm = findViewById(R.id.textt);
        descfilm = findViewById(R.id.deskripsi);
        gambar = findViewById(R.id.gbr);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        String receivedDesc =  intent.getStringExtra("deskripsi");
        int receivedImage = intent.getIntExtra("image",0);
        listfilm.setText(receivedName);
        gambar.setImageResource(receivedImage);
        descfilm.setText(receivedDesc);
        getSupportActionBar().setTitle("Deskripsi Film");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    public void setBack() {
        super.onBackPressed();
    }
    public void onClick(View v) {
        }
    }