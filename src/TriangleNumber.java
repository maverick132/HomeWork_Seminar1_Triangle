public class TriangleNumber {
    // Программа принимает на вход числа типа int (до 2147483647 включительно) и выдает на выходе треугольное число
    // с порядковым номером, которое соответствует введеному числу. Выход осуществляется введением в консоль слово
    // "stop". Выдает сообщение об ошибке при вводе: строк, дробных и отрицательных чисел.
    public static void main(String[] args) {
        InputFromConsole input = new InputFromConsole();
        Number number = new Number();
        while (!input.getIsStop()) { // Выполняется, пока в консоль не введем "stop"
            input.inputNumber(number);
            if (!input.getIsStop() && !input.getIsString() && !input.getIsNegative()) {
                System.out.printf("Triangle number for %d is %d\n",
                        number.getNumber(),
                        number.calculateTriangleNumber(number.getNumber()));
            }
        }
    }
}