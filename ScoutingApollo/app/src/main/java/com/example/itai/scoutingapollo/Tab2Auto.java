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

public class Tab2Auto  extends Fragment {

    CheckBox Vortex0, Vortex1,Vortex2;
    CheckBox Correct0, Correct1, Correct2;
    CheckBox InCorrect0, InCorrect1, InCorrect2;
    CheckBox Corner0, Corner1, Corner2;
    CheckBox Center0, Center1, Center2;
    CheckBox Corner00, Corner11, Corner22;
    Switch CapBall;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO slide to position
        View rootView = inflater.inflate(R.layout.tab2auto, container, false);

        Vortex2 = (CheckBox) rootView.findViewById(R.id.Vortex2);
        Vortex1 = (CheckBox) rootView.findViewById(R.id.Vortex1);
        Vortex0 = (CheckBox) rootView.findViewById(R.id.Vortex0);
        CapBall = (Switch) rootView.findViewById(R.id.CapBall);
        Correct0 = (CheckBox) rootView.findViewById(R.id.Correct0);
        Correct1 = (CheckBox) rootView.findViewById(R.id.Correct1);
        Correct2 = (CheckBox) rootView.findViewById(R.id.Correct2);
        InCorrect0 = (CheckBox) rootView.findViewById(R.id.InCorrect0);
        InCorrect1 = (CheckBox) rootView.findViewById(R.id.InCorrect1);
        InCorrect2 = (CheckBox) rootView.findViewById(R.id.InCorrect2);
        Corner0 = (CheckBox) rootView.findViewById(R.id.Corner0);
        Corner1 = (CheckBox) rootView.findViewById(R.id.Corner1);
        Corner2 = (CheckBox) rootView.findViewById(R.id.Corner2);
        Corner00 = (CheckBox) rootView.findViewById(R.id.Corner00);
        Corner11 = (CheckBox) rootView.findViewById(R.id.Corner11);
        Corner22 = (CheckBox) rootView.findViewById(R.id.Corner22);
        Center0 = (CheckBox) rootView.findViewById(R.id.Center0);
        Center1 = (CheckBox) rootView.findViewById(R.id.Center1);
        Center2 = (CheckBox) rootView.findViewById(R.id.Center2);


