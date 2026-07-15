import jdk.jshell.SourceCodeAnalysis;
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int tempNumber = number;
        int digit;
        int sum = 0;
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }
        tempNumber = number;
        while (tempNumber != 0) {

            digit = tempNumber % 10;

            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            tempNumber = tempNumber / 10;
        }
        System.out.println("Number: " + originalNumber);

        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
    }
