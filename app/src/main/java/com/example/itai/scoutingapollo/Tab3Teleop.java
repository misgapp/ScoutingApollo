package com.example.itai.scoutingapollo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Itai on 10/03/2017.
 */

public class Tab3Teleop  extends Fragment {


    TextView CornerTV, VortexTV, BeaconTV;
    Button PlusCorner, MinusCorner, MinusVortex, PlusVortex, PlusBeacon, MinusBeacon;

    int TV1 = 0;
    int TV2 = 0;
    int TV3 = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle   savedInstanceState) {
        //TODO slide to position

        View rootView = inflater.inflate(R.layout.tab3teleop, container, false);
        //return rootView;

         CornerTV = (TextView) rootView.findViewById(R.id.CornerTV);
        VortexTV = (TextView) rootView.findViewById(R.id.VortexTV);
        BeaconTV = (TextView) rootView.findViewById(R.id.BeaconTV);
        PlusVortex = (Button) rootView.findViewById(R.id.PlusVortex);
        PlusCorner = (Button) rootView.findViewById(R.id.PlusCorner);
        MinusCorner = (Button) rootView.findViewById(R.id.MinusCorner);
        MinusVortex = (Button) rootView.findViewById(R.id.MinusVortex);
        PlusBeacon = (Button) rootView.findViewById(R.id.PlusBeacon);
        MinusBeacon = (Button) rootView.findViewById(R.id.MinusBeacon);
        VortexTV.setText(Integer.toString(TV1));


        BeaconTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                BeaconsPressed = s;

            }
        });


        VortexTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                VortextGoals = s;
            }
        });

        CornerTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                CornerGoals = s;
            }
        });


        PlusBeacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                BeaconTV.setText(Integer.toString(TV3 + 1));
                TV3++;


            }
        });



        MinusBeacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV3>0) {
                    BeaconTV.setText(Integer.toString(TV3 - 1));
                    TV3--;
                }
                else {}

            }

        });

        PlusVortex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String vortxt = VortexTV.getText().toString();
                //int text = Integer.parseInt(vortxt);

                VortexTV.setText(Integer.toString(TV1 + 1));
                TV1++;


            }
        });



       MinusVortex.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                if (TV1>0) {
                    VortexTV.setText(Integer.toString(TV1 - 1));
                    TV1--;
                }
                else {}

           }

       });



        PlusCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String vortxt = VortexTV.getText().toString();
                //int text = Integer.parseInt(vortxt);

                CornerTV.setText(Integer.toString(TV2 + 1));
                TV2++;

            }
        });



        MinusCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TV2>0) {
                    CornerTV.setText(Integer.toString(TV2 - 1));
                    TV2--;
                }
                else {}

            }

        });


        return rootView;



    }

    public static Editable VortextGoals = new SpannableStringBuilder("0");
    public static Editable CornerGoals = new SpannableStringBuilder("0");
    public static Editable BeaconsPressed = new SpannableStringBuilder("0");


    public Editable GetBeaconsPressed(){

        return BeaconsPressed;
    }

    public Editable GetVortextGoals(){


            return VortextGoals;



    }


    public Editable GetCornerGoals(){

            return CornerGoals;

    }







}








