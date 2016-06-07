package com.malex.controller.base;

/**
 * Created by malex on 07.06.16.
 */
public abstract class AbstractController {


    protected void start() {
        System.out.println("Enter a number or 'exit' to exit: ");
    }

    protected boolean close(String str) {
        return str.equals("exit");
    }

    protected int validNumber(String str) {
        try {
            int num = Integer.parseInt(str);
            if (num < 0) {
                throw new IllegalArgumentException();
            }
            return num;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException();
        }
    }

    protected void print(int num) {
        System.out.println(num);
    }

    protected void printError(int errorCode) {
        switch (errorCode) {
            case 0:
                System.out.println("Entered symbols isn't integer number!!!");
                break;

            case 1:
                System.out.println("Number must be a positive!!!");
                break;
        }
    }
}
