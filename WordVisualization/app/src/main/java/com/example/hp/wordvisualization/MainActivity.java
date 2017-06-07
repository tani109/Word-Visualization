package com.example.hp.wordvisualization;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView textview1,textview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1= (TextView)findViewById(R.id.button1);
        textview2= (TextView)findViewById(R.id.button2);

        textview1.setTypeface(null, Typeface.BOLD);
        textview1.setTextSize(30);
        textview2.setTypeface(null, Typeface.BOLD);
        textview2.setTextSize(30);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void learningClicked(View v){
        Intent intent = new Intent(this,LearningActivity.class);
        startActivity(intent);


    }
    public void examClicked(View v){
        Intent intent = new Intent(this,Exam.class);
        startActivity(intent);


    }
}
