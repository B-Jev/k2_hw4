package pro.sky.skyprospringbootcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalkulatorService implements CalkulatorServiceImpl {
    public String greetingsСalkulator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return String.format("%s %s %s %s %s", num1, "+", num2, "=", num1 + num2);
    }

    public String minus(int num1, int num2) {
        return String.format("%s %s %s %s %s", num1, "-", num2, "=", num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return String.format("%s %s %s %s %s", num1, "*", num2, "=", num1 * num2);
    }

    public String divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalStateException("На ноль делить нельзя!!");
        } else {
            return String.format("%s %s %s %s %s", num1, "/", num2, "=", num1 / num2);
        }
    }
}
