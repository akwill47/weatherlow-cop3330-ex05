package ex05.base;
import java.util.Scanner;
/*Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.

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
