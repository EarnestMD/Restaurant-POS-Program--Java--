import java.util.Scanner;

/**
--Problem2--

Input: 2 20 10 30 0 13 ON

Output: Total before tax: 60.00 CAD Tip: 7.80 CAD Total after tax: 76.61 CAD Divided by 2: 38.31 CAD

 * This class represents a simple a program that will read how many people are sitting at the table and the value of each purchased item to compute the total cost of the meal.
 * It also applies the sales tax on the total value of the bill, including the tip.
 *
 * @author Nilay Das
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int peopleAtTable = in.nextInt();

        double itemValue = in.nextDouble();
        double sum = 0 + itemValue;

        while (itemValue > 0) {
            itemValue = in.nextDouble();
            sum = sum + itemValue;
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

        System.out.printf("Total before tax: %.2f CAD\n", sum);
        System.out.printf("Tip: %.2f CAD\n", tip);
        System.out.printf("Total after tax: %.2f CAD\n", (totalAfterTip + (totalAfterTip * tax)));
        System.out.printf("Divided by 2: %.2f CAD\n", ((totalAfterTip + (totalAfterTip * tax)) / 2));
    }
}
