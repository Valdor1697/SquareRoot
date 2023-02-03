package ru.netology.sqr.sqrcalc.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrcalc.csv")

    public void SqrNumbersWithinRange(int expected, int a, int b) {
        SQRService service = new SQRService();

        int actual = service.calcSqrRoot( a, b);

        Assertions.assertEquals(expected, actual);
    }
}