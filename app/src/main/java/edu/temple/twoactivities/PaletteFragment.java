package edu.temple.twoactivities;


import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class PaletteFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    ColorAdapter adapter;

    public PaletteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        final String[] colorChoices = res.getStringArray(R.array.myColorArray);
        adapter = new ColorAdapter(getContext(), android.R.layout.simple_list_item_1, colorChoices);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView listView = (ListView) view.findViewById(R.id.colorListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListener.onFragmentInteraction(position);
            }
        });
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_palette, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(int position);
    }
}
