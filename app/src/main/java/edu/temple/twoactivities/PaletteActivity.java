package edu.temple.twoactivities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class PaletteActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_palette);

        ListView myColorPalette = (ListView) findViewById(R.id.colorListView);
        String[] colorChoices = new String[]{"Red", "Green", "Yellow", "Blue", "Gray", "Cyan"};
        ColorAdapter arrayAdapter = new ColorAdapter(PaletteActivity.this, android.R.layout.simple_list_item_1, colorChoices);

        myColorPalette.setAdapter(arrayAdapter);


        myColorPalette.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int chosenColor;
                if (position == 0) {
                    chosenColor = Color.RED;
                    startNewActivity(chosenColor);
                } else if (position == 1) {
                    chosenColor = Color.GREEN;
                    startNewActivity(chosenColor);
                } else if (position == 2) {
                    chosenColor = Color.YELLOW;
                    startNewActivity(chosenColor);
                } else if (position == 3) {
                    chosenColor = Color.BLUE;
                    startNewActivity(chosenColor);
                } else if (position == 4) {
                    chosenColor = Color.GRAY;
                    startNewActivity(chosenColor);
                } else if (position == 5) {
                    chosenColor = Color.CYAN;
                    startNewActivity(chosenColor);
                }
            }
        });


    }
    public void startNewActivity(int color) {
        Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
        intent.putExtra("color", color);
        startActivity(intent);
    }

}
