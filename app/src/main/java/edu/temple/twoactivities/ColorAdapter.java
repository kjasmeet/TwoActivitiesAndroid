package edu.temple.twoactivities;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by Jasmeet Kaur on 9/22/2016.
 */
public class ColorAdapter extends ArrayAdapter {

    String[] colorChoice;
    int color;

    public ColorAdapter(Context context, int resource, String[] list){
        super(context, resource, list);
        this.colorChoice = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.activity_palette, parent, false);

            TextView textView = (TextView) convertView.findViewById(R.id.textColors);
            textView.setText(colorChoice[position]);

            if(position == 0){
                convertView.setBackgroundColor(Color.RED);
            }else if(position == 1){
                convertView.setBackgroundColor(Color.GREEN);
            }else if(position == 2){
                convertView.setBackgroundColor(Color.YELLOW);
            }else if(position == 3){
                convertView.setBackgroundColor(Color.BLUE);
            }else if(position == 4){
                convertView.setBackgroundColor(Color.GRAY);
            }else if(position == 5){
                convertView.setBackgroundColor(Color.CYAN);
            }

        }


        return convertView;
    }

    public int getColor(){
        return color;
    }
}
