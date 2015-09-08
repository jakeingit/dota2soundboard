package com.jakegosskuehn.axe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Anny on 8/12/2015.
 */
public class Lore extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lore);
        TextView tv = (TextView) findViewById(R.id.lore);
        TextView tv2 = (TextView) findViewById(R.id.loreTitle);
        tv.setText(R.string.dialog_message);
        tv2.setText(R.string.dialog_title);
    }
}
