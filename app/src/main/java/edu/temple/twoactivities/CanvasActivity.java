package edu.temple.twoactivities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        ActionBar actionBar = (ActionBar) getSupportActionBar();
        actionBar.setTitle("Canvas Activity");

        Intent intentB = getIntent();
        int color = intentB.getExtras().getInt("color");
        TextView textView = (TextView) findViewById(R.id.textView);
        Log.i("color clicked ","" + color);
        textView.setBackgroundColor(color);
    }
}
