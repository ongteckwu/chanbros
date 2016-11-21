package com.example.ongteckwu.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class ScrollingActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    //This is our tablayout
    private TabLayout tabLayout;

    //This is our viewPager
    public ViewPager viewPager;

    private FloatingSearchView searchView;

    public ViewPager getViewPager() {
        return viewPager;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        // Initializing the tablayout
        tabLayout=(TabLayout) findViewById(R.id.tabs);

        //Initializing viewPager
        viewPager=(ViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(this);

//        searchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
//
//        searchView.setOnSearchListener(new FloatingSearchView.OnSearchListener() {
//            @Override
//            public void onSuggestionClicked(final SearchSuggestion searchSuggestion) {
//
//            }
//
//            @Override
//            public void onSearchAction(String query) {
//                viewPager.setCurrentItem(1);
//            }
//        });
    }



    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }
    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void onRadioButtonClicked(View view) {
        boolean checked=((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_fast:
                if (checked)
                    // choose fast button
                    break;
            case R.id.radio_slow:
                if (checked)
                    // choose slow buton
                    break;
        }
    }

    public void RouteToast(View view) {
        try {
            //finding the price
            EditText price=(EditText) findViewById(R.id.editText2);
            double budget = Double.parseDouble(price.getText().toString());
            //starred checkboxes for viewing selections
            CheckBox ion=(CheckBox) findViewById(R.id.starION);
            CheckBox flyer=(CheckBox) findViewById(R.id.starFlyer);
            CheckBox sentosa=(CheckBox) findViewById(R.id.starSentosa);
            CheckBox temple=(CheckBox) findViewById(R.id.starTemple);
            CheckBox garden=(CheckBox) findViewById(R.id.starGarden);
            CheckBox museum=(CheckBox) findViewById(R.id.starMuseum);
            CheckBox vivo=(CheckBox) findViewById(R.id.starVivo);
            CheckBox zoo=(CheckBox) findViewById(R.id.starZoo);


            ArrayList<String> loplaces = new ArrayList<>(); //list of places

            if (ion.isChecked()) {
                loplaces.add("ION Orchard");
            }
            if (flyer.isChecked()) {
                loplaces.add("Singapore Flyer");
            }
            if (sentosa.isChecked()) {
                loplaces.add("Resorts World Sentosa");
            }
            if (temple.isChecked()) {
                loplaces.add("Buddha Tooth Relic Temple");
            }
            if (museum.isChecked()) {
                loplaces.add("Peranakan Museum");
            }
            if (garden.isChecked()) {
                loplaces.add("Botanic Gardens");
            }
            if (vivo.isChecked()) {
                loplaces.add("Vivo City");
            }
            if (zoo.isChecked()) {
                loplaces.add("Zoo");
            }

            if (loplaces.size() == 0) { throw new ArithmeticException(); } //0 places, gotta be an arithmetic error right? ;)

            //arraylist for the list of places
            String[] placeArray = new String[loplaces.size()];
            placeArray = loplaces.toArray(placeArray);


            RadioButton fastSolver=(RadioButton) findViewById(R.id.radio_fast);

            String[][] result;
            if (!fastSolver.isChecked() && loplaces.size() >= 6) { //keeping a threshold for 6 places
                Toast.makeText(ScrollingActivity.this, "Try again with fast mode", Toast.LENGTH_SHORT).show();
            } else {
                if (fastSolver.isChecked()) { //lousy algo
                    result = MyClass.result((FastAlgorithm.fastPath(placeArray)), budget);
                } else {
                    //standard stuff
                    ArrayList<String> listOfPlaces = MyClass.encodePlaces(placeArray);
                    ArrayList<ArrayList<String>> possiblePermutations = MyClass.possiblePaths(listOfPlaces);
                    result = MyClass.result(possiblePermutations, budget);
                }

                //please replace this GodWu
//                Toast.makeText(ScrollingActivity.this, MyClass.convertResultToString(result),Toast.LENGTH_LONG).show();
                Intent newIntent = new Intent(this, PaulActivity.class).putExtra("RESULT", result);
                startActivity(newIntent);
            }
        } catch (NumberFormatException e) {
            Toast.makeText(ScrollingActivity.this, "Please enter your budget!", Toast.LENGTH_SHORT).show();
        } catch (ArithmeticException e) {
            Toast.makeText(ScrollingActivity.this, "Please select the places you're visiting!", Toast.LENGTH_SHORT).show();
        }
    }
}
