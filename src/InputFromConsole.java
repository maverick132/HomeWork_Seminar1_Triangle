import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromConsole {
        public void inputNumber(Number number) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        try {
           number.setNumber(iScanner.nextInt());
        }
        catch (InputMismatchException e) {
           System.out.print("Error! Invalid data entry\n");
        }
    }
}
