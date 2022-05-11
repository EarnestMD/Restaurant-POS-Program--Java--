import java.util.Scanner;

/**
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
