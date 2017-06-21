package com.example.q.aplikacja_kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class About_Activity extends AppCompatActivity {

float a,b,c,d,e;
    String symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_);


    }



    public void BOdejmij(View view) {
        symbol ="-";
        EditText liczba =(EditText) findViewById(R.id.Liczba);
        if( liczba.getText().toString().trim().length()==0) {
            liczba.setText("0");
        }
        else {
            a=Float.parseFloat(liczba.getText().toString());
            liczba.setText("");
            c=a-c;
        }
    }

    public void BDodaj(View view) {
        symbol ="+";
        EditText liczba =(EditText) findViewById(R.id.Liczba);
        if( liczba.getText().toString().trim().length()==0) {
            liczba.setText("0");
        }
        else {
            a=Float.parseFloat(liczba.getText().toString());
            liczba.setText("");
            c=a+c;
        }
    }

    public void BMnożenie(View view) {
        symbol ="*";
        EditText liczba =(EditText) findViewById(R.id.Liczba);
        if( liczba.getText().toString().trim().length()==0) {
            liczba.setText("0");
        }
        else {
            a=Float.parseFloat(liczba.getText().toString());
            liczba.setText("");

        }
    }

    public void BDzielenie(View view) {
        symbol ="/";
        EditText liczba =(EditText) findViewById(R.id.Liczba);
        if( liczba.getText().toString().trim().length()==0) {
            liczba.setText("0");
        }
        else {
            a=Float.parseFloat(liczba.getText().toString());
            liczba.setText("");

        }

    }

    public void BRownaSie(View view) {
        symbol ="+";
        EditText liczba =(EditText) findViewById(R.id.Liczba);
        if( liczba.getText().toString().trim().length()==0) {
            liczba.setText("0");
        }
        else{
            if (symbol=="+") {
                b = Float.parseFloat(liczba.getText().toString());
                c = b+c;
            }
            if (symbol=="-") {
                b = Float.parseFloat(liczba.getText().toString());
                c = b-c;
            }
            if (symbol=="*") {
                b = Float.parseFloat(liczba.getText().toString());
                c = b*a;
            }
            if (symbol=="/") {
                b = Float.parseFloat(liczba.getText().toString());
                c = b /a;
            }

        }
        liczba.setText(""+c);
        c=0;
        a=0;
    }

    public void BC(View view) {
        ;
    }
}
