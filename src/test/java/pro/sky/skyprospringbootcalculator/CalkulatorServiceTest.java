package pro.sky.skyprospringbootcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalkulatorServiceTest {
    private final CalkulatorService calkulatorService = new CalkulatorService();

    @Test
    void plusTest1() {
        int num1 = 3;
        int num2 = 2;

        String expectedResult = TestUtils.stringResult(3, 2, "5", "+");
        String actualResult = calkulatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plusTest2() {
        int num1 = 1;
        int num2 = 4;

        String expectedResult = TestUtils.stringResult(1, 4, "5", "+");
        String actualResult = calkulatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minusTest1() {
        int num1 = 3;
        int num2 = 2;

        String expectedResult = TestUtils.stringResult(3, 2, "1", "-");
        String actualResult = calkulatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minusTest2() {
        int num1 = 1;
        int num2 = 8;

        String expectedResult = TestUtils.stringResult(1, 8, "-7", "-");
        String actualResult = calkulatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiplyTest1() {
        int num1 = 1;
        int num2 = 8;

        String expectedResult = TestUtils.stringResult(1, 8, "8", "*");
        String actualResult = calkulatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiplyTest2() {
        int num1 = 8;
        int num2 = 8;

        String expectedResult = TestUtils.stringResult(8, 8, "64", "*");
        String actualResult = calkulatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideTest1() {
        double num1 = 8;
        double num2 = 8;

        String expectedResult = TestUtils.stringResultDouble(8, 8, "1.0", "/");
        String actualResult = calkulatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}