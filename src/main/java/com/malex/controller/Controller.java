package com.malex.controller;

import com.malex.controller.base.AbstractController;
import com.malex.service.CatalanNumbers;

import java.util.Scanner;

/**
 * Created by malex on 07.06.16.
 */
public class Controller extends AbstractController {

    private CatalanNumbers numbers = new CatalanNumbers();
    private Scanner scanner = new Scanner(System.in);
    private boolean flag = true;


    public void init() {
        while (flag) {
            try {
                start();
                String str = scanner.nextLine();
                if(!close(str)){
                    int num = validNumber(str);
                    numbers.setCount(num);
                    print(numbers.calculate());
                } else {
                    flag = false;
                }
            } catch (NumberFormatException e){
                printError(0);
            } catch (IllegalArgumentException e){
                printError(1);
            }

        }

    }


}
