package com.example.hp.wordvisualization;

/**
 * Created by HP on 7/1/2015.
 */
import java.util.Random;

/**
 * Created by HP on 6/29/2015.
 */
public class RandomNumber {
    int arr[] = new int[50];
    boolean [] flag =  new boolean[50];
    RandomNumber(int n)
    {

        for(int i=0;i<n;i++)
            flag[i]=false;
        Random rn = new Random();
        int tmp;

        for(int i=0;i<n;i++)
        {
            tmp=rn.nextInt(n);
            if(flag[tmp]==false)
            {
                arr[i]=tmp;
                flag[tmp]=true;

            }
            else{
                int in=tmp+1;
                while(flag[in]==true && in<n)
                    in++;
                if(in!=n)
                {
                    arr[i]=in;
                    flag[in]=true;
                }
                else
                {
                    in=0;
                    while(flag[in]==true && in<n)
                        in++;
                    arr[i]=in;
                    flag[in]=true;

                }




            }





        }

    }


}
