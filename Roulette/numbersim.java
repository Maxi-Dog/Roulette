package Roulette;

import javax.swing.*;

public class numbersim {
    public static void main(String[] args) {
        JFrame gui = new JFrame();
        gui.setSize(1000, 1000);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int num = rand(0, 37);
        System.out.println(num);
        if (num == 0) {
            System.out.println("Zero");
            System.out.println("Green");
        } else {
            if (num == 37) {
                System.out.println("Zero");
                System.out.println("Green");
            } else {
                if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9 || num == 12 || num == 14 || num == 16
                        || num == 18 || num == 19 || num == 21 || num == 23 || num == 25 || num == 27 || num == 30
                        || num == 32 || num == 34 || num == 36) {
                    if (num % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                    System.out.println("Red");
                } else {
                    if (num % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                    System.out.println("Black");
                }
            }
        }
    }

    public static int rand(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + 1;
    }
}
