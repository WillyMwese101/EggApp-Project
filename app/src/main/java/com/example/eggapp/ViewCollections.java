package com.example.eggapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class ViewCollections extends AppCompatActivity {

    private Button AddCollect, view_btn;
    private EditText hs1,hs2, hs3;
    MyDBHelper dbHelper;
    int total1, total2, total3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_collections);

        AddCollect = (Button) findViewById(R.id.add_Coll_Viewcoll);
        view_btn = (Button)findViewById(R.id.view_btn);

        //SQLiteDatabase db = this.getReadableDatabase();
        //MyDBHelper.viewCollections();


        AddCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewCollections.this, MainActivity.class));
            }
        });

        /*view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getReadableDatabase();

                // Execute the SQL query
                Cursor cursor1 = db.rawQuery("SELECT SUM(House1) AS total FROM Poul_Collections", null);
                Cursor cursor2 = db.rawQuery("SELECT SUM(House2) AS total FROM Poul_Collections", null);
                Cursor cursor3 = db.rawQuery("SELECT SUM(House3) AS total FROM Poul_Collections", null);

                // Retrieve the total value

                if (cursor1.moveToFirst()) {
                    total1 = cursor1.getInt(cursor1.getColumnIndex());
                    hs1.setText(MyDBHelper.total1);
                }
                if (cursor2.moveToFirst()) {
                    total2 = cursor2.getInt(cursor2.getColumnIndex(House_2));
                    hs2.setText(MyDBHelper.total2);
                }
                if (cursor3.moveToFirst()) {
                    total3 = cursor3.getInt(cursor3.getColumnIndex(House_3));
                    hs3.setText(MyDBHelper.total3);
                }



                // Close the cursor and the database
                cursor1.close();
                cursor2.close();
                cursor3.close();
                db.close();
            }
        });*/
    }
}