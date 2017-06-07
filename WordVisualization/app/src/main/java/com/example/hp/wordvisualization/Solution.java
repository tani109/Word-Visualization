package com.example.hp.wordvisualization;

/**
 * Created by HP on 6/27/2015.
 */
public class Solution {
    static int IN=0,totalCurrect;

    String[] ans = new String[50];
    Solution (){
        IN=0;
        totalCurrect=0;
        ans[0]="Dog";
        ans[1]="Frog";
        ans[2]="Shark";
        ans[3]="Donkey";
        ans[4]="Lion";
        ans[5]="Elephant";
        ans[6]="Horse";
        ans[7]="Giraffe";
        ans[8]="Snake";
        ans[9]="Rabbit";

        ans[10]="Apple";
        ans[11]="Banana";
        ans[12]="Pineapple";
        ans[13]="Mango";
        ans[14]="Turtle";
        ans[15]="Coconut";
        ans[16]="Butterfly";
        ans[17]="Carrot";
        ans[18]="Strawberry";

        ans[19]="Monkey";
        ans[20]="Penguin";

        ans[21]="Tiger";
        ans[22]="Cat";
        ans[23]="Cow";
        ans[24]="Goat";
        ans[25]="Kangaroo";
        ans[26]="Watermelon";
        ans[27]="Crocodile";
        ans[28]= "Whale";
        ans[29] = "Zebra";







    }

    String []  check(String [] answers){
        String [] finalList = new String[500];
        finalList[IN++] = "Original ans | Your ans | verdict";
        for(int i=0;i< 30;i++)
        {
           if (answers[i].isEmpty())
               continue;



             if(answers[i].equalsIgnoreCase(ans[i]))
            {
                finalList[IN++] = ans[i] +" |  " + answers[i] + "  | CORRECT";
                totalCurrect++;

            }
            else
                finalList[IN++] = ans[i] +" |  " + answers[i]  + "  | WRONG!";





        }

        return finalList;
    }

}
