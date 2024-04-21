package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    LionAlex alex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alex = new LionAlex(feline);
    }

    @Test
    public void getKittens() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriends() {
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}