package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class FizzBuzz {


    public String[] toFizzBuzz(String[] numbers) {
        List<String> a = new ArrayList<String>();
        List<String> error = new ArrayList<>();



        if (numbers.length == 0) {
            for (int i=1; i <= 100; i++) {
                if (i % 15 == 0) {
                    a.add("FizzBuzz");

                }

                else if (i % 3 == 0) {
                    a.add("Fizz");

                }

                else if (i % 5 == 0) {
                    a.add("Buzz");

                }

                else a.add(String.valueOf(i));
            }
            return a.toArray(new String[0]);
        };

        for (String number : numbers) {
            if (isNumeric(number)) {
                Integer num = Integer.parseInt(number);
                if (num % 15 == 0) {
                    a.add("FizzBuzz");

                }

                else if (num % 3 == 0) {
                    a.add("Fizz");

                }

                else if (num % 5 == 0) {
                    a.add("Buzz");

                }

                else a.add(String.valueOf(num));
            }
            else {
                error.add("ERROR: " + number + " is not a valid input!");
                return error.toArray(new String[0]);
            }
        }
        return a.toArray(new String[0]);
    }

    public static boolean isNumeric(String value){
        if (value == null) {
            return false;
        }
        try {
            int n = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    }







