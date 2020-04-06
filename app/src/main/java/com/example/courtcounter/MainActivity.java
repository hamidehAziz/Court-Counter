package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int teamAscores = 0;
    int teamBscores = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3Pointa(View view){
        teamAscores = teamAscores + 3;
        displayForTeamA(teamAscores);

    }
    public void plus2Pointa(View view){
        teamAscores = teamAscores + 2;
        displayForTeamA(teamAscores);

    }
    public void plus1Pointa(View view){
        teamAscores = teamAscores + 1;
        displayForTeamA(teamAscores);

    }

    public void plus3Pointb(View view){
        teamBscores = teamBscores + 3;
        displayForTeamB(teamBscores);

    }
    public void plus2Pointb(View view){
        teamBscores = teamBscores + 2;
        displayForTeamB(teamBscores);

    }
    public void plus1Pointb(View view){
        teamBscores = teamBscores + 1;
        displayForTeamB(teamBscores);

    }

    public void reset (View View){
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
