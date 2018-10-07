package com.example.ashjadhav.ganesh_pooja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

     ImageButton sthapna,daily,visrjan,sahitya,ganesh_aarti,food_recipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sthapna=(ImageButton)findViewById(R.id.pooja_vidhi);
        sthapna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Pooja_vidhi.class);
                startActivity(i);

                }
        });

        daily=(ImageButton)findViewById(R.id.daily_pooja) ;
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Daily_pooja.class);
                startActivity(i);

            }
        });

        visrjan=(ImageButton)findViewById(R.id.visrjan);
        visrjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Visarjan.class);
                startActivity(i);
            }
        });
        sahitya=(ImageButton)findViewById(R.id.sahitya);
        sahitya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Pooja_sahitya.class);
                startActivity(i);
            }
        });

        ganesh_aarti=(ImageButton)findViewById(R.id.aarti_button);
        ganesh_aarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Aarti_home.class);
                startActivity(i);


            }
        });

        food_recipe=(ImageButton)findViewById(R.id.food);
        food_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Recipe.class);
                startActivity(i);

            }
        });
    }
}
