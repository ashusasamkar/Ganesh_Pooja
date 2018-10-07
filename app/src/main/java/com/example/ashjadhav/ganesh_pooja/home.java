package com.example.ashjadhav.ganesh_pooja;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class home extends AppCompatActivity {

    ImageButton home,exit;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        int val=getIntent().getIntExtra("index",-1);

        switch(val){
            case 0:
                Fragment1 frag1=new Fragment1();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.home,frag1);
                ft.commit();
                break;

            case 1:
                Fragment2 frag2=new Fragment2();
                FragmentManager fm2=getSupportFragmentManager();
                FragmentTransaction ft2=fm2.beginTransaction();
                ft2.replace(R.id.home,frag2);
                ft2.commit();
                break;

            case 2:
                Fragment3 frag3=new Fragment3();
                FragmentManager fm3=getSupportFragmentManager();
                FragmentTransaction ft3=fm3.beginTransaction();
                ft3.replace(R.id.home,frag3);
                ft3.commit();
                break;
            case 3:
                Fragment4 frag4=new Fragment4();
                FragmentManager fm4=getSupportFragmentManager();
                FragmentTransaction ft4=fm4.beginTransaction();
                ft4.replace(R.id.home,frag4);
                ft4.commit();
                break;


            case 4:
                Fragment5 frag5=new Fragment5();
                FragmentManager fm5=getSupportFragmentManager();
                FragmentTransaction ft5=fm5.beginTransaction();
                ft5.replace(R.id.home,frag5);
                ft5.commit();
                break;

            case 5:
                Fragment6 frag6=new Fragment6();
                FragmentManager fm6=getSupportFragmentManager();
                FragmentTransaction ft6=fm6.beginTransaction();
                ft6.replace(R.id.home,frag6);
                ft6.commit();
                break;

            case 6:
                Fragment7 frag7=new Fragment7();
                FragmentManager fm7=getSupportFragmentManager();
                FragmentTransaction ft7=fm7.beginTransaction();
                ft7.replace(R.id.home,frag7);
                ft7.commit();
                break;

            case 7:
                Fragment8 frag8=new Fragment8();
                FragmentManager fm8=getSupportFragmentManager();
                FragmentTransaction ft8=fm8.beginTransaction();
                ft8.replace(R.id.home,frag8);
                ft8.commit();
                break;

            case 8:
                Fragment9 frag9=new Fragment9();
                FragmentManager fm9=getSupportFragmentManager();
                FragmentTransaction ft9=fm9.beginTransaction();
                ft9.replace(R.id.home,frag9);
                ft9.commit();
                break;

            case 9:
                Fragment10 frag10=new Fragment10();
                FragmentManager fm10=getSupportFragmentManager();
                FragmentTransaction ft10=fm10.beginTransaction();
                ft10.replace(R.id.home,frag10);
                ft10.commit();
                break;

            case 10:
                Fragment11 frag11=new Fragment11();
                FragmentManager fm11=getSupportFragmentManager();
                FragmentTransaction ft11=fm11.beginTransaction();
                ft11.replace(R.id.home,frag11);
                ft11.commit();
                break;
            case 11:
                Fragment12 frag12=new Fragment12();
                FragmentManager fm12=getSupportFragmentManager();
                FragmentTransaction ft12=fm12.beginTransaction();
                ft12.replace(R.id.home,frag12);
                ft12.commit();
                break;

                default:
                    Toast.makeText(this, "oops..", Toast.LENGTH_SHORT).show();

        }

        home=(ImageButton)findViewById(R.id.home_button);
        exit=(ImageButton)findViewById(R.id.exit);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(home.this,MainActivity.class);
                startActivity(i);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);
            }
        });


    }

    public void next_click(View view){
        if(view==findViewById(R.id.next1)){
            Fragment2 frag2 = new Fragment2();
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.home, frag2);
            ft2.commit();
        }
        if(view==findViewById(R.id.next2)) {
            Fragment3 frag3 = new Fragment3();
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.home, frag3);
            ft2.commit();
        }
        if(view==findViewById(R.id.next3)) {
            Fragment4 frag4 = new Fragment4();
            FragmentManager fm4 = getSupportFragmentManager();
            FragmentTransaction ft4 = fm4.beginTransaction();
            ft4.replace(R.id.home, frag4);
            ft4.commit();
        }
        if(view==findViewById(R.id.next4)) {
            Fragment5 frag5 = new Fragment5();
            FragmentManager fm5 = getSupportFragmentManager();
            FragmentTransaction ft5 = fm5.beginTransaction();
            ft5.replace(R.id.home, frag5);
            ft5.commit();
        }
        if(view==findViewById(R.id.next5)) {
            Fragment6 frag6 = new Fragment6();
            FragmentManager fm6 = getSupportFragmentManager();
            FragmentTransaction ft6 = fm6.beginTransaction();
            ft6.replace(R.id.home, frag6);
            ft6.commit();
        }

        if(view==findViewById(R.id.next6)) {
            Fragment7 frag7 = new Fragment7();
            FragmentManager fm7 = getSupportFragmentManager();
            FragmentTransaction ft7 = fm7.beginTransaction();
            ft7.replace(R.id.home, frag7);
            ft7.commit();
        }

        if(view==findViewById(R.id.next7)) {
            Fragment8 frag8 = new Fragment8();
            FragmentManager fm8 = getSupportFragmentManager();
            FragmentTransaction ft8 = fm8.beginTransaction();
            ft8.replace(R.id.home, frag8);
            ft8.commit();
        }
        if(view==findViewById(R.id.next8)) {
            Fragment9 frag9 = new Fragment9();
            FragmentManager fm9 = getSupportFragmentManager();
            FragmentTransaction ft9 = fm9.beginTransaction();
            ft9.replace(R.id.home, frag9);
            ft9.commit();
        }
        if(view==findViewById(R.id.next9)) {
            Fragment10 frag10 = new Fragment10();
            FragmentManager fm10 = getSupportFragmentManager();
            FragmentTransaction ft10 = fm10.beginTransaction();
            ft10.replace(R.id.home, frag10);
            ft10.commit();
        }
        if(view==findViewById(R.id.next10)) {
            Fragment11 frag11 = new Fragment11();
            FragmentManager fm11 = getSupportFragmentManager();
            FragmentTransaction ft11= fm11.beginTransaction();
            ft11.replace(R.id.home, frag11);
            ft11.commit();
        }
        if(view==findViewById(R.id.next11)) {
            Fragment12 frag12 = new Fragment12();
            FragmentManager fm12 = getSupportFragmentManager();
            FragmentTransaction ft12= fm12.beginTransaction();
            ft12.replace(R.id.home, frag12);
            ft12.commit();
        }


    }

    public void back_click(View view){

        if(view==findViewById(R.id.back2)) {
            Fragment1 frag1 = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.home, frag1);
            ft.commit();

        }

        if(view==findViewById(R.id.back3)){
            Fragment2 frag2 = new Fragment2();
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.home, frag2);
            ft2.commit();
        }
        if(view==findViewById(R.id.back4)) {
            Fragment3 frag3 = new Fragment3();
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.home, frag3);
            ft2.commit();
        }
        if(view==findViewById(R.id.back5)) {
            Fragment4 frag4 = new Fragment4();
            FragmentManager fm4 = getSupportFragmentManager();
            FragmentTransaction ft4 = fm4.beginTransaction();
            ft4.replace(R.id.home, frag4);
            ft4.commit();
        }
        if(view==findViewById(R.id.back6)) {
            Fragment5 frag5 = new Fragment5();
            FragmentManager fm5 = getSupportFragmentManager();
            FragmentTransaction ft5 = fm5.beginTransaction();
            ft5.replace(R.id.home, frag5);
            ft5.commit();
        }
        if(view==findViewById(R.id.back7)) {
            Fragment6 frag6 = new Fragment6();
            FragmentManager fm6 = getSupportFragmentManager();
            FragmentTransaction ft6 = fm6.beginTransaction();
            ft6.replace(R.id.home, frag6);
            ft6.commit();
        }

        if(view==findViewById(R.id.back8)) {
            Fragment7 frag7 = new Fragment7();
            FragmentManager fm7 = getSupportFragmentManager();
            FragmentTransaction ft7 = fm7.beginTransaction();
            ft7.replace(R.id.home, frag7);
            ft7.commit();
        }

        if(view==findViewById(R.id.back9)) {
            Fragment8 frag8 = new Fragment8();
            FragmentManager fm8 = getSupportFragmentManager();
            FragmentTransaction ft8 = fm8.beginTransaction();
            ft8.replace(R.id.home, frag8);
            ft8.commit();
        }
        if(view==findViewById(R.id.back10)) {
            Fragment9 frag9 = new Fragment9();
            FragmentManager fm9 = getSupportFragmentManager();
            FragmentTransaction ft9 = fm9.beginTransaction();
            ft9.replace(R.id.home, frag9);
            ft9.commit();
        }
        if(view==findViewById(R.id.back11)) {
            Fragment10 frag10 = new Fragment10();
            FragmentManager fm10 = getSupportFragmentManager();
            FragmentTransaction ft10 = fm10.beginTransaction();
            ft10.replace(R.id.home, frag10);
            ft10.commit();
        }
        if(view==findViewById(R.id.back12)) {
            Fragment11 frag11 = new Fragment11();
            FragmentManager fm11 = getSupportFragmentManager();
            FragmentTransaction ft11 = fm11.beginTransaction();
            ft11.replace(R.id.home, frag11);
            ft11.commit();
        }

    }

}
