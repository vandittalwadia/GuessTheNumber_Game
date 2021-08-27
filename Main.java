package com.javafirstpros;
import java.util.*;


public class Main {
    static int count=0;
    static class Game
    {
        public int mynum;

        {
            mynum = (int)(Math.random()*100);

        }
        public int iscorrect(int num , int mynum)
        {
            count++;
            if(num==mynum)
            {
                System.out.println("great");
                return 1;
            }

            else if(num<mynum)
            {
                System.out.println("num is greater then this");
                return -1;
            }
            else
            {
                System.out.println("num is less than this");
                return -1;
            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        int num;
        System.out.println("Rules:");
        System.out.println("* The minimum guesses you make the more you gain");
        System.out.println("* If you make less than 5 (1-4) guesses you score 100 points");
        System.out.println("* If you make  between 5 to 7 guesses you score 60 points");
        System.out.println("* If you make  more than 7 guesses you score 10  points");
        Game g = new Game();
       do{
           Scanner sc = new Scanner(System.in);
           System.out.println("Guess my number :-");
            num=sc.nextInt();


           int s = g.iscorrect(num , g.mynum);
           if (s==1)
              {System.out.println("Number of guesses -- " +count);
                  if(count<5)
                      System.out.println("Your score : 100");
                  else if(count>=5 && count<=7)
                      System.out.println("Your score : 60");
                  else
                      System.out.println("Your score : 10");

               break;}
           else if(s==-1)
               continue;

       }while(num>=0);


    }
}
