package calculator;// package src;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Welcome to terminal based Scientific Calculator. \n");
            System.out.println("Choose the operation");
            System.out.print("1. Factorial\n" +
                    "2. Square root\n" +
                    "3. Power\n" +
                    "4. Natural Logarithm\n" +
                    "5. Exit\n" +
                    "Enter your choice: "
            );
            int choice;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Please Input a integer Choice from the given menu");
                return;
            }https://github.com/CodeDetector/mini-calculator.git

            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Please input a number whose factorial is to be calculated : ");
                    double factorial = input.nextDouble();
                    System.out.println("Factorial of " + factorial + " is : " + calculator.computeFactorial(factorial) + "\n");
                    logger.info("Factorial of " + factorial + " is : " + calculator.computeFactorial(factorial));
                    break;

                case 2:
                    // Square root
                    System.out.print("Enter a number whose square root is to be calculated : ");
                    double root = input.nextDouble();
                    System.out.println("Square root of "+ root +" is : " + calculator.computeSquareRoot(root) + "\n");
                    break;

                case 3:
                    // Power
                    System.out.print("Enter the base number : ");
                    double base = input.nextDouble();
                    System.out.print("Enter the exponent number : ");
                    double exponent = input.nextDouble();
                    System.out.println(base + " raised to power " + exponent + " is : " + calculator.computePower(base, exponent) + "\n");
                    break;

                case 4:
                    // Natural log
                    System.out.print("Enter a number whose log is to be calculated : ");
                    double log = input.nextDouble();
                    System.out.println("Natural log of " + log + " is : " + calculator.computeNaturalLog(log) + "\n");
                    break;

                default:
                    System.out.println("Exiting Calculator! GoodBye!");
                    return;
            }
        } while (true);
    }


    public static double computeFactorial(double inp) {
        double result = fact(inp);
        logger.info("Factorial of " + inp + " is : " + result);
        return result;
    }


    public static double computeSquareRoot(double inp) {
        double result = Math.sqrt(inp);
        logger.info("SquareRoot of " + inp + " is : " + result);
        return result;
    }


    public static double computePower(double inp1, double inp2) {
        double result = Math.pow(inp1,inp2);
	logger.info(inp1+" raised to the power of "+inp2 +" is : " +result);
	return result;
    }

    public static double computeNaturalLog(double inp) {
        double result = 0;
        try {

            if (inp < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(inp);
		logger.info("Natural log of "+ inp + " is : " + result  ) ; 
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());

	    logger.info("Cannot find log of negative numbers "+error.getLocalizedMessage());
        }
        return result;
    }
    public static double fact(double inp) {
        double factorial = 1;
        for(double i = 1; i <= inp; ++i){
            factorial *= i;
        }
        return factorial;
    }
}   
