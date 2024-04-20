package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void doesHaveMane() {
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void wrongSexSetUp() {
        assertThrows(Exception.class, () -> new Lion("Самса", feline));
    }
}