package com.example.hp.wordvisualization;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ScoreActivity extends Activity {
    TextView txt;
    RelativeLayout rl;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_score);
        rl= (RelativeLayout) findViewById(R.id.scorebackground);
        b1= (Button)findViewById(R.id.bscore);
        b1.setTypeface(null, Typeface.BOLD);
        txt= (TextView)findViewById(R.id.score);
        txt.setTypeface(null,Typeface.BOLD);
        Solution sol = new Solution();
        String arr[] = new String[50];
        arr =   sol.check(Exam.userAns);
        if( sol.totalCurrect==10)
            rl.setBackgroundResource(R.drawable.perfect);
        else
            rl.setBackgroundResource(R.drawable.home);

        txt.setText("You Have Spelled "+Integer.toString(sol.totalCurrect)+ " out of 10 Correctly!");
        txt.setTextSize(20);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_score, menu);
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
    public void scoreClicked(View view)
    {
        Intent intent = new Intent(this,Result.class);
        startActivity(intent);
        finish();


    }

}
