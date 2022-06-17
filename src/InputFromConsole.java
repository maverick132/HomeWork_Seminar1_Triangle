import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromConsole {
        private boolean isStop = false;
        private boolean isString = false;
        private boolean isNegative = false;

        public void setIsStop (boolean stop) {
            this.isStop = stop;
        }

        public boolean getIsStop(){
            return this.isStop;
        }

        public void setIsString (boolean isString) {
            this.isString = isString;
        }

        public boolean getIsString(){
            return this.isString;
        }

        public void setIsNegative(boolean isNegative){
            this.isNegative = isNegative;
        }

        public boolean getIsNegative(){
            return this.isNegative;
        }

        public void inputNumber(Number number) {
            setIsStop(false);
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            if (iScanner.hasNextInt()) {
                number.setNumber(iScanner.nextInt());
                setIsString(false);
                if (number.getNumber() < 0) {
                    setIsNegative(true);
                    System.out.print("Error! Enter negative number\n");
                }
                else setIsNegative(false);

            }
            else if (iScanner.next().equals("stop")) {
                setIsStop(true);
            }
            else {
                System.out.print("Error! Invalid data entry\n");
                setIsString(true);
            }
//        try {
//           number.setNumber(iScanner.nextInt());
//            }
//        catch (InputMismatchException e) {
//           System.out.print("Error! Invalid data entry\n");
//        }
    }
}
