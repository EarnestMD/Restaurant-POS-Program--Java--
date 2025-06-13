import java.util.Arrays;
import java.util.Scanner;

/**
Input: 2 5 salumi misti 18 linguine alla carbonara 17 tortellini al prosciutto 20 crème brûlée al caffè 10 coppa al caramello 10 20 NS

Output: Itemized bill:

salumi misti : 18.00
linguine alla carbonara : 17.00
tortellini al prosciutto : 20.00
crème brûlée al caffè : 10.00
coppa al caramello : 10.00 Total before tax: 75.00 CAD Tip: 15.00 CAD Total after tax: 103.50 CAD Divided by 2: 51.75 CAD

 * This class represents a simple a program that will read how many people are sitting at the table and the value of each purchased item to compute the total cost of the meal.
 * It also applies the sales tax on the total value of the bill, including the tip.
 * Finally, this program adds an itemized bill that is it prints the name and price of each item that was purchased before the bill's total.
 *
 * @author Nilay Das
 */
public class Problem3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Input of number of people at table
        int peopleAtTable = in.nextInt();

        //Input of number of items purchased
        int items = in.nextInt();

        //Array to hold item names
        String itemName[] = new String[items];

        //Array to hold item price
        double itemPrice[] = new double[items];

        //Entries of dish name and price
        for (int i = 0; i < items; i++) {
            in.nextLine();
            itemName[i] = in.nextLine();
            itemPrice[i] = in.nextDouble();
        }

        //Storing the sum of price
        double sum = 0;
        for (int i = 0; i < itemPrice.length; i++) {
            sum = sum + itemPrice[i];
        }

        //Taking in tip and provincial code
        String tipAndCode0 = in.next();
        String tipAndCode1 = in.next();

        //Splitting tip and converting it into double
        double splitTip = Double.parseDouble(tipAndCode0);
        double tip = sum * (splitTip / 100);

        //Initializing tax
        double tax = 0;

        //If statements to match the provincial code with the tax amount
        if (tipAndCode1.equals("AB") || tipAndCode1.equals("NT") || tipAndCode1.equals("NU") || tipAndCode1.equals("YT")) {
            tax = (double) 5 / 100;
        }

        if (tipAndCode1.equals("SK")) {
            tax = (double) 11 / 100;
        }

        if (tipAndCode1.equals("BC") || tipAndCode1.equals("MB")) {
            tax = (double) 12 / 100;
        }

        if (tipAndCode1.equals("ON")) {
            tax = (double) 13 / 100;
        }

        if (tipAndCode1.equals("QC")) {
            tax = 14.98 / 100;
        }

        if (tipAndCode1.equals("NS") || tipAndCode1.equals("NL") || tipAndCode1.equals("PEI") || tipAndCode1.equals("NB")) {
            tax = (double) 15 / 100;
        }

        //Calculating the total after tip
        double totalAfterTip = sum + tip;

        //Method to print itemized bill
        printItemizedBill(itemName, itemPrice);

        System.out.printf("Total before tax: %.2f CAD\n", sum);
        System.out.printf("Tip: %.2f CAD\n", tip);
        System.out.printf("Total after tax: %.2f CAD\n", (totalAfterTip + (totalAfterTip * tax)));
        System.out.printf("Divided by 2: %.2f CAD\n", ((totalAfterTip + (totalAfterTip * tax)) / 2));
    }

    /**
     * This method prints the itemized bill.
     *
     * @param itemName  is the array holding all the item names.
     * @param itemPrice is the array holding all the item prices.
     */
    public static void printItemizedBill(String[] itemName, double[] itemPrice) {
        System.out.println("Itemized bill:");
        for (int i = 0; i < itemName.length; i++) {
            System.out.print("- " + itemName[i] + " : " + itemPrice[i]);
            System.out.println();
        }
    }
}
