package com.example.itai.scoutingapollo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Environment;
import android.os.StrictMode;
import android.os.Vibrator;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
        TextView textView;
        Tab1Setup t1s = new Tab1Setup();
        Tab2Auto t2a = new Tab2Auto();
        Tab3Teleop t3t = new Tab3Teleop();

        Tab4End t4e = new Tab4End();
        boolean aps = true;
        boolean txt = true;

        public String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/apolloScouting";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1);




        textView = (TextView) findViewById(R.id.textView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (aps==true && txt==true){

                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(800);

                    SnackBar(view , "ERROR: Please Choose File Saving Format");


                }


                else if (aps==true && txt==false ) {
                    if (t1s.getMatchNumber() == null ) {

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        v.vibrate(500);
                        SnackBar(view, "ERROR: Please Enter Match Number");

                    } else if (t1s.getTeamNumber() == null ) {

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        v.vibrate(500);
                        SnackBar(view, "ERROR: Please Enter Team Number");

                    } else if (t1s.getTeamNumber() == null && t1s.getMatchNumber() == null) {

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        v.vibrate(500);
                        SnackBar(view, "ERROR: Please Enter Team Number And Match Number");
                    } else {
                        FinalCheck(view);
                    }
                }


                    if (txt==true && aps==false){

                        if (t1s.getMatchNumber()==null ){

                            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            v.vibrate(500);
                            SnackBar(view , "ERROR: Please Enter Match Number");

                        }

                        else if ( t1s.getTeamNumber()==null){

                            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            v.vibrate(500);
                            SnackBar(view , "ERROR: Please Enter Team Number");

                        }

                        else if ( t1s.getTeamNumber()==null && t1s.getMatchNumber()==null){

                            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            v.vibrate(500);
                            SnackBar(view , "ERROR: Please Enter Team Number And Match Number");
                        }

                        else{
                            FinalTxtCheck(view);
                        }


                    }
            }
        });

        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(150);
                appR();


                return false;
            }
        });

    }
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {

                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                } else {

                    finish();
                    Toast.makeText(MainActivity.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
    public static void resetApp(Activity act){

        Intent i = new Intent();
        i.setClass(act, act.getClass());
        act.startActivity(i);

    }

    public final void FinalCheck(View v){



        SnackBar(v, "Scout Saved , Press Long To Reset.");
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/apolloScouting");
        if (!file.exists()) {
            file.mkdirs();
        }
        apsNewWrite();


    }

    public final void FinalTxtCheck(View v){

        SnackBar(v, "Scout Saved , Press Long To Reset.");
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/apolloScouting");
        if (!file.exists()) {
            file.mkdirs();
        }
        txtNewWrite();



    }

    public void appR(){

        resetApp(MainActivity.this);

    }

    public void SnackBar(View v, String txt){

        Snackbar.make(v, txt, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    public final void apsNewWrite(){

        File file = new File(path + "/" +  t1s.getTeamNumber().toString() + "-" + t1s.getMatchNumber().toString() + ".aps"); //Example: 9662-5.txt
        String  [] saveText = String.valueOf(FileValue()).split(System.getProperty("line.separator"));
        Save (file, saveText);

    }

    public final void txtNewWrite() {

        File f = new File(path + "/" + t1s.getTeamNumber().toString() + "-" + t1s.getMatchNumber().toString() + ".txt"); //Example: 9662-5.txt
        String[] s = String.valueOf(FileValue()).split(System.getProperty("line.separator"));
        Save(f, s);

    }


    public String FileValue(){

        return  "BALLS_VORTEX_AUTO:[" + t2a.BALLS_VORTEX_AUTO() + "]" +
                "\n" + "BALLS_CORNER_AUTO:[" + t2a.BALLS_CORNER_AUTO() + "]" +
                "\n" + "CORRECT_BEACONS_AUTO:[" + t2a.CORRECT_BEACONS_AUTO() + "]" +
                "\n" + "INCORRECT_BEACONS_AUTO:["+ t2a.INCORRECT_BEACONS_AUTO() + "]" +
                "\n" + "CAPBALL_FLOOR_AUTO:[" + t2a.CAPBALL_FLOOR_AUTO() + "]" +
                "\n" + "CENTER_PARK_AUTO:[" + t2a.CENTER_PARK_AUTO() + "]" +
                "\n" + "CORNER_PARK_AUTO:[" + t2a.CORNER_PARK_AUTO() + "]" +
                "\n" + "BALLS_VORTEX:[" + t3t.GetVortextGoals() + "]" +
                "\n" + "BALLS_CORNER:[" + t3t.GetCornerGoals() + "]" +
                "\n" + "BEACONS_TOTAL_PRESS:[" + t3t.GetBeaconsPressed() + "]" +
                "\n" + "BEACONS_ENDGAME:[" + t4e.BEACONS_ENDGAME() + "]" +
                "\n" + "WINNING_STATE:[" + t4e.WINNING_STATE() + "]" +
                "\n" + "CAPBALL_ENDGAME:[" + t4e.CAPBALL_ENDGAME() + "]";
    }

    public void Save(File file, String[] data){

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(file);

        }catch (FileNotFoundException e){

            e.printStackTrace();
        }
        try{
            try{
                for (int i = 0; i<data.length; i++){
                    fos.write(data[i].getBytes());
                    if (i < data.length-1){
                        fos.write("\n".getBytes());
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }finally {
            try {
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.apsFormat) {
            aps = true;
            txt = false;

            Context context = getApplicationContext();
            CharSequence text = "Saving As .aps Format";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();



            return true;
        }

        if (id==R.id.txtFormat){

            aps = false;
            txt = true;
            Context context = getApplicationContext();
            CharSequence text = "Saving As .txt Format";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }

        if (id==R.id.Scouts){

            Intent intent = new Intent (getApplicationContext(), SavedScoutsActivity.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }






    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {


                case 0:
                    Tab1Setup tab1 = new Tab1Setup();
                    return tab1;
                case 1:
                    Tab2Auto tab2 = new Tab2Auto();
                     return tab2;
                case 2:
                    Tab3Teleop tab3 = new Tab3Teleop();
                    return tab3;
                case 3:
                    Tab4End tab4 = new Tab4End();
                    return tab4;
                default:
                    return null;

            }






        }




        @Override
        public int getCount() {
            //TODO set slides number
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {

                //TODO set slides names
                case 0:
                    return "Setup";
                case 1:
                    return "Auto";
                case 2:
                    return "Teleop";
                case 3:
                    return "End";
            }
            return null;
        }







    }






    }








