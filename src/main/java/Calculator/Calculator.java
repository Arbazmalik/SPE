package Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.log;
import static java.lang.Math.sqrt;


public class Calculator {

    public  double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    //comment2222
    //new comment
    public double sqroot(double number1) {
        double result = Math.sqrt(number1);
        return result;
    }
    //comment1
    //comment2

    public double power(double number1, double number2) {
        double result = Math.pow(number1,number2);
        return result;
    }

    public double naturalLog(double number1) {
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        return result;
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        logger.info("Calculator started");

        while (true) {
            System.out.println("Enter an operation (factorial, sqrt, log, power) or 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                logger.info("Calculator stopped");
                break;
            }


            switch (operation) {
                case "factorial":
                    System.out.println("Enter a number:");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    result = calculator.factorial(n);
                    logger.info("Factorial of {} is {}", n, result);
                    break;

                case "sqrt":
                    System.out.println("Enter a number:");
                    double x = scanner.nextDouble();
                    scanner.nextLine();
                    result = calculator.sqroot(x);
                    logger.info("Square root of {} is {}", x, result);
                    break;

                case "log":
                    System.out.println("Enter a number:");
                    double y = scanner.nextDouble();
                    scanner.nextLine();
                    try {
                    if (y <0 ) {
                        result = Double.NaN;
                        throw new ArithmeticException("Case of NaN 0.0/0.0");
                    }
                    else {
                        result = log(y);
                    }
                 } catch (ArithmeticException error) {
                    System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
                }
                    logger.info("Natural log of {} is {}", y, result);
                    break;

                case "power":
                    System.out.println("Enter a base:");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter an exponent:");
                    double exponent = scanner.nextDouble();
                    scanner.nextLine();
                    result = calculator.power(base, exponent);
                    logger.info("{} to the power of {} is {}", base, exponent, result);
                    break;

                default:
                    System.out.println("Invalid operation. Try again.");
                    continue;
            }
        }
    }

}