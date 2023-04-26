package Roulette;

//import javax.swing.*;
import java.util.Scanner;

public class numbersim {
    public static void main(String[] args) {
       /*   JFrame gui = new JFrame();
        gui.setSize(1000, 1000);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); */
        System.out.println("What do you want to bet on ? (Number) (Even) (Odd) (Red) (Black) (Green)");
        Scanner scan = new Scanner(System.in);
        String inpt = scan.next();
        int inptint;

        try{
            inptint = Integer.parseInt(inpt);
        }
        catch(NumberFormatException e){
            inptint = 0;
        }
        finally{
            scan.close();
        }
        int num = rand(0, 37);
        String in;
        String col;
        if (num == 0) {
            in = "Zero";
            col = "Green";
        } else {
            if (num == 37) {
                in = "Zero";
                col ="Green";
            } else {
                if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9 || num == 12 || num == 14 || num == 16
                        || num == 18 || num == 19 || num == 21 || num == 23 || num == 25 || num == 27 || num == 30
                        || num == 32 || num == 34 || num == 36) {
                    if (num % 2 == 0) {
                        in = "Even";
                    } else {
                        in = "Odd";
                    }
                    col = "Red";
                } else {
                    if (num % 2 == 0) {
                        in = "Even";
                    } else {
                        in = "Odd";
                    }
                    col = "Black";
                }
            }
        }
             if (inpt.equals(in)){
            System.out.println("You Win");
        }
        else{
            if (inpt.equals(col)){
                System.out.println("You Win");
            }
            else {
                if (inptint == num){
                    System.out.println("You win");
                }
                else {
                    System.out.println("You lose");
                }
            }
        }
        if (num != 37){
            System.out.println(num);
        }
        else{
            System.out.println("00");
        }
        System.out.println(in);
        System.out.println(col);
    }

    public static int rand(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + 1;
    }
}
