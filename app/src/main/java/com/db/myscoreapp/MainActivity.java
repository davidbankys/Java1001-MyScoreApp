package com.db.myscoreapp;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public TextView tv;
    int  scoreTemA = 0;
    int  scoreTemB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.scoreTemA);

    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton1TemA:
                if (checked) {
                    scoreTemA += 1;
                }
                break;

            case R.id.radioButton2TemA:
                if (checked)
                    scoreTemA += 1;
                break;

            case R.id.radioButton3TemA:
                if (checked)
                    scoreTemA += 3;
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton1TemB:
                if (checked) {
                    scoreTemA += 1;
                }
                break;

            case R.id.radioButton2TemB:
                if(checked)
                    scoreTemA +=1;
                break;

            case R.id.radioButton3TemB:
                if(checked)
                    scoreTemA +=3;
                break;
        }
        updateScore(scoreTemA);
        updateScore(scoreTemB);
    }
    public void updateScore(int scoreTemA) {
        tv.setText(" " + scoreTemA);
    }
    //Reset button code
    public void resetButton(View view){
        scoreTemA = 0;
        scoreTemB = 0;

    }
}