package com.example.demo;

import org.assertj.core.api.Assert;

import com.example.demo.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnsNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"1","2","4","7","8"});
        Assertions.assertArrayEquals(new String[]{"1","2","4","7","8"}, result);
    }

    @Test
    public void fizzBuzzReturnsFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"3","6","9","12","18"});
        Assertions.assertArrayEquals(new String[]{"Fizz","Fizz","Fizz","Fizz","Fizz"}, result);
    }

    @Test
    public void fizzBuzzReturnsBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"5","10","20","25","35"});
        Assertions.assertArrayEquals(new String[]{"Buzz","Buzz","Buzz","Buzz","Buzz"}, result);
    }

    @Test
    public void fizzBuzzReturnsFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"15","30","45","60","75"});
        Assertions.assertArrayEquals(new String[]{"FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz"}, result);
    }

    @Test
    public void fizzBuzzReturnsErrorDoubleInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"1","2","3","4","4.5"});
        Assertions.assertArrayEquals(new String[]{"ERROR: 4.5 is not a valid input!"}, result);
    }

    @Test
    public void fizzBuzzReturnsErrorStringInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{"1","2","3","4","five"});
        Assertions.assertArrayEquals(new String[]{"ERROR: five is not a valid input!"}, result);
    }

    @Test
    public void fizzBuzzReturns1To100NoInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.toFizzBuzz(new String[]{});
        Assertions.assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz","31","32","Fizz","34","Buzz","Fizz","37","38","Fizz","Buzz","41","Fizz","43","44","FizzBuzz","46","47","Fizz","49","Buzz","Fizz","52","53","Fizz","Buzz","56","Fizz","58","59","FizzBuzz","61","62","Fizz","64","Buzz","Fizz","67","68","Fizz","Buzz","71","Fizz","73","74","FizzBuzz","76","77","Fizz","79","Buzz","Fizz","82","83","Fizz","Buzz","86","Fizz","88","89","FizzBuzz","91","92","Fizz","94","Buzz","Fizz","97","98","Fizz","Buzz"}, result);
    }
}
