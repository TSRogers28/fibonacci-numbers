package com.company.FibonacciFactory;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
//        Deck deck = new Deck();
//        System.out.println(deck.getAmountOfCardsInDeck());
//        for(int x = 0; x < 52; x++){
//            System.out.println(deck.getCardNotRandom(x));
//        }
//
//        NumberHolder numberHolder = new NumberHolder(10.0f);
//        numberHolder.printNumber();
//        NumberHolder numberHolder1 = new NumberHolder(10);
//        numberHolder1.printNumber();
//
        FibonacciFactory fibonacciFactory = new FibonacciFactory(1);
        for(BigInteger y: fibonacciFactory.getFibonacciNumbers()){
            System.out.println(y);
        }

        // fibonacciFactory.getFibonacciNumbersWithoutArray(2);
//        System.out.println(fibonacciFactory.getFibonacciNumbers().length);
//        System.out.println(FibonacciFactory.getCertainFibonacciNumber(1000));
//        System.out.println(FibonacciFactory.getCertainFibonacciNumberWithNoArray(1000));
//

    }
}
