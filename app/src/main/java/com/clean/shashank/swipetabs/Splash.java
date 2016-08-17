package com.clean.shashank.swipetabs;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.util.Log;

/**
 * Created by shashank on 14/8/16.
 */
public class Splash extends Activity {

    public final String TAG = "Splash";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Log.d(TAG, "on create of splash");

        MediaPlayer splashSong = MediaPlayer.create(Splash.this,R.raw.splash_music);
        splashSong.start();
        Thread timer = new Thread() {
            /*
            This is waiting for 5000ms = 5seconds
             */
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent("com.clean.shashank.swipetabs.MAINACTIVITY");
                    startActivity(openStartingPoint);
                    Log.d(TAG, "in finally");
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}
