package com.example.table;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer counter1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void onClickScore(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.ctxt);
        counterView.setText(counter.toString());
    }
    @SuppressLint("SetTextI18n")
    public void onClickScore1(View view) {
        counter1++;
        TextView counter1View = (TextView) findViewById(R.id.ltxt);
        counter1View.setText(counter1.toString());
    }
    @SuppressLint("SetTextI18n")
    public void onClickReset(View view){
        counter = 0;
        counter1 = 0;
        TextView counter2View = (TextView) findViewById(R.id.ctxt);
        counter2View.setText(counter.toString());
        TextView counter3View = (TextView) findViewById(R.id.ltxt);
        counter3View.setText(counter1.toString());

    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        outState.putInt("counter", counter1);
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
        if (savedInstanceState != null && savedInstanceState.containsKey("counter")) {
            counter1 = savedInstanceState.getInt("counter");
        }
        ((TextView) findViewById(R.id.ctxt)).setText(counter.toString());
        ((TextView) findViewById(R.id.ltxt)).setText(counter1.toString());
    }


}