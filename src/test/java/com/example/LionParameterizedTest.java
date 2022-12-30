package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedResult;
    @Mock
    Feline feline;

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters(name="Sex: {0}, hasMane: {1}")
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false },
        };
    }
    @Test
    public void lionDoesHaveManeExpectedReturnMane()throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedResult, lion.doesHaveMane());
    }
}
