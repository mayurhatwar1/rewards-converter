import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        // Create an instance of RewardValue with the cash value
        RewardValue rewardValue = new RewardValue(cashValue);
        
        // Perform the conversion
        double miles = rewardValue.convertToMiles();
        
        // Display the result
        System.out.printf("Cash value of $%.2f is equivalent to %.2f airline miles.%n", cashValue, miles);
    }
}
