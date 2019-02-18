package com.company;

import java.util.*;
import static java.lang.System.*;

public class StatsCalc {


    public static void main(String[] args) {
        double num;
        double denom;
        int counter;


        out.println("Welcome to the probability calculator\n" +
                "Please enter a probability in the form of a fraction\n\n");


        //Asks user for the fraction and parses it into num and denom


        Scanner sc = new Scanner(in);
        String num_input = sc.next();
        StringTokenizer stok = new StringTokenizer(num_input, "/");
        num = Double.parseDouble(stok.nextToken());
        denom = Double.parseDouble(stok.nextToken());
        out.println("You entered "+num+"/"+denom+"\n");


        //Catch statements for logical errors
        if(num == 0){
            out.println("There is a zero percent chance of this probability");
        }
        if(denom == 0) {
            out.println("You can not divide by 0");
        }


        //Logical work of calculating the odds
        double odds = Double.valueOf(num)/Double.valueOf(denom);
        int attempts = 0;

        do {attempts++;}
        while  (Math.random() > odds);

        //Calculating the likelihood of user getting these results
        double percent = Math.pow((1-odds),(attempts - 1));
        percent = percent * odds;
        percent = percent * 100;


        //Printing out results
        System.out.println("It took " + attempts +" attempts to hit your probability\n");
        System.out.printf("This is  %.3f" , percent);
        System.out.print("% likely to happen");


    }
}
