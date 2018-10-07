package com.example.ashjadhav.ganesh_pooja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Aarti_home extends AppCompatActivity {

    ListView aarti_list;
    String[] title={"Sukhkarta Dukhhaharta","Shendur lal Chadhayo","Jay Ganesh Jay Ganesh","Lavlavthi Vikrala","Durge Durgat Bhari","Yuge Athhavis","Yei Ho Vithhale","Datta Arti","Ganesh Stotra","Ghalin Lotangan","Mantra Pushpanjali","Shree Ganpati atharvshirsham"};
    Integer img_id[]={R.drawable.ganesha1,R.drawable.ganesha2,R.drawable.ganesha3,R.drawable.shiva,R.drawable.durga,R.drawable.vithhal,R.drawable.pandurang,R.drawable.shree_datta,R.drawable.stotra,R.drawable.dagdusheth_ganpati,R.drawable.pushpanjali,R.drawable.ganesh_strotra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarti_home);
        MyAdapterList adapter=new MyAdapterList(this,title,img_id);
        aarti_list=(ListView)findViewById(R.id.list);
        if(adapter!=null)
        aarti_list.setAdapter(adapter);

        aarti_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position=i;
                Intent intent=new Intent(Aarti_home.this,home.class);
                intent.putExtra("index",position);
                startActivity(intent);
            }
        });
    }
}
