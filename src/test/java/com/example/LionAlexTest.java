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
    public static final List<String> ALEX_FRIENDS = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");

    private LionAlex alex;

    @Mock
    private Feline feline;

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
        assertEquals(ALEX_FRIENDS, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}