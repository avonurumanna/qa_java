package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittensCount;
    private final int expectedResult;

    public FelineParameterizedTest(int kittensCount, int expectedResult) {
        this.kittensCount = kittensCount;
        this.expectedResult= expectedResult;
    }

    @Parameterized.Parameters(name="input: {0}, expected result: {1}")
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { 0, 0 },
                { 1, 1 },
                { 2, 2 }
        };
    }
    @Test
    public void felineGetKittensExpectedReturnKittensCount() {
        Feline feline = new Feline();
        assertEquals(expectedResult, feline.getKittens(kittensCount));
    }



}