        Corner00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                Corner11.setChecked(false);
                Corner22.setChecked(false);
                Center0.setChecked(true);
                Center1.setChecked(false);
                Center2.setChecked(false);
                Corner00.setChecked(true);
            }
        });

        Corner11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                Corner00.setChecked(false);
                Corner22.setChecked(false);
                Center0.setChecked(true);
                Center1.setChecked(false);
                Center2.setChecked(false);
                Corner11.setChecked(true);
            }
        });

        Corner22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                Corner00.setChecked(false);
                Corner11.setChecked(false);
                Center0.setChecked(true);
                Center1.setChecked(false);
                Center2.setChecked(false);
                Corner22.setChecked(true);
            }
        });
        Center0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                Corner00.setChecked(true);
                Corner11.setChecked(false);
                Corner22.setChecked(false);
                Center1.setChecked(false);
                Center2.setChecked(false);
                Center0.setChecked(true);
            }
        });

        Center1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                Corner00.setChecked(true);
                Corner11.setChecked(false);
                Corner22.setChecked(false);
                Center0.setChecked(false);
                Center2.setChecked(false);
                Center1.setChecked(true);
            }
        });

        Center2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                Corner00.setChecked(true);
                Corner11.setChecked(false);
                Corner22.setChecked(false);
                Center0.setChecked(false);
                Center1.setChecked(false);
                Center2.setChecked(true);
            }
        });

        Corner00.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORNER_PARK_AUTO_0 = isChecked;

            }
        });

        Corner11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORNER_PARK_AUTO_1 = isChecked;


            }
        });

        Corner22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORNER_PARK_AUTO_2 = isChecked;



            }
        });

        Center0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CENTER_PARK_AUTO_0 = isChecked;

            }
        });

        Center1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CENTER_PARK_AUTO_1 = isChecked;


            }
        });

        Center2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CENTER_PARK_AUTO_2 = isChecked;



            }
        });

















        Corner0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                Corner1.setChecked(false);
                Corner2.setChecked(false);
                Corner0.setChecked(true);
            }
        });

        Corner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                Corner0.setChecked(false);
                Corner2.setChecked(false);
                Corner1.setChecked(true);
            }
        });

        Corner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                Corner0.setChecked(false);
                Corner1.setChecked(false);
                Corner2.setChecked(true);
            }
        });

        Corner0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_CORNER_AUTO_0 = isChecked;

            }
        });

        Corner1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_CORNER_AUTO_1 = isChecked;


            }
        });

        Corner2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_CORNER_AUTO_2 = isChecked;



            }
        });













        Correct0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                Correct1.setChecked(false);
                Correct2.setChecked(false);
                Correct0.setChecked(true);
            }
        });

        Correct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                Correct0.setChecked(false);
                Correct2.setChecked(false);
                Correct1.setChecked(true);
                if (InCorrect2.isChecked()){
                    InCorrect1.setChecked(true);
                    InCorrect2.setChecked(false);
                }
            }
        });

        Correct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                Correct0.setChecked(false);
                Correct1.setChecked(false);
                Correct2.setChecked(true);
                if (InCorrect2.isChecked() || InCorrect1.isChecked()){
                    InCorrect1.setChecked(false);
                    InCorrect2.setChecked(false);
                    InCorrect0.setChecked(true);
                }
            }
        });

        Correct0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORRECT_BEACONS_AUTO_0 = isChecked;

            }
        });

        Correct1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORRECT_BEACONS_AUTO_1 = isChecked;


            }
        });

        Correct2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CORRECT_BEACONS_AUTO_2 = isChecked;



            }
        });





        InCorrect0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                InCorrect1.setChecked(false);
                InCorrect2.setChecked(false);
                InCorrect0.setChecked(true);

            }
        });

        InCorrect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                InCorrect0.setChecked(false);
                InCorrect2.setChecked(false);
                InCorrect1.setChecked(true);
                if (Correct2.isChecked()){
                    Correct1.setChecked(true);
                    Correct2.setChecked(false);
                }
            }
        });

        InCorrect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                InCorrect0.setChecked(false);
                InCorrect1.setChecked(false);
                InCorrect2.setChecked(true);
                if (Correct2.isChecked() || Correct1.isChecked()){
                    Correct1.setChecked(false);
                    Correct2.setChecked(false);
                    Correct0.setChecked(true);
                }
            }
        });

        InCorrect0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                INCORRECT_BEACONS_AUTO_0 = isChecked;

            }
        });

        InCorrect1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                INCORRECT_BEACONS_AUTO_1 = isChecked;


            }
        });

        InCorrect2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                INCORRECT_BEACONS_AUTO_2 = isChecked;



            }
        });














        CapBall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CAPBALL_FLOOR_AUTO_BOOLEAN = isChecked;
            }
        });


        Vortex0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_0 = Vortex0.isEnabled();
                Vortex1.setChecked(false);
                Vortex2.setChecked(false);
                Vortex0.setChecked(true);
            }
        });

        Vortex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_1 = Vortex1.isEnabled();
                Vortex0.setChecked(false);
                Vortex2.setChecked(false);
                Vortex1.setChecked(true);
            }
        });

        Vortex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BALLS_VORTEX_AUTO_BOOLEAN_2 = Vortex2.isEnabled();
                Vortex0.setChecked(false);
                Vortex1.setChecked(false);
                Vortex2.setChecked(true);
            }
        });

        Vortex0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_VORTEX_AUTO_BOOLEAN_0 = isChecked;

            }
        });

        Vortex1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_VORTEX_AUTO_BOOLEAN_1 = isChecked;


            }
        });

        Vortex2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                BALLS_VORTEX_AUTO_BOOLEAN_2 = isChecked;



            }
        });



        return rootView;
    }

    public static boolean CAPBALL_FLOOR_AUTO_BOOLEAN = false;

    public String CAPBALL_FLOOR_AUTO(){
        if (CAPBALL_FLOOR_AUTO_BOOLEAN == true)
            return "TRUE";
        else
            return "FALSE";
    }

    public static boolean BALLS_VORTEX_AUTO_BOOLEAN_0 = true;
    public static boolean BALLS_VORTEX_AUTO_BOOLEAN_1 = false;
    public static boolean BALLS_VORTEX_AUTO_BOOLEAN_2 = false;

    public String BALLS_VORTEX_AUTO(){
        if (BALLS_VORTEX_AUTO_BOOLEAN_0 == true && BALLS_VORTEX_AUTO_BOOLEAN_1 == false && BALLS_VORTEX_AUTO_BOOLEAN_2 == false)
            return "0";
        else if (BALLS_VORTEX_AUTO_BOOLEAN_0 == false && BALLS_VORTEX_AUTO_BOOLEAN_1 == true && BALLS_VORTEX_AUTO_BOOLEAN_2 == false)
            return "1";
        else if (BALLS_VORTEX_AUTO_BOOLEAN_0 == false && BALLS_VORTEX_AUTO_BOOLEAN_1 == false && BALLS_VORTEX_AUTO_BOOLEAN_2 == true)
            return "2";
    else return "ERROR";
    }

    public static boolean CORRECT_BEACONS_AUTO_0 = true;
    public static boolean CORRECT_BEACONS_AUTO_1 = false;
    public static boolean CORRECT_BEACONS_AUTO_2 = false;

    public String  CORRECT_BEACONS_AUTO(){
        if ( CORRECT_BEACONS_AUTO_0 == true &&  CORRECT_BEACONS_AUTO_1 == false && CORRECT_BEACONS_AUTO_2 == false)
            return "0";
        else if ( CORRECT_BEACONS_AUTO_0 == false && CORRECT_BEACONS_AUTO_1 == true && CORRECT_BEACONS_AUTO_2 == false)
            return "1";
        else if ( CORRECT_BEACONS_AUTO_0 == false && CORRECT_BEACONS_AUTO_1 == false && CORRECT_BEACONS_AUTO_2 == true)
            return "2";
        else return "ERROR";
    }

    public static boolean INCORRECT_BEACONS_AUTO_0 = true;
    public static boolean INCORRECT_BEACONS_AUTO_1 = false;
    public static boolean INCORRECT_BEACONS_AUTO_2 = false;

    public String  INCORRECT_BEACONS_AUTO(){
        if ( INCORRECT_BEACONS_AUTO_0 == true &&  INCORRECT_BEACONS_AUTO_1 == false && INCORRECT_BEACONS_AUTO_2 == false)
            return "0";
        else if ( INCORRECT_BEACONS_AUTO_0 == false && INCORRECT_BEACONS_AUTO_1 == true && INCORRECT_BEACONS_AUTO_2 == false)
            return "1";
        else if ( INCORRECT_BEACONS_AUTO_0 == false && INCORRECT_BEACONS_AUTO_1 == false && INCORRECT_BEACONS_AUTO_2 == true)
            return "2";
        else return "ERROR";
    }

    public static boolean CENTER_PARK_AUTO_0 = true;
    public static boolean CENTER_PARK_AUTO_1 = false;
    public static boolean CENTER_PARK_AUTO_2 = false;
    public static boolean CORNER_PARK_AUTO_0 = true;
    public static boolean CORNER_PARK_AUTO_1 = false;
    public static boolean CORNER_PARK_AUTO_2 = false;

    public String  CENTER_PARK_AUTO(){
        if ( CENTER_PARK_AUTO_0 == true &&  CENTER_PARK_AUTO_1 == false && CENTER_PARK_AUTO_2 == false)
            return "0";
        else if ( CENTER_PARK_AUTO_0 == false && CENTER_PARK_AUTO_1 == true && CENTER_PARK_AUTO_2 == false)
            return "1";
        else if ( CENTER_PARK_AUTO_0 == false && CENTER_PARK_AUTO_1 == false && CENTER_PARK_AUTO_2 == true)
            return "2";
        else return "ERROR";
    }
    public String  CORNER_PARK_AUTO(){
        if ( CORNER_PARK_AUTO_0 == true &&  CORNER_PARK_AUTO_1 == false && CORNER_PARK_AUTO_2 == false)
            return "0";
        else if ( CORNER_PARK_AUTO_0 == false && CORNER_PARK_AUTO_1 == true && CORNER_PARK_AUTO_2 == false)
            return "1";
        else if ( CORNER_PARK_AUTO_0 == false && CORNER_PARK_AUTO_1 == false && CORNER_PARK_AUTO_2 == true)
            return "2";
        else return "ERROR";
    }


    public static boolean BALLS_CORNER_AUTO_0 = true;
    public static boolean BALLS_CORNER_AUTO_1 = false;
    public static boolean BALLS_CORNER_AUTO_2 = false;

    public String  BALLS_CORNER_AUTO(){
        if ( BALLS_CORNER_AUTO_0 == true &&  BALLS_CORNER_AUTO_1 == false && BALLS_CORNER_AUTO_2 == false)
            return "0";
        else if ( BALLS_CORNER_AUTO_0 == false && BALLS_CORNER_AUTO_1 == true && BALLS_CORNER_AUTO_2 == false)
            return "1";
        else if ( BALLS_CORNER_AUTO_0 == false && BALLS_CORNER_AUTO_1 == false && BALLS_CORNER_AUTO_2 == true)
            return "2";
        else return "ERROR";
    }
}
