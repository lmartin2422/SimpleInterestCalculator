import java.util.*;

public class Main {
    public static void main(String[] args) {

        float principle, rate, time;
        Scanner input = new Scanner(System.in);
        System.out.println("SIMPLE INTEREST CALCULATOR");

        System.out.println("Enter the principle amount: ");
        principle = input.nextFloat();

        System.out.println("Enter the rate of interest: ");
        rate = input.nextFloat();

        System.out.println("Enter the time period: ");
        time = input.nextFloat();


        float simple_interest = (rate * time * principle)/100;


        System.out.println("The simple interest rate of $" +principle+ " for " +time+ " months at a rate of "
        +rate+ " is $" +simple_interest);


    }
}