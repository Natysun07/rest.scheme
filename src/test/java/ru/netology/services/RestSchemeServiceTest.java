package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RestSchemeServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/rest.csv")


    public void test(int expected, int income, int expenses, int threshold) {
        RestSchemeService service = new RestSchemeService();

        int actual = service.calcRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

