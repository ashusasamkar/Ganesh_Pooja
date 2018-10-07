package com.example.ashjadhav.ganesh_pooja;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    MediaPlayer mp;
    ImageButton music;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    public void onViewCreated(View view,Bundle savedInstanceState) {
        music = (ImageButton) view.findViewById(R.id.audio);
        mp = MediaPlayer.create(getActivity(), R.raw.sukhkarta_dukhharta);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!mp.isPlaying()){
                    mp.start();
                    music.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);

                }

                else {
                    mp.pause();
                    music.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);


                }


                }


        });


        }
       public void onDestroyView() {
           super.onDestroyView();
           mp.stop();
       }

}
