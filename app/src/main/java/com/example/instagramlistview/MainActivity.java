package com.example.instagramlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listem;

    private ArrayAdapter<String> adapter;
    private int[] resim={R.drawable.backround1 ,R.drawable.blue_page ,R.drawable.giris ,R.drawable.kaydol,R.drawable.mavi_cerceve,R.drawable.mavi_kelebekler,R.drawable.mor_cerceve,
    R.drawable.registration,R.drawable.user};
    private Bitmap secresim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listem=findViewById(R.id.listem);
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_activated_1);
        listem.setAdapter(adapter);


    }
}