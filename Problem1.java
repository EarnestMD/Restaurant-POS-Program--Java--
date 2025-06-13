import java.util.Scanner;

/**
Creating a simple POS program separated into three problem files for a restaurant that calculates total bill value, value per person, tip, tax and prints an itemized bill.

The inputs and outputs for the program are as follows:

--Problem1--

Input: 2 20 10 30 0

Output: Total: 60.00 CAD Divided by 2: 30.00 CAD
 * This class represents a simple a program that will read how many people are sitting at the table and the value of each purchased item to compute the total cost of the meal.
 *
 * @author Nilay Das
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int peopleAtTable = in.nextInt();

        double itemValue = in.nextDouble();
        double sum = 0 + itemValue;

        while (itemValue > 0) {
            itemValue = in.nextDouble();
            sum = sum + itemValue;
        }

        double division = sum / peopleAtTable;

        System.out.printf("Total: %.2f CAD\n", sum);
        System.out.printf("Divided by %d: %.2f CAD\n", peopleAtTable, division);
    }
}
