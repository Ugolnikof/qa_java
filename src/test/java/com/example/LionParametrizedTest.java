package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private Feline feline;
    private final boolean hasMane;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "{0} главный = {1}")
    public static Object[][] initLionData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionDoesHaveMain() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}
