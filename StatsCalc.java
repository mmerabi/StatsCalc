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
        out.println("You entered "+num+"/"+denom);


        if(num == 0){
            out.println("There is a zero percent chance of this probability");
        }
        if(denom == 0) {
            out.println("You can not divide by 0");
        }


            double odds = Double.valueOf(num)/Double.valueOf(denom);
            int attempts = 0;

            do {attempts++;}
            while  (Math.random() > odds);
            System.out.println("attempts: "+attempts);


        }
    }
