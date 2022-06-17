public class Number {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public long calculateTriangleNumber(int n) {

        return ((long) n * ((long) n + 1)) / 2;

    }
}
