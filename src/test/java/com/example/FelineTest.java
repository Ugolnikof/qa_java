package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private static final List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");

    @Spy
    private Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        verify(feline).eatMeat();
        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        assertEquals(10, feline.getKittens(10));
    }
}