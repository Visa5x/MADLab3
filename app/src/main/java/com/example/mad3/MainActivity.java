package com.example.mad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    int noa,nob;
    TextView answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getNumbers() {
        no1=(EditText)  findViewById(R.id.noa);
        no2=(EditText)  findViewById(R.id.nob);
        answer = (TextView) findViewById(R.id.ans);
        String s1 = no1.getText().toString();
        String s2 = no2.getText().toString();
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = " enter a value";
            answer.setText(result);
            return false;
        } else {

            noa = Integer.parseInt(s1);


            nob= Integer.parseInt(s2);
        }

        return true;
    }
    public void doSum(View v) {


        if (getNumbers()) {
            int sum = noa + nob;
            answer.setText(Integer.toString(sum));
        }
    }
    public void doSub(View v) {

        // get the input numbers
        if (getNumbers()) {
            int sum = noa - nob;
            answer.setText(Integer.toString(sum));
        }
    }
    public void doMul(View v) {

        if (getNumbers()) {
            int sum = noa * nob;
            answer.setText(Integer.toString(sum));
        }

    }
    public void doDiv(View v) {

        // get the input numbers
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = noa / (nob * 1.0);
            answer.setText(Double.toString(sum));
        }
    }

}