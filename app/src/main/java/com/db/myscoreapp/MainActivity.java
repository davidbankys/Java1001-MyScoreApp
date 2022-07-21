package com.db.myscoreapp;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
     TextView tm1Score;
    TextView tm2score;
    TextView scoreBy;
    int  scoreTemA = 0;
    int  scoreTemB = 0;
    SeekBar seekbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tm1Score = (TextView)findViewById(R.id.textView1);
        tm2score = (TextView) findViewById(R.id.textView2);
        scoreBy = (TextView) findViewById(R.id.scoreBylbl);

        Button tm1Add = (Button) findViewById(R.id.tm1Add);
        Button tm2Add = (Button) findViewById(R.id.tm2Add);
        Button tm1Sub = (Button) findViewById(R.id.tm1Sub);
        Button tm2Sub = (Button) findViewById(R.id.tm2Sub);

        tm1Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = addMethod(Integer.parseInt(tm1Score.getText().toString()), Integer.parseInt(scoreBy.getText().toString()));
                tm1Score.setText(String.valueOf(result));
            }
        });

        tm2Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = addMethod(Integer.parseInt(tm2score.getText().toString()), Integer.parseInt(scoreBy.getText().toString()));
                tm2score.setText(String.valueOf(result));
                System.out.println(result);
            }
        });

        tm1Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = subtractMethod(Integer.parseInt(tm1Score.getText().toString()), Integer.parseInt(scoreBy.getText().toString()));
                tm1Score.setText(String.valueOf(result));
            }
        });

        tm2Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = subtractMethod(Integer.parseInt(tm2score.getText().toString()), Integer.parseInt(scoreBy.getText().toString()));
                tm2score.setText(String.valueOf(result));
            }
        });



        seekbar = (SeekBar)findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            scoreBy.setText(String.valueOf(i));
            System.out.println(i);
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    });

}




    private int  subtractMethod(int oldNumber, int newNumber) {
        int result = oldNumber - newNumber;
        return result;
    }

    private int addMethod(int oldNumber, int newNumber){
        int result = oldNumber + newNumber;
        return result;
    }
}