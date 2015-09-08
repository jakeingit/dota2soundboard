package com.jakegosskuehn.axe;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;
import com.apptracker.android.listener.AppModuleListener;
import com.apptracker.android.track.AppTracker;


public class MainActivity extends ActionBarActivity {

    //**
    private boolean shouldShowDialog;
    private int numberOfTimesAudioHasPlayed;
    private SoundPool soundPool;
    boolean loaded = false;
    boolean songloaded = false;
    private int soundboard_clip;
    private int soundboard_clip2;
    private int soundboard_clip3;
    private int soundboard_clip4;
    private int soundboard_clip5;
    private int soundboard_clip6;
    private int soundboard_clip7;
    private int soundboard_clip8;
    private int soundboard_clip9;
    private int soundboard_clip10;
    private int soundboard_clip11;
    private int soundboard_clip12;
    private int soundboard_clip13;
    private int soundboard_clip14;
    private int soundboard_clip15;
    private int soundboard_clip16;
    private int[] soundclips;
    String APIKEY = "TD8Coz94JhJTvbdjiRKlfEuvKOP2jLTl";


    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);


        //**
        Toast t = Toast.makeText(this, "Tap the Hero!", Toast.LENGTH_LONG);
        t.show();

        Button b1 = (Button) findViewById(R.id.lore);
        Button b2 = (Button) findViewById(R.id.tips);
        Button b3 = (Button) findViewById(R.id.more);
        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);

        //poppop
        AppTracker.setModuleListener(leadboltListener);

        if(savedInstanceState == null) {
            // Initialize Leadbolt SDK with your api key
            AppTracker.startSession(getApplicationContext(),APIKEY);
        }
        // cache Leadbolt Ad without showing it
        AppTracker.loadModuleToCache(getApplicationContext(),"inapp");
//lol
        String fuck = "lol";

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Lore.class);
                startActivity(i);



                //TAKE TO LORE ACTIVITY
                // 1. Instantiate an AlertDialog.Builder with its constructor
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//
//// 2. Chain together various setter methods to set the dialog characteristics
//                builder.setMessage(R.string.dialog_message)
//                        .setTitle(R.string.dialog_title);
//
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//
//                    }
//                });
//
//// 3. Get the AlertDialog from create()
//
//                AlertDialog dialog = builder.create();
////                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);
//
////                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                dialog.show();
            }
        });
        //TIPS
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sets a link to the GP store to my other apps.
                System.out.println("More");
                Intent i = new Intent(MainActivity.this, Webview.class);
                startActivity(i);
            }
        });
//why is shit hitting the fan
        //SETBACKGROUND
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //INTENT TO NEW ACTIVITY FOR WALLPAPERS
                Intent i = new Intent(MainActivity.this, Wallpaper.class);
                startActivity(i);


//                WallpaperManager myWallpaperManager
//                        = WallpaperManager.getInstance(getApplicationContext());
//                try {
//                    myWallpaperManager.setResource(R.raw.rub);
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//                }
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Plays the sound files
                //Toast.makeText(MainActivity.this, "audio", Toast.LENGTH_SHORT).show();
                playTheSoundFile(v);
            }
        });

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        // Load the sound
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });
        ///** INTALIZE
        soundclips = new int[16];
        //***** The audio clip to be used
        //FUCK MY MOUSE
        soundboard_clip = soundPool.load(this, R.raw.a1, 1);
        soundclips[0] = soundboard_clip;
        soundboard_clip2 = soundPool.load(this, R.raw.a2, 1);
        soundclips[1] = soundboard_clip2;
        soundboard_clip3 = soundPool.load(this, R.raw.a3, 1);
        soundclips[2] = soundboard_clip3;
        soundboard_clip4 = soundPool.load(this, R.raw.a4, 1);
        soundclips[3] = soundboard_clip4;
        soundboard_clip5 = soundPool.load(this, R.raw.a5, 1);
        soundclips[4] = soundboard_clip5;
        soundboard_clip6 = soundPool.load(this, R.raw.a6, 1);
        soundclips[5] = soundboard_clip6;
        soundboard_clip7 = soundPool.load(this, R.raw.a7, 1);
        soundclips[6] = soundboard_clip7;
        soundboard_clip8 = soundPool.load(this, R.raw.a8, 1);
        soundclips[7] = soundboard_clip8;
        soundboard_clip9 = soundPool.load(this, R.raw.a9, 1);
        soundclips[8] = soundboard_clip9;
        soundboard_clip10 = soundPool.load(this, R.raw.a10, 1);
        soundclips[9] = soundboard_clip10;
        soundboard_clip11 = soundPool.load(this, R.raw.a11, 1);
        soundclips[10] = soundboard_clip11;
        soundboard_clip12 = soundPool.load(this, R.raw.a12, 1);
        soundclips[11] = soundboard_clip12;
        soundboard_clip13 = soundPool.load(this, R.raw.a13, 1);
        soundclips[12] = soundboard_clip13;
        soundboard_clip14 = soundPool.load(this, R.raw.a14, 1);
        soundclips[13] = soundboard_clip14;
        soundboard_clip15 = soundPool.load(this, R.raw.a15, 1);
        soundclips[14] = soundboard_clip15;
        soundboard_clip16 = soundPool.load(this, R.raw.a16, 1);
        soundclips[15] = soundboard_clip16;



//        Toast.makeText(MainActivity.this,
//                "Audio Loaded", Toast.LENGTH_SHORT).show();

    }

    private AppModuleListener leadboltListener = new AppModuleListener() {
        @Override
        public void onModuleLoaded(String location) {
            // Add code here to pause game and/or all media including audio
        }
        @Override
        public void onModuleFailed(String location, String error, boolean isCache) {}
        @Override
        public void onModuleClosed(String location) {
            // Add code here to resume game and/or all media including audio
        }
        @Override
        public void onModuleClicked(String location) {}
        @Override
        public void onModuleCached(String location) {
            System.out.println("FUCK YOU FUCKING FUCKER");
            AppTracker.loadModule(getApplicationContext(),"inapp");
        }
        @Override
        public void onMediaFinished(boolean viewCompleted) {
            if(viewCompleted) {
                Log.i("AppTracker", "User finished watching rewarded video");
            } else {
                Log.i("AppTracker", "User skipped watching rewarded video");
            }
        }
    };


    public void playTheSoundFile(View view)
    {

        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volume = actualVolume / maxVolume;
        //
        boolean uno = (loaded);

        //plays if it is loaded
        if(uno)

        {    Random r = new Random();
            int soundclip = soundclips[r.nextInt(soundclips.length)];

            soundPool.play(soundclip, volume, volume, 1, 0, 1f);
            Log.e("Test", "Played audio");
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

