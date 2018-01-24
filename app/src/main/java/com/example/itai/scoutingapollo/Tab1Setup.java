package com.example.itai.scoutingapollo;

/**
 * Created by Itai on 10/03/2017.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.support.annotation.IntegerRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.content.Context.MODE_PRIVATE;
import static com.example.itai.scoutingapollo.R.id.container;


public class Tab1Setup extends Fragment{

        Context mBase;
        EditText MatchNumber , TeamNumber;
        TextView textview , slide;







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO slide to position
        View rootView = inflater.inflate(R.layout.tab1setup, container, false);

        textview = (TextView) rootView.findViewById(R.id.textView);
        MatchNumber = (EditText) rootView.findViewById(R.id.MatchNumber);
        TeamNumber = (EditText) rootView.findViewById(R.id.TeamNumber);
        slide = (TextView) rootView.findViewById(R.id.slide);



        MatchNumber.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {

                    MatchNumberEditable = s;

                }
            });
        TeamNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                TeamNumberEditable = s;

            }
        });










        return rootView;

    }


    public static Editable TeamNumberEditable;

    public static Editable MatchNumberEditable;

    public Editable getMatchNumber(){

        return MatchNumberEditable;

    }

    public Editable getTeamNumber(){

        return TeamNumberEditable;
    }











    public Context getApplicationContext() {
        return mBase.getApplicationContext();
    }

    public FileOutputStream openFileOutput(String name, int mode)
            throws FileNotFoundException {
        return mBase.openFileOutput(name, mode);
    }

    public FileInputStream openFileInput(String name)
            throws FileNotFoundException {
        return mBase.openFileInput(name);
    }

}
