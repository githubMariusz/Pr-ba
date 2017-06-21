package com.example.q.aplikacja_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;
import java.lang.*;

public class Zaawansowanyy extends AppCompatActivity {

    TextView screen ;
    double  n1 , n2 , resultado;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaawansowanyy);
    }

    public void btn_0(View View){
        screen=(TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"0");
    }

    public void btn_1(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"1");
    }
    public void btn_2(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"2");
    }
    public void btn_3(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"3");
    }
    public void btn_4(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"4");
    }
    public void btn_5(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"5");
    }
    public void btn_6(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"6");
    }
    public void btn_7(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"7");
    }
    public void btn_8(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"8");
    }
    public void btn_9 (View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"9");
    }
    public void btn_kropka(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+".");
    }

    public void onClickOperator(View View){
        screen = (TextView) findViewById(R.id.screen);
        n1= Double.parseDouble(screen.getText().toString());
        screen.setText("");
    }
    public void btn_Plus (View View){
        operator="+";
        onClickOperator(View);
    }

    public void  btn_Minus (View View) {
        operator = "-";
        onClickOperator(View);
    }
    public void btn_mnożenie (View View) {
        operator = "*";
        onClickOperator(View);
    }
    public void btn_Dzielenie (View View){
        operator="/";
        onClickOperator(View);

    }

    public void expn(View View) {
        operator = "exp";
        screen = (TextView) findViewById(R.id.screen);
        try {
            n1 = Double.parseDouble(screen.getText().toString());
            screen.setText("");
        } catch (NumberFormatException nfe){}

    }
        public void rownaSię(View View){
            screen = (TextView) findViewById(R.id.screen);
            n2 = Double.parseDouble(screen.getText().toString());
                if (operator.equals("+")) {
                    resultado = n1 + n2;
                } else if (operator.equals("-")) {
                    resultado = n1 - n2;
                } else if (operator.equals("*")) {
                    resultado = n1 * n2;
                } else if (operator.equals("/")) {
                    resultado = n1 / n2;
                }else if (operator.equals("exp")){
                    screen = (TextView) findViewById(R.id.screen);
                    n2 = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    resultado=Math.pow(n1,n2);
                }
                screen.setText(""+resultado);
                }

         public void Rnd (View View){
             for(int x=0; x<=100; x++){
                 int na= (int)Math.floor(Math.random()+(100-(1+1))+(1));
                 screen.setText(String.valueOf(na));
             }
         }

         public void X_n (View View){
             screen = (TextView) findViewById(R.id.screen);
             try{
                 n1 = Double.parseDouble(screen.getText().toString());
                 resultado=Math.sqrt(n1);
                 screen.setText(String.valueOf(resultado));
             }catch (NumberFormatException nfe){}
         }

    public void X_2 (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            resultado=Math.pow(n1 ,2);
            screen.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void X_3 (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            resultado=Math.pow(n1,3);
            screen.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }

    public void Sin (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            resultado=Math.sin(rd);
            screen.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void Cos (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            resultado=Math.cos(rd);
            screen.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void Tan (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            resultado=Math.tan(rd);
            screen.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void  nSilnia(View View){
        int fact = 1;
        int x;
        try{
            for (x=1;x<=n1;x++){
                fact= fact + x;
        }screen.setText(String.valueOf(resultado));
    }catch (NumberFormatException nfe){}
    }


    public void kasowanie(View View){
        if(!screen.getText().toString().equals("")){

            screen.setText(screen.getText().subSequence(0,screen.getText().length()-1)+"");
        }
    }
    public void AC (View View){
        n1=0.0;
        n2=0.0;
        screen=(TextView)findViewById(R.id.screen);
        screen.setText("");
    }


}

