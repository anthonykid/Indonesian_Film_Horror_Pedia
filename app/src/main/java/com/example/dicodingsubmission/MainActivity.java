package com.example.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Horror> list = new ArrayList<>();
    private String title = "List Film";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HorrorData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHorrorAdapter listHorrorAdapter = new ListHorrorAdapter(list);
        rvHeroes.setAdapter(listHorrorAdapter);

        listHorrorAdapter.setOnItemClickCallback(new ListHorrorAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Horror data) {
                showSelectedHorror(data);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHorrorAdapter cardViewHorrorAdapter = new CardViewHorrorAdapter(list);
        rvHeroes.setAdapter(cardViewHorrorAdapter);
    }

    private void showAbout(){
        Intent moveIntent = new Intent(getApplicationContext(), About.class);
        startActivity(moveIntent);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHorror(Horror horror) {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHorrorAdapter listHorrorAdapter = new ListHorrorAdapter(list);
        rvHeroes.setAdapter(listHorrorAdapter);
        Toast.makeText(this, "Kamu memilih " + horror.getName(), Toast.LENGTH_SHORT).show();
        Intent moveWithDataIntent = new Intent(getApplicationContext(), TampilList.class);
        moveWithDataIntent.putExtra("name",horror.getName());
        moveWithDataIntent.putExtra("deskripsi",horror.getDetail());
        moveWithDataIntent.putExtra("image", horror.getPhoto());
        startActivity(moveWithDataIntent);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "List Film";
                showRecyclerList();
                break;

            case R.id.action_cardview:
                title = "Film in CardView";
                showRecyclerCardView();
                break;

            case R.id.action_about:
                title = "About";
                showAbout();
                break;
        }
        setActionBarTitle(title);
    }
}
