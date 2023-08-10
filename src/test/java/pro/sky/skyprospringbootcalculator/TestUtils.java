package pro.sky.skyprospringbootcalculator;

public class TestUtils {
    public static String stringResult(int num1, int num2, String result, String action) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }public static String stringResultDouble(double num1, double num2, String result, String action) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }
}
