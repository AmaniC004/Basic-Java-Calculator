import java.util.Scanner;

/**
 * JCalculator is a simple calculator program that performs basic arithmetic operations
 * and calculates the area of a circle, as well as the nth term and sum of an arithmetic progression.
 *
 * @author Nkechi Chukwuma
 * Last Edited: 19/04/2024
 */
public class JCalculator {

    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;

    Scanner scan = new Scanner(System.in);

    /**
     * Constructs a JCalculator object and prompts the user to input numbers and select an operation.
     */
    public JCalculator() {

        System.out.print("Enter First Number: ");
        firstNumber = Double.parseDouble(scan.nextLine());


        System.out.print("Enter Second Number: ");
        secondNumber = Double.parseDouble(scan.nextLine());


        System.out.println("");

        System.out.println("Operation Selection");
        System.out.println("---------*---------");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Circle Area");
        System.out.println("Enter 6 for AP Nth Number");
        System.out.println("Enter 7 for AP Nth Sum");

        System.out.println("");
        int choice = Integer.parseInt(scan.nextLine());

        selectOperation(choice);

    }

    /**
     * Calculates the area of a circle based on user input radius.
     */
    public void circleArea() {

        double radius = 0.0;
        System.out.print("Enter Circle Radius: ");
        radius = Double.parseDouble(scan.nextLine());

        double area = 3.142 * radius * radius;
        System.out.print("Circle Area = " + area);
    }

    /**
     * Performs addition of two numbers.
     */
    public void addition() {

        double sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);
    }

    /**
     * Performs subtraction of two numbers.
     */
    public void subtraction() {

        double difference = firstNumber - secondNumber;
        System.out.println("Difference = " + difference);

    }

    /**
     * Performs multiplication of two numbers.
     */
    public void multiplication() {

        double product = firstNumber * secondNumber;
        System.out.println("Product = " + product);

    }

    /**
     * Performs division of two numbers.
     */
    public void division() {

        double quotient = firstNumber / secondNumber;
        System.out.println("Quotient = " + quotient);

    }

    private void getAPnthTerm() {

        double nthTerm = firstNumber + (thirdNumber - 1) * secondNumber;

        System.out.println("Nth Term = " + nthTerm);
    }

    private void getAPnthSum() {

        double nthSum = (thirdNumber/2) * ((2*firstNumber) + (thirdNumber - 1) * secondNumber);

        System.out.println("Nth Sum = " + nthSum);
    }


    /**
     * Selects the operation based on the user's choice.
     * @param option The user's choice of operation.
     */
    public void selectOperation(int option) {

        if (option == 1 ) {
            addition();
        }
        else if (option == 2) {
            subtraction();
        }
        else if (option == 3) {
            multiplication();
        }
        else if (option == 4) {
            division();
        }
        else if (option == 5) {
            circleArea();
        }
        else if ((option == 6)||(option == 7)) {
            System.out.print("Enter Third Number: ");
            thirdNumber = Double.parseDouble(scan.nextLine());
            if(option == 6){
                getAPnthTerm();
            }
            else{
                getAPnthSum();
            }

        }
    }


    /**
     * The main method creates a JCalculator object and starts the program.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        JCalculator jc = new JCalculator();
    }

}
