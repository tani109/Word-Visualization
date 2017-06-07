package com.example.hp.wordvisualization;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by HP on 6/27/2015.
 */
public class CustomAdaptar  extends BaseAdapter{
    Activity context;
    TextView txtV;
    ArrayList<String> items;
    int toggleColor=0;
    CustomAdaptar(Activity context, ArrayList<String> items){

        this.context= context;
        this.items = items;


    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            toggleColor++;
            convertView = context.getLayoutInflater().inflate(R.layout.listitem, parent , false);
            TextView txt =  (TextView) convertView.findViewById(R.id.txt1);
            txt.setText(items.get(position));
           // txt.setBackgroundResource(R.drawable.whitebutton);
            txt.setTextSize(18);
            if(toggleColor%2==0)
            txt.setBackgroundResource(R.color.green);
            else
            txt.setBackgroundResource(R.color.blue);


        }

        return convertView;
    }
}
