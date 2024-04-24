package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    private static final String FAMILY = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    private static final String EXCEPTION_TEXT = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

    Animal animal = new Animal();

    @Test
    public void getFamily() {
        assertEquals(FAMILY, animal.getFamily());
    }

    @Test
    public void wrongTypeOfAnimal() {
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
        assertEquals(EXCEPTION_TEXT, exception.getMessage());
    }

}