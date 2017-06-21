package com.example.q.aplikacja_kalkulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kalkulator, menu);
        return true;
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item){
       int id=item.getItemId();
       if (id==R.id.item1){
           Intent intent = new Intent(this,About_Activity.class);
           startActivity(intent);
           return true;
       }
       if(id==R.id.item2){
           Intent intent=new Intent(this,Zaawansowanyy.class);
           startActivity(intent);
           return true;
       }
       if(id==R.id.item3){

          // Activity.finish();
           System.exit(0);
           return true;
       }
       return true;
   }
}
