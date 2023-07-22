package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

public class Calcapp {
    private static final Scanner sc= new Scanner(System.in);
    private static final Logger logger = LoggerFactory.getLogger(Calcapp.class);
    public static void main(String[] args) throws IOException {
        System.out.println("Enter first num: ");
        int i = sc.nextInt();
        logger.debug("Entered first num: " + i);

        System.out.println("Enter second num: ");
        int j = sc.nextInt();
        logger.debug("Entered second num: " + j);

        System.out.print("Enter a char: ");
        String k = sc.next();
        logger.debug("Entered char: " + k);

        switch (k) {
            case "+" -> i = getSum(i, j);
            case "-" -> i = getSub(i, j);
            case "*" -> i = getMultiple(i, j);
            case "/" -> {
                if (j == 0) {
                    logger.error("can't divide by zero");
                    i = 0;
                } else {
                    i = getDivide(i, j);
                }
            }
        }
        logger.debug("result  " + i);
        System.out.println(i);
    }

    public static int getSum(int x, int y) {
        return x+y;
    }

    public static int getDivide(int x, int y) {
        return x/y;
    }

    public static int getMultiple(int x, int y) {
        return x*y;
    }
    public static int getSub(int x, int y) {
        return x-y;
    }
}