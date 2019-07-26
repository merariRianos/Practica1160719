package com.example.tarea1150719;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    TextView tv1,tv2,tv3;
    int a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.ET1);
        et2 = (EditText) findViewById(R.id.ET2);
        et3 = (EditText) findViewById(R.id.ET3);
        tv1 = (TextView) findViewById(R.id.TV1);
        tv2 = (TextView) findViewById(R.id.TV2);
        tv3 = (TextView) findViewById(R.id.TV3);
    }

    public void ordena(View view){


        a = Integer.parseInt(et1.getText().toString());
        b = Integer.parseInt(et2.getText().toString());
        c = Integer.parseInt(et3.getText().toString());


        if ((a > b) && (b > c)){

            tv1.setText(""+a);
            tv2.setText(""+b);
            tv3.setText(""+c);

        }else if ((a > c) && (c > b)){

            tv1.setText(""+a);
            tv2.setText(""+c);
            tv3.setText(""+b);

        }else if ((b > a) && (a > c)){
            tv1.setText(""+b);
            tv2.setText(""+a);
            tv3.setText(""+c);

        }else if ((b > c) && (c > a)){
            tv1.setText(""+b);
            tv2.setText(""+c);
            tv3.setText(""+a);

        }else if ((c > a) && (a > b)){
            tv1.setText(""+c);
            tv2.setText(""+a);
            tv3.setText(""+b);

        }
        else {
            tv1.setText(""+c);
            tv2.setText(""+b);
            tv3.setText(""+a);
        }


    }


}
