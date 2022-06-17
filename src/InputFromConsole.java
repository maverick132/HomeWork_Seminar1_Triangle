import java.util.Scanner;

public class InputFromConsole {
        public void inputNumber(Number number){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (!iScanner.hasNextInt()) {
            System.out.print("Неверный ввод данных!");
        }
        number.setNumber(iScanner.nextInt());
    }
}
