package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSound(){
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}