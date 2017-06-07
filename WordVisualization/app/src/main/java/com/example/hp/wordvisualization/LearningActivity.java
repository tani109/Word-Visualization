package com.example.hp.wordvisualization;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class LearningActivity extends Activity {
    ImageView iv;
    Button button,b1,b2;
    TextView textview;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        counter = 0;
        iv = (ImageView) findViewById(R.id.img1);
        iv.setImageResource(R.drawable.dog);
        textview = (TextView)findViewById(R.id.textlearn);
        textview.setText("Dog");
        textview.setTypeface(null, Typeface.BOLD);
        textview.setTextSize(32);
        //textview.setTextColor(Color.CYAN);
        button = (Button) findViewById(R.id.Button1);
        button.setText("NEXT");
        button.setTypeface(null,Typeface.BOLD);
        b2 = (Button) findViewById(R.id.Button2);
        b2.setTypeface(null,Typeface.BOLD);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learning, menu);
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
    public void learnComplete(View view)
    {
        finish();

    }
    public void learn(View view) {
        //
        counter++;
        if (counter == 20)
        {
            iv.setImageResource(R.drawable.frog);
            textview.setText("Frog");
        }
        if (counter == 2)
        {
            iv.setImageResource(R.drawable.shark);
            textview.setText("Shark");
        }

        if (counter == 3)
        {
            iv.setImageResource(R.drawable.donkey);
            textview.setText("Donkey");

        }
        if (counter == 21)
        {
            iv.setImageResource(R.drawable.lion);
            textview.setText("Lion");
        }
        if (counter == 5)
        {
            iv.setImageResource(R.drawable.elephant);
            textview.setText("Elephant");
        }
        if (counter == 6)
        {
            iv.setImageResource(R.drawable.horse);
            textview.setText("Horse");
        }
        if (counter == 7)
        {
            iv.setImageResource(R.drawable.giraffe);
            textview.setText("Giraffe");
        }
        if (counter == 8)
        {
            iv.setImageResource(R.drawable.snake);
            textview.setText("Snake");
        }
        if (counter == 9)
        {
            iv.setImageResource(R.drawable.rabbit);
            textview.setText("Rabbit");
        }
        if (counter == 10)
        {
            iv.setImageResource(R.drawable.apple);
            textview.setText("Apple");
        }
        if (counter == 11)
        {
            iv.setImageResource(R.drawable.banana);
            textview.setText("Banana");
        }
        if (counter == 12)
        {
            iv.setImageResource(R.drawable.pineapple);
            textview.setText("Pineapple");
        }
        if (counter == 13)
        {
            iv.setImageResource(R.drawable.mango);
            textview.setText("Mango");
        }
        if (counter == 14)
        {
            iv.setImageResource(R.drawable.turtle);
            textview.setText("Turtle");
        }
        if (counter == 15)
        {
            iv.setImageResource(R.drawable.butterfly);
            textview.setText("Butterfly");
        }
        if (counter == 16)
        {
            iv.setImageResource(R.drawable.coconut);
            textview.setText("Coconut");
        }

        if (counter == 17)
        {
            iv.setImageResource(R.drawable.carrot);
            textview.setText("Carrot");
        }
        if (counter == 18)
        {
            iv.setImageResource(R.drawable.strawberry);
            textview.setText("Strawberry");
        }
        if (counter == 19)
        {
            iv.setImageResource(R.drawable.monkey);
            textview.setText("Monkey");
        }
        if (counter == 1)
        {
            iv.setImageResource(R.drawable.tiger);
            textview.setText("Tiger");
        }
        if (counter == 22)
        {
            iv.setImageResource(R.drawable.cat);
            textview.setText("Cat");
        }
        if (counter == 4)
        {
            iv.setImageResource(R.drawable.cow);
            textview.setText("Cow");
        }
        if (counter == 23)
        {
            iv.setImageResource(R.drawable.goat);
            textview.setText("Goat");
        }
        if (counter == 24)
        {
            iv.setImageResource(R.drawable.penguin);
            textview.setText("Penguin");
        }
        if (counter == 25)
        {
            iv.setImageResource(R.drawable.kangaroo);
            textview.setText("Kangaroo");
        }
        if (counter == 26)
        {
            iv.setImageResource(R.drawable.watermelon);
            textview.setText("Watermelon");
        }
        if (counter == 27)
        {
            iv.setImageResource(R.drawable.crocodile);
            textview.setText("Crocodile");
        }
        if (counter == 28)
        {
            iv.setImageResource(R.drawable.whale);
            textview.setText("Whale");
        }
        if (counter == 29)
        {
            iv.setImageResource(R.drawable.zebra);
            textview.setText("Zebra");
            button.setText("Take Exam");
        }





        if(counter ==30)
        {

            Intent intent = new Intent(this,Exam.class);
            startActivity(intent);
            finish();
        }

    }

}
