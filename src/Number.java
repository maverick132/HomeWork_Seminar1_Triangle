public class Number {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }

    public int calculateTriangleNumber (int n) {
        return (n * (n + 1)) / 2;
    }
}
