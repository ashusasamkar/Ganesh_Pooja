package com.example.ashjadhav.ganesh_pooja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Recipe extends AppCompatActivity {


    ListView prasad_list;
    String[] title={"Ukdiche Modak","Taliche Modak","Khirapat","Ravyache Ladu","Besan Ladu","Puran Poli"};
    Integer[]img_id={R.drawable.ukdiche_modak,R.drawable.fried_modak,R.drawable.khirapat,R.drawable.ravyache_ladu,R.drawable.besan_ladu,R.drawable.puran_poli};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        My_Recipe_Adapter adapter=new My_Recipe_Adapter(this,title,img_id);
        prasad_list=(ListView)findViewById(R.id.list);
        prasad_list.setAdapter(adapter);

        prasad_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int obj=i;
                switch (obj){

                    case 0:
                        Intent intent=new Intent(Recipe.this,Modak1.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(Recipe.this,Modak2.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(Recipe.this,Khirapat.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3=new Intent(Recipe.this,Ladu1.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4=new Intent(Recipe.this,Ladu2.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5=new Intent(Recipe.this,Puran_Poli.class);
                        startActivity(intent5);
                        break;

                        default:
                            Toast.makeText(Recipe.this, "Oops...!", Toast.LENGTH_SHORT).show();
                            break;










                }


            }
        });



    }
}
