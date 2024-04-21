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

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        verify(feline).eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
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