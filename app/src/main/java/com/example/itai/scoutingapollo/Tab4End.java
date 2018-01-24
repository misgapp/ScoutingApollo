package com.example.itai.scoutingapollo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;

/**
 * Created by Itai on 10/03/2017.
 */






public class Tab4End  extends Fragment {


    CheckBox beacon0, beacon1, beacon2, beacon3, beacon4;
    CheckBox CapNone, CapLow, CapHigh, CapCapped;
    Switch WinningStateSwitch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO slide to position
        View rootView = inflater.inflate(R.layout.tab4endgame, container, false);


        beacon0 = (CheckBox) rootView.findViewById(R.id.beacon0);
        beacon1 = (CheckBox) rootView.findViewById(R.id.beacon1);
        beacon2 = (CheckBox) rootView.findViewById(R.id.beacon2);
        beacon3 = (CheckBox) rootView.findViewById(R.id.beacon3);
        beacon4 = (CheckBox) rootView.findViewById(R.id.beacon4);
        CapNone = (CheckBox) rootView.findViewById(R.id.CapNone);
        CapLow = (CheckBox) rootView.findViewById(R.id.CapLow);
        CapHigh = (CheckBox) rootView.findViewById(R.id.CapHigh);
        CapCapped = (CheckBox) rootView.findViewById(R.id.CapCapped);
        WinningStateSwitch = (Switch) rootView.findViewById(R.id.WinningStateSwitch);


        beacon0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beacon0.setChecked(true);
                beacon1.setChecked(false);
                beacon2.setChecked(false);
                beacon3.setChecked(false);
                beacon4.setChecked(false);

            }
        });

        beacon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beacon0.setChecked(false);
                beacon1.setChecked(true);
                beacon2.setChecked(false);
                beacon3.setChecked(false);
                beacon4.setChecked(false);

            }
        });

        beacon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beacon0.setChecked(false);
                beacon1.setChecked(false);
                beacon2.setChecked(true);
                beacon3.setChecked(false);
                beacon4.setChecked(false);

            }
        });

        beacon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beacon0.setChecked(false);
                beacon1.setChecked(false);
                beacon2.setChecked(false);
                beacon3.setChecked(true);
                beacon4.setChecked(false);

            }
        });

        beacon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beacon0.setChecked(false);
                beacon1.setChecked(false);
                beacon2.setChecked(false);
                beacon3.setChecked(false);
                beacon4.setChecked(true);

            }
        });

        //TODO

        CapNone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CapNone.setChecked(true);
                CapLow.setChecked(false);
                CapHigh.setChecked(false);
                CapCapped.setChecked(false);


            }
        });


        CapLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CapNone.setChecked(false);
                CapLow.setChecked(true);
                CapHigh.setChecked(false);
                CapCapped.setChecked(false);


            }
        });

        CapHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CapNone.setChecked(false);
                CapLow.setChecked(false);
                CapHigh.setChecked(true);
                CapCapped.setChecked(false);


            }
        });

        CapCapped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CapNone.setChecked(false);
                CapLow.setChecked(false);
                CapHigh.setChecked(false);
                CapCapped.setChecked(true);


            }
        });

        beacon0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BEACONS_ENDGAME_0 = isChecked;

            }
        });

        beacon1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BEACONS_ENDGAME_1 = isChecked;


            }
        });

        beacon2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BEACONS_ENDGAME_2 = isChecked;



            }
        });

        beacon3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BEACONS_ENDGAME_3 = isChecked;


            }
        });

        beacon4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BEACONS_ENDGAME_4 = isChecked;



            }
        });

        WinningStateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                WINNING_STATE_WIN = isChecked;
            }
        });


        //TODO

        CapNone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CAPBALL_ENDGAME_0 = isChecked;

            }
        });

        CapLow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CAPBALL_ENDGAME_1 = isChecked;

            }
        });

        CapHigh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CAPBALL_ENDGAME_2 = isChecked;

            }
        });

        CapCapped.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CAPBALL_ENDGAME_3 = isChecked;

            }
        });




        return rootView;
    }


    public static boolean BEACONS_ENDGAME_0 = true;
    public static boolean BEACONS_ENDGAME_1 = false;
    public static boolean BEACONS_ENDGAME_2 = false;
    public static boolean BEACONS_ENDGAME_3 = false;
    public static boolean BEACONS_ENDGAME_4 = false;

    public static boolean CAPBALL_ENDGAME_0 = true;
    public static boolean CAPBALL_ENDGAME_1 = false;
    public static boolean CAPBALL_ENDGAME_2 = false;
    public static boolean CAPBALL_ENDGAME_3 = false;


    public static boolean WINNING_STATE_WIN = false;

    public String WINNING_STATE(){
        if (WINNING_STATE_WIN == true)
            return "TRUE";
        else
            return "FALSE";
    }




    public String  BEACONS_ENDGAME(){
        if ( BEACONS_ENDGAME_0 == true &&  BEACONS_ENDGAME_1 == false && BEACONS_ENDGAME_2 == false && BEACONS_ENDGAME_3 == false && BEACONS_ENDGAME_4 == false)
            return "0";
        else if ( BEACONS_ENDGAME_0 == false &&  BEACONS_ENDGAME_1 == true && BEACONS_ENDGAME_2 == false && BEACONS_ENDGAME_3 == false && BEACONS_ENDGAME_4 == false)
            return "1";
        else if ( BEACONS_ENDGAME_0 == false &&  BEACONS_ENDGAME_1 == false && BEACONS_ENDGAME_2 == true && BEACONS_ENDGAME_3 == false && BEACONS_ENDGAME_4 == false)
            return "2";
        else if ( BEACONS_ENDGAME_0 == false &&  BEACONS_ENDGAME_1 == false && BEACONS_ENDGAME_2 == false && BEACONS_ENDGAME_3 == true && BEACONS_ENDGAME_4 == false)
            return "3";
        else if ( BEACONS_ENDGAME_0 == false &&  BEACONS_ENDGAME_1 == false && BEACONS_ENDGAME_2 == false && BEACONS_ENDGAME_3 == false && BEACONS_ENDGAME_4 == true)
            return "4";

        else return "ERROR";
    }

    public String  CAPBALL_ENDGAME(){
        if ( CAPBALL_ENDGAME_0 == true &&  CAPBALL_ENDGAME_1 == false && CAPBALL_ENDGAME_2 == false && CAPBALL_ENDGAME_3 == false)
            return "0";
        else if ( CAPBALL_ENDGAME_0 == false &&  CAPBALL_ENDGAME_1 == true && CAPBALL_ENDGAME_2 == false && CAPBALL_ENDGAME_3 == false)
            return "1";
        else if ( CAPBALL_ENDGAME_0 == false &&  CAPBALL_ENDGAME_1 == false && CAPBALL_ENDGAME_2 == true && CAPBALL_ENDGAME_3 == false)
            return "2";
        else if ( CAPBALL_ENDGAME_0 == false &&  CAPBALL_ENDGAME_1 == false && CAPBALL_ENDGAME_2 == false && CAPBALL_ENDGAME_3 == true)
            return "3";


        else return "ERROR";
    }



}
