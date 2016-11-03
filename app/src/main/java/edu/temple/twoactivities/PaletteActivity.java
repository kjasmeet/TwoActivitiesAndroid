package edu.temple.twoactivities;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;


public class PaletteActivity extends FragmentActivity implements PaletteFragment.OnFragmentInteractionListener, CanvasFragment.OnFragmentInteractionListener{

    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.view_fragment, new PaletteFragment());
        transaction.addToBackStack(null);
        transaction.commit();


    }

    @Override
    public void onFragmentInteraction(int position) {
        int chosenColor = 0;

        if (position == 0) {
            chosenColor = Color.RED;
        } else if (position == 1) {
            chosenColor = Color.GREEN;
        } else if (position == 2) {
            chosenColor = Color.YELLOW;
        } else if (position == 3) {
            chosenColor = Color.BLUE;
        } else if (position == 4) {
            chosenColor = Color.GRAY;
        } else if (position == 5) {
            chosenColor = Color.CYAN;
        }

        Bundle bundle = new Bundle();
        bundle.putInt("color", chosenColor);
        CanvasFragment canvasFragment = new CanvasFragment();
        canvasFragment.setArguments(bundle);

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.view_fragment, canvasFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void canvasFragmentInteraction(String string) {

    }

}
