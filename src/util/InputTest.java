package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        test.getString();
        test.yesNo();
        test.getInt(1,100);
        test.getInt();
        test.getDouble(1.1, 100.1);
        test.getDouble();
    }
}
