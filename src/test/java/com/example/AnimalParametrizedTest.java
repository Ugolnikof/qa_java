package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private static final List<String> HERBIVORE_FOOD = List.of("Трава", "Различные растения");
    private static final List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");

    private final String animalKind;
    private final List<String> foods;

    public AnimalParametrizedTest(String animalKind, List<String> foods) {
        this.animalKind = animalKind;
        this.foods = foods;
    }

    @Parameterized.Parameters
    public static Object[][] initAnimalData() {
        return new Object[][] {
                {"Травоядное", HERBIVORE_FOOD},
                {"Хищник", PREDATOR_FOOD},
        };
    }

    @Test
    public void animalGetFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(foods, animal.getFood(animalKind));
    }

}
