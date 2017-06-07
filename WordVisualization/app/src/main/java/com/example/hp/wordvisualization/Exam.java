package com.example.hp.wordvisualization;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class Exam extends Activity {
    ImageView iv;
    Button button;
    EditText edittext;
    int counter;
    RandomNumber rn;
    int prev;
    static String[] userAns = new  String[500];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        counter=0;
        rn = new RandomNumber(30);
        super.onCreate(savedInstanceState);
        for(int i=0;i<30;i++)
            userAns[i] = "";
        setContentView(R.layout.activity_exam);
        iv = (ImageView) findViewById(R.id.img1);

        if (rn.arr[0] == 0)
        {
            iv.setImageResource(R.drawable.dog);
            prev=0;
        }
        if (rn.arr[0] == 1)
        {   iv.setImageResource(R.drawable.frog);
            prev=1;
        }
        if (rn.arr[0] == 2)
        {   iv.setImageResource(R.drawable.shark);
            prev=2;
        }
        if (rn.arr[0] == 3)
        {   iv.setImageResource(R.drawable.donkey);
            prev=3;
        }
        if (rn.arr[0] == 4)
        {   iv.setImageResource(R.drawable.lion);
            prev=4;
        }
        if (rn.arr[0] == 5)
        {   iv.setImageResource(R.drawable.elephant);
            prev=5;
        }
        if (rn.arr[0] == 6)
        {   iv.setImageResource(R.drawable.horse);
            prev=6;
        }
        if (rn.arr[0] == 7)
        {   iv.setImageResource(R.drawable.giraffe);
            prev=7;
        }
        if (rn.arr[0] == 8)
        {   iv.setImageResource(R.drawable.snake);
            prev=8;
        }
        if (rn.arr[0] == 9)
        {   iv.setImageResource(R.drawable.rabbit);
            prev=9;
        }
        if (rn.arr[0] == 10)
        {   iv.setImageResource(R.drawable.apple);
            prev=10;
        }
        if (rn.arr[0] == 11)
        {   iv.setImageResource(R.drawable.banana);
            prev=11;
        }
        if (rn.arr[0] == 12)
        {   iv.setImageResource(R.drawable.pineapple);
            prev=12;
        }
        if (rn.arr[0] == 13)
        {   iv.setImageResource(R.drawable.mango);
            prev=13;
        }
        if (rn.arr[0] == 14)
        {   iv.setImageResource(R.drawable.turtle);
            prev=14;
        }
        if (rn.arr[0] == 15)
        {   iv.setImageResource(R.drawable.coconut);
            prev=15;
        }
        if (rn.arr[0] == 16)
        {   iv.setImageResource(R.drawable.butterfly);
            prev=16;
        }
        if (rn.arr[0] == 17)
        {   iv.setImageResource(R.drawable.carrot);
            prev=17;
        }
        if (rn.arr[0] == 18)
        {   iv.setImageResource(R.drawable.strawberry);
            prev=18;
        }
        if (rn.arr[0] == 19)
        {
            iv.setImageResource(R.drawable.monkey);
            prev=19;
        }
        if (rn.arr[counter] == 20)
        {
            iv.setImageResource(R.drawable.penguin);
            prev=20;
        }
        if (rn.arr[counter] == 21)
        {
            iv.setImageResource(R.drawable.tiger);
            prev=21;
        }
        if (rn.arr[counter] == 22)
        {
            iv.setImageResource(R.drawable.cat);
            prev=22;
        }
        if (rn.arr[counter] == 23)
        {
            iv.setImageResource(R.drawable.cow);
            prev=23;
        }
        if (rn.arr[counter] == 24)
        {
            iv.setImageResource(R.drawable.goat);
            prev=24;
        }
        if (rn.arr[counter] == 25)
        {
            iv.setImageResource(R.drawable.kangaroo);
            prev=25;
        }
        if (rn.arr[counter] == 26)
        {
            iv.setImageResource(R.drawable.watermelon);
            prev=26;
        }
        if (rn.arr[counter] == 27)
        {
            iv.setImageResource(R.drawable.crocodile);
            prev=27;
        }
        if (rn.arr[counter] == 28)
        {
            iv.setImageResource(R.drawable.whale);
            prev=28;
        }
        if (rn.arr[counter] == 29)
        {
            iv.setImageResource(R.drawable.zebra);
            prev=29;
        }






        button = (Button) findViewById(R.id.Button5);
        edittext = (EditText) findViewById(R.id.answer);
        edittext.setText("");
        button.setText("NEXT");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exam, menu);
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
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
    public void exam(View view) {
        //

        counter++;
        if(counter==10)
        {


            Intent intent = new Intent(this,ScoreActivity.class);
          startActivity(intent);
            finish();
            String tmp;
            tmp=edittext.getText().toString();
            if(!tmp.equals(""))
                userAns[prev]= edittext.getText().toString();
            else
                userAns[prev]= "Not Answered";
            return ;
        }
        String tmp;
        tmp=edittext.getText().toString();
        if(!tmp.equals(""))
            userAns[prev]= edittext.getText().toString();
        else
            userAns[prev]= "Not Answered";


        edittext.setText("");
        if (rn.arr[counter] == 0) {
            iv.setImageResource(R.drawable.dog);
            prev=0;
        }
        if (rn.arr[counter] == 1) {
            iv.setImageResource(R.drawable.frog);
            prev=1;
        }if (rn.arr[counter] == 2) {
            iv.setImageResource(R.drawable.shark);
            prev=2;
        }
        if (rn.arr[counter] == 3)
        {
            iv.setImageResource(R.drawable.donkey);
            prev=3;



        }if (rn.arr[counter] == 4)
        {
            iv.setImageResource(R.drawable.lion);
            prev=4;



        }if (rn.arr[counter] == 5)
        {
            iv.setImageResource(R.drawable.elephant);
            prev=5;



        }if (rn.arr[counter] == 6)
        {
            iv.setImageResource(R.drawable.horse);
            prev=6;



        }if (rn.arr[counter] == 7)
        {
            iv.setImageResource(R.drawable.giraffe);
            prev=7;



        }if (rn.arr[counter] == 8)
        {
            iv.setImageResource(R.drawable.snake);
            prev=8;



        }
        if (rn.arr[counter] == 9)
        {
            iv.setImageResource(R.drawable.rabbit);
            prev=9;

        }
        if (rn.arr[counter] == 10)
        {
            iv.setImageResource(R.drawable.apple);
            prev=10;



        }if (rn.arr[counter] == 11)
        {
            iv.setImageResource(R.drawable.banana);
            prev=11;



        }
        if (rn.arr[counter] == 12)
        {
            iv.setImageResource(R.drawable.pineapple);
            prev=12;



        }if (rn.arr[counter] == 13)
        {
            iv.setImageResource(R.drawable.mango);
            prev=13;



        }
        if (rn.arr[counter] == 14)
        {
            iv.setImageResource(R.drawable.turtle);
            prev=14;
        }
        if (rn.arr[counter] == 15)
        {
            iv.setImageResource(R.drawable.coconut);
            prev=15;
        }
        if (rn.arr[counter] == 16)
        {
            iv.setImageResource(R.drawable.butterfly);
            prev=16;
        }
        if (rn.arr[counter] == 17)
        {
            iv.setImageResource(R.drawable.carrot);
            prev=17;
        }
        if (rn.arr[counter] == 18)
        {
            iv.setImageResource(R.drawable.strawberry);
            prev=18;
        }
        if (rn.arr[counter] == 19)
        {
            iv.setImageResource(R.drawable.monkey);
            prev=19;
        }

        if (rn.arr[counter] == 20)
        {
            iv.setImageResource(R.drawable.penguin);
            prev=20;
        }
        if (rn.arr[counter] == 21)
        {
            iv.setImageResource(R.drawable.tiger);
            prev=21;
        }
        if (rn.arr[counter] == 22)
        {
            iv.setImageResource(R.drawable.cat);
            prev=22;
        }
        if (rn.arr[counter] == 23)
        {
            iv.setImageResource(R.drawable.cow);
            prev=23;
        }
        if (rn.arr[counter] == 24)
        {
            iv.setImageResource(R.drawable.goat);
            prev=24;
        }
        if (rn.arr[counter] == 25)
        {
            iv.setImageResource(R.drawable.kangaroo);
            prev=25;
        }
        if (rn.arr[counter] == 26)
        {
            iv.setImageResource(R.drawable.watermelon);
            prev=26;
        }
        if (rn.arr[counter] == 27)
        {
            iv.setImageResource(R.drawable.crocodile);
            prev=27;
        }
        if (rn.arr[counter] == 28)
        {
            iv.setImageResource(R.drawable.whale);
            prev=28;
        }
        if (rn.arr[counter] == 29)
        {
            iv.setImageResource(R.drawable.zebra);
            prev=29;
        }




        if(counter==9)
            button.setText("FINISH");

    }
}

