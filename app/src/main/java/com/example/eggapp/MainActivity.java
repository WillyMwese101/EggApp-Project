package com.example.eggapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button AddColl, ViewColl;
    private EditText hse1,hse2,hse3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewColl = (Button) findViewById(R.id.view_coll);
        AddColl = (Button)findViewById(R.id.Add_Coll);
        hse1 = (EditText)findViewById(R.id.hse1);
        hse2 = (EditText)findViewById(R.id.hse2);
        hse3 = (EditText)findViewById(R.id.hse3);

        ViewColl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewCollections.class));
            }
        });

        Context my_context = this;

        AddColl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDBHelper.insertEggCollections(my_context, Integer.parseInt(hse1.getText().toString()),
                        Integer.parseInt(hse2.getText().toString()),
                        Integer.parseInt(hse1.getText().toString()));
                hse1.setText("");
                hse2.setText("");
                hse3.setText("");
            }
        });
    }
}