package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
	// write your code here

        double[] numbers = {5,4,99,-3,0,4.5,10,-56};

        double sum = 0;

        int count = 0;


        for (int i = 4; i < numbers.length; i++) {

            if (numbers[i] >= 0) {
                sum = sum + numbers[i];
                count ++;
            }
         //   System.out.println(sum);
        }

        System.out.println(count);

        System.out.println(sum);

        double division = sum / count;

        System.out.println(sum + " / " + count + " = " + division);

        System.out.println("________________________________________");


        Arrays.sort(numbers);

        for(int i = 0; i <  numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }


        double[] numbers2 = {5.6,5.3,-7.7,-8.5,9.0,2,5,6};

        boolean isFirstNegativeNumber = false;

        int count2 = 0;

        double resultsum = 0;

        for (double number22:numbers2) {
            if (number22<0){
                isFirstNegativeNumber = true;}

            if (isFirstNegativeNumber) {

                if (number22 > 0) {
                    resultsum = resultsum + number22;
                    count2++;
                }

            }
        }

        System.out.println("________________________________________");
        System.out.println(resultsum/count2);

    }

    }

