package pro.sky.skyprospringbootcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalkulatorServiceImplParamTest {
    private final CalkulatorService calkulatorService = new CalkulatorService();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(3, 2, TestUtils.stringResult(3, 2, "5", "+")),
                Arguments.of(1, 4, TestUtils.stringResult(1, 4, "5", "+"))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String expectedResult) {
        String actualResult = calkulatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(3, 2, TestUtils.stringResult(3, 2, "1", "-")),
                Arguments.of(1, 4, TestUtils.stringResult(1, 4, "-3", "-"))
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String expectedResult) {
        String actualResult = calkulatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(3, 2, TestUtils.stringResult(3, 2, "6", "*")),
                Arguments.of(1, 4, TestUtils.stringResult(1, 4, "4", "*"))
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String expectedResult) {
        String actualResult = calkulatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(3, 2, TestUtils.stringResultDouble(3, 2, "1.5", "/")),
                Arguments.of(1, 4, TestUtils.stringResultDouble(1, 4, "0.25", "/"))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String expectedResult) {
        String actualResult = calkulatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}