package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class videos extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener {


    String claveYoutube = "AIzaSyA_Imq3R746AZ9UVts423LqnSB2l9ciVl8";
    YouTubePlayerView youTubePlayerView;
    YouTubePlayerView youTubePlayerView2;
    YouTubePlayerView youTubePlayerView3;
    YouTubePlayerView youTubePlayerView4;
    YouTubePlayerView youTubePlayerView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view1);
        youTubePlayerView.initialize(claveYoutube,this);
       /* youTubePlayerView2=(YouTubePlayerView)findViewById(R.id.youtube_view2);
        youTubePlayerView2.initialize(claveYoutube,this);
        youTubePlayerView3=(YouTubePlayerView)findViewById(R.id.youtube_view3);
        youTubePlayerView3.initialize(claveYoutube,this);
        youTubePlayerView4=(YouTubePlayerView)findViewById(R.id.youtube_view4);
        youTubePlayerView4.initialize(claveYoutube,this);
        youTubePlayerView5=(YouTubePlayerView)findViewById(R.id.youtube_view5);
        youTubePlayerView5.initialize(claveYoutube,this);*/

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        if(!b){
            youTubePlayer.cueVideo("hJLtXVO9k24");
            //youTubePlayer2.cueVideo("lWIQ7QCxp8Q");
            //youTubePlayer3.cueVideo("DAmyax6EZD8");
            //youTubePlayer4.cueVideo("qDXp-oMwkug");
            //youTubePlayer5.cueVideo("5-mq5C4Vx4o");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();

        }else {
            String error = "error al iniciar youtube" + youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_SHORT).show();
        }
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if(requestCode == 1){

            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
