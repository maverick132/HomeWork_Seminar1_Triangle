public class Main {
    public static void main(String[] args) {
        InputFromConsole input = new InputFromConsole();
        Number number = new Number();
        input.inputNumber(number);
        System.out.println(number.calculateTriangleNumber(number.getNumber()));
    }
}