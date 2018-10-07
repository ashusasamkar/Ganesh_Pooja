package com.example.ashjadhav.ganesh_pooja;
import android.view.View;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pooja_sahitya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pooja_sahitya);
       Fragment_list frag=new Fragment_list();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.pooja_list,frag);
        ft.commit();

        }
        public void next(View view){

        if(view==findViewById(R.id.next_1)){
            Fragment_list2 frag=new Fragment_list2();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.pooja_list,frag);
            ft.commit();
        }

            if(view==findViewById(R.id.next_2)){
                Fragment_list3 frag=new Fragment_list3();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }

            if(view==findViewById(R.id.next_3)){
                Fragment_list4 frag=new Fragment_list4();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }
            if(view==findViewById(R.id.next_4)){
                Fragment_list5 frag=new Fragment_list5();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }

        }

        public void back(View view){

            if(view==findViewById(R.id.back_5)){
                Fragment_list4 frag=new Fragment_list4();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }
            if(view==findViewById(R.id.back_4)){
                Fragment_list3 frag=new Fragment_list3();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }
            if(view==findViewById(R.id.back_3)){
                Fragment_list2 frag=new Fragment_list2();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }
            if(view==findViewById(R.id.back_2)){
                Fragment_list frag=new Fragment_list();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.pooja_list,frag);
                ft.commit();
            }


        }


}
