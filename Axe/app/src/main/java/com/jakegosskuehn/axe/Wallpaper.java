package com.jakegosskuehn.axe;

import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


import com.squareup.picasso.Picasso;


public class Wallpaper extends ActionBarActivity {

    //**
   //Activty for maintaing several different wallpapers in a gridview
    //or a listview
    //Sets the background of the phone to these wallpapers
    //allows the user to download the image AND set as wallpapers
    //NEED TO CROP WALLPAPERS AND BRING RESOLUTION DOWN
    //OTHER WISE SHIT HITS THE FAN FOR DATA SPACE STORAGE/PROCESSING

    //LMAO, forgot to set layout to new wallpapers
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallpapers);

        ImageButton imageView = (ImageButton) findViewById(R.id.image1);
        ImageButton imageView2 = (ImageButton) findViewById(R.id.image2);
        ImageButton imageView3 = (ImageButton) findViewById(R.id.image3);
        ImageButton imageView4 = (ImageButton) findViewById(R.id.image4);
        ImageButton imageView5 = (ImageButton) findViewById(R.id.image5);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("IMAGE ONE PRESSED");
            }
        });
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int screenWidth = (int) (metrics.widthPixels * 0.33);
        //add imagebuttons
        Picasso.with(this)
                    .load(R.raw.a1b)
                .resize(screenWidth, screenWidth)
                .centerCrop()
                .into(imageView);
        Picasso.with(this) .load(R.raw.a2b)
                .resize(screenWidth, screenWidth)
                .centerCrop()
                        .into(imageView2);
        Picasso.with(this) .load(R.raw.a3b)
                .resize(screenWidth, screenWidth)
                        .centerCrop()
                .into(imageView3);
        Picasso.with(this) .load(R.raw.a4b)
                .resize(screenWidth, screenWidth)
                .centerCrop()
                .into(imageView4);
        Picasso.with(this) .load(R.raw.a5b)
                .resize(screenWidth, screenWidth)
                .centerCrop()
                .into(imageView5);

        /////////
        //FIRST IMAGEVIEWBUTTON
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(Wallpaper.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Do you want to set this as your new background?")
                        .setTitle(R.string.dialog_title);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        // User clicked OK button
                        WallpaperManager myWallpaperManager
                                = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            myWallpaperManager.setResource(R.raw.a1b);
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                });
                builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
//                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);

                dialog.show();
            }

        });
        /////
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(Wallpaper.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Do you want to set this as your new background?")
                        .setTitle(R.string.dialog_title);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        // User clicked OK button
                        WallpaperManager myWallpaperManager
                                = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            myWallpaperManager.setResource(R.raw.a2b);
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                });
                builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
//                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);

                dialog.show();
            }

        });
        /////
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(Wallpaper.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Do you want to set this as your new background?")
                        .setTitle(R.string.dialog_title);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        // User clicked OK button
                        WallpaperManager myWallpaperManager
                                = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            myWallpaperManager.setResource(R.raw.a3b);
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                });
                builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
//                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);

                dialog.show();
            }

        });

        /////
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(Wallpaper.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Do you want to set this as your new background?")
                        .setTitle(R.string.dialog_title);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        // User clicked OK button
                        WallpaperManager myWallpaperManager
                                = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            myWallpaperManager.setResource(R.raw.a4b);
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                });
                builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
//                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);

                dialog.show();
            }

        });

        /////
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(Wallpaper.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Do you want to set this as your new background?")
                        .setTitle(R.string.dialog_title);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        // User clicked OK button
                        WallpaperManager myWallpaperManager
                                = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            myWallpaperManager.setResource(R.raw.a5b);
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                });
                builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
//                dialog.getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);

                dialog.show();
            }

        });

        /////

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

