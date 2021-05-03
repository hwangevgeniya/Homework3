package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
	// write your code here

        double[] numbers = {5,4,99,-3,0,4.5,10,-56};

        double sum = 0;

        int count = 0;


        for (int i = 4; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                sum = sum + numbers[i];
                count ++;
            }
         //   System.out.println(sum);
        }

        System.out.println(count);

        System.out.println(sum);

        double division = sum / numbers.length;

        System.out.println(sum + " / " + count + " = " + division);

        System.out.println("________________________________________");


        Arrays.sort(numbers);

        for(int i = 0; i <  numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

    }

    }

