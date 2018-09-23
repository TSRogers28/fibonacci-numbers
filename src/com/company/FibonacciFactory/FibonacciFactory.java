package com.company.FibonacciFactory;

import java.math.BigInteger;

public class FibonacciFactory {

    private BigInteger[] fibonacciNumbers;
    public FibonacciFactory(){


    }

    public FibonacciFactory(int input){
        fibonacciNumbers = new BigInteger[input];
        fibonacciNumbers[0] = new BigInteger("0");
        fibonacciNumbers[1] = new BigInteger("1");
        for(int x = 2; x < input; x++){
            fibonacciNumbers[x] = fibonacciNumbers[x-2].add(fibonacciNumbers[x-1]);
        }
    }

    public BigInteger[] getFibonacciNumbers(){
        return fibonacciNumbers;
    }

    public void getFibonacciNumbersWithoutArray(int input){
        BigInteger previousNumber = new BigInteger("0");
        BigInteger currentNumber = new BigInteger("1");
        int counter = input-2;
        while(counter != 0){
            System.out.println(previousNumber);
            BigInteger temp = previousNumber.add(currentNumber);
            previousNumber = currentNumber;
            currentNumber = temp;
            counter--;
        }
        System.out.println(currentNumber);
    }

    static public BigInteger getCertainFibonacciNumber(int input){
        BigInteger [] fibonacciNums =  new FibonacciFactory(input).getFibonacciNumbers();
        return fibonacciNums[input-1];
    }

     static public BigInteger getCertainFibonacciNumberWithNoArray(int input){
        BigInteger previousNumber = new BigInteger("0");
        BigInteger currentNumber = new BigInteger("1");
        int counter = input-2;
        while(counter != 0){
            BigInteger temp = previousNumber.add(currentNumber);
            previousNumber = currentNumber;
            currentNumber = temp;
            counter--;
        }
        return currentNumber;
    }

}
