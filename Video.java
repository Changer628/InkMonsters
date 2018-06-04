package com.shelfspace.michael.inkmonsters;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.shelfspace.michael.inkmonsters.R.id.videoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        final VideoView video = (VideoView) findViewById(videoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

        MediaController mediaController = new MediaController(this){
            @Override
            public boolean dispatchKeyEvent(KeyEvent event) {
                if(event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
                    Activity a = (Activity)getContext();
                    a.finish();
                }
                return true;
            }};
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

        video.setVideoURI(uri);

        Handler h = new Handler(Looper.getMainLooper());

        Runnable r = new Runnable() {
            @Override
            public void run() {
                //--code run in Main, UI thread
                video.start();
            }
        };

        h.postDelayed(r,200); //-- run after 2 seconds

    }
}
