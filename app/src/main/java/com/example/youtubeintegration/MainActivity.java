package com.example.youtubeintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends YouTubeBaseActivity {
  Button b1;
  YouTubePlayerView youTubePlayerView;
  YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    b1=findViewById(R.id.button);
    youTubePlayerView=findViewById(R.id.youtubeapi);
    onInitializedListener=new YouTubePlayer.OnInitializedListener() {
        @Override
        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//            youTubePlayer.loadVideo("72guI_RdqUo");
//            youTubePlayer.loadPlaylist("PLLNMtg6QEY4ePU7aQg5zCYx08HU3bNCgp");
            ArrayList<String> youtubeList=new ArrayList<>();
            youtubeList.add("hKB-YGF14SY");
            youtubeList.add("t6Fzrje4Irs");
            youTubePlayer.loadVideos(youtubeList);

        }

        @Override
        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        }
    };
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         youTubePlayerView.initialize("AIzaSyBw4CTpctN1RzgVUy3f9_MT5H6v3EaCTlA",onInitializedListener);

        }
    });

    }

}