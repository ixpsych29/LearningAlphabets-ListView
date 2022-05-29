package com.example.learningalphabets_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <String> alphabets = new ArrayList<String>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");
        alphabets.add("F");
        alphabets.add("G");
        alphabets.add("H");
        alphabets.add("I");
        alphabets.add("J");
        alphabets.add("K");
        alphabets.add("L");
        alphabets.add("M");
        alphabets.add("N");
        alphabets.add("O");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alphabets);

        listView = findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
    }
}
