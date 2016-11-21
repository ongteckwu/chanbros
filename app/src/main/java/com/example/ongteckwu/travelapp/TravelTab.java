package com.example.ongteckwu.travelapp;

/**
 * Created by ongteckwu on 18/11/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;


//Our class extending fragment
public class TravelTab extends Fragment {

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.travel_tab, container, false);
        final EditText price = (EditText) inflatedView.findViewById(R.id.editText2);

        price.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    String newString = String.format(Locale.US, "%.2f", Double.parseDouble(price.getText().toString()));
                    price.setText(newString);
                }
                return false;
            }
        });
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return inflatedView;
    }
}
