package ex05.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();

        System.out.print("What is the first number? ");
        String input1 = myApp.readInput();
        System.out.print("What is the Second number? ");
        String input2 = myApp.readInput();

        int num1 = myApp.convertInput(input1);
        int num2 = myApp.convertInput(input2);

        myApp.doMath(num1,num2);

    }
    private String readInput(){
        return in.nextLine();
    }
    private int convertInput(String input){
        int num = Integer.parseInt(input);
       return num;
    }
    private void doMath(int num1, int num2){
        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
       System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d ",num1,num2,add,num1,num2,sub,num1,num2,multi,num1,num2,div);
    }
}
