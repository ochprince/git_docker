package com.colasoft.docker_trial.first;

import java.math.BigInteger;

public class GreatNumber {

    static class BigInt {
        public static void main(String[] args){
            BigInteger init = BigInteger.ONE;
            BigInteger factorial = factorial(BigInteger.valueOf(1000L), init);
            System.out.println("factorial = " + factorial);
        }

        private static BigInteger factorial(BigInteger ten, BigInteger init) {
            if (ten.compareTo(BigInteger.ONE)>0) {
                init = ten.multiply(init);
                return factorial(ten.subtract(BigInteger.ONE), init);
            } else {
                return init;
            }
        }
    }

    static class GuessWord {
        String[] args = {"k", "m", "a", "i", "t", "s"};
        public static void main(String[] args) {
            printAll("******e", args);
        }

        private static void printAll(String s, String[] args) {


        }
    }
}
