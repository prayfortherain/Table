package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

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
    public void onClickScore(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.ctxt);
        counterView.setText(counter.toString());
    }
    public void onClickScore1(View view) {
        counter1++;
        TextView counter1View = (TextView) findViewById(R.id.ltxt);
        counter1View.setText(counter1.toString());
    }
    public void onClickReset(View view){
        counter = 0;
        counter1 = 0;
        TextView counter2View = (TextView) findViewById(R.id.ctxt);
        counter2View.setText(counter.toString());
        TextView counter3View = (TextView) findViewById(R.id.ltxt);
        counter3View.setText(counter1.toString());

    }

}