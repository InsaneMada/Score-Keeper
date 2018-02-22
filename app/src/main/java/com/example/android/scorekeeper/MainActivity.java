package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int foulTeamA = 0;
    int penaltyTeamA = 0;
    int goalTeamB = 0;
    int foulTeamB = 0;
    int penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase goals for team A by 1.
     */
    public void addGoalForTeamA(View V) {

        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Displays goals for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView goalView = (TextView) findViewById(R.id.team_a_goal);
        goalView.setText(String.valueOf(score));
    }

    /**
     * Increase foul for Team A by 1.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulCounterTeamA(foulTeamA);

    }

    /**
     * Displays fouls for Team A.
     */
    public void displayFoulCounterTeamA(int score) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Increase penalties for Team A by 1.
     */
    public void addPenaltyForTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;

        displayPenaltyCounterTeamA(penaltyTeamA);
    }

    /**
     * Displays penalties for Team A.
     */
    public void displayPenaltyCounterTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase goals for Team B by 1 .
     */
    public void addGoalForTeamB(View V) {

        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * Displays goals for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView goalView = (TextView) findViewById(R.id.team_b_goal);
        goalView.setText(String.valueOf(score));
    }

    /**
     * Increase foul for Team B by 1 .
     */
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulCounterTeamB(foulTeamB);
    }

    /**
     * Displays fouls score for Team B.
     */
    public void displayFoulCounterTeamB(int score) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Increase penalties for Team B by 1.
     */
    public void addPenaltyForTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;

        displayPenaltyCounterTeamB(penaltyTeamB);
    }

    /**
     * Displays penalties for Team B.
     */
    public void displayPenaltyCounterTeamB(int score) {
        TextView penaltyView = (TextView) findViewById(R.id.team_b_penalty);
        penaltyView.setText(String.valueOf(score));
    }

    /**
     * Resets all scores to 0.
     */
    public void resetScore(View V) {

        goalTeamA = 0;
        foulTeamA = 0;
        penaltyTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        penaltyTeamB = 0;
        displayGoalForTeamA(goalTeamA);
        displayFoulCounterTeamA(foulTeamA);
        displayPenaltyCounterTeamA(penaltyTeamA);
        displayGoalForTeamB(goalTeamB);
        displayFoulCounterTeamB(foulTeamB);
        displayPenaltyCounterTeamB(penaltyTeamB);
    }
}