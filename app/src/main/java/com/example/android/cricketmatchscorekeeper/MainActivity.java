package com.example.android.cricketmatchscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.cricketmatchscorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreIndia = 0;
    int scorePak = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for India by 1 Run.
     */
    public void addOneRunIndia(View v) {
        scoreIndia = 1 + scoreIndia;
        displayForIndia(scoreIndia);
    }

    /**
     * Increase the score for India by 2 points.
     */
    public void addTwoRunsIndia(View v) {
        scoreIndia = 2 + scoreIndia;
        displayForIndia(scoreIndia);
    }

    /**
     * Increase the score for India by 4 Runs.
     */
    public void addFourRunsIndia(View v) {
        scoreIndia = 4 + scoreIndia;
        displayForIndia(scoreIndia);
    }

    public void addSixRunsIndia(View v) {
        scoreIndia = 6 + scoreIndia;
        displayForIndia(scoreIndia);
    }

    public void addZeroIndia(View v) {
        scoreIndia = scoreIndia;
        displayForIndia(scoreIndia);
    }

    /**
     * Displays the given score for India.
     */
    public void displayForIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_india_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Pakistan  by 1 Run.
     */
    public void addOneRunPak(View v) {
        scorePak = 1 + scorePak;
        displayForPak(scorePak);
    }

    /**
     * Increase the score for Pakistan by 2 points.
     */
    public void addTwoRunsPak(View v) {
        scorePak = 2 + scorePak;
        displayForPak(scorePak);
    }

    /**
     * Increase the score for Pakistan by 4 Runs.
     */
    public void addFourRunsPak(View v) {
        scorePak = 4 + scorePak;
        displayForPak(scorePak);
    }

    public void addSixRunsPak(View v) {
        scorePak = 6 + scorePak;
        displayForPak(scorePak);
    }

    public void addZeroPak(View v) {
        scorePak = scorePak;
        displayForPak(scorePak);
    }

    /**
     * Displays the given score for Pakistan.
     */
    public void displayForPak(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_pak_score);
        scoreView.setText(String.valueOf(score));
    }


    public void Reset(View v) {
        scoreIndia = 0;
        scorePak = 0;
        displayForIndia(scoreIndia);
        displayForPak(scorePak);
    }
}