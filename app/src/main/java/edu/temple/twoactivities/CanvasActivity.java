package edu.temple.twoactivities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Intent intentB = getIntent();
        int color = intentB.getExtras().getInt("color");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setBackgroundColor(color);
    }
}
