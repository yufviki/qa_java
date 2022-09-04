package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;

    public AnimalGetFoodTest(String animalKind){
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters(name = "animalKind: {0}")
    public static Object[][] animalKindData() {
        return new Object[][] {
                {"Травоядное"},
                {"Хищник"},
                {"Неизвестно"},
        };
    }

    @Test
    public void getFoodDependenceOnAnimalKindShowFood() throws Exception {
        try {
            Animal animal = new Animal();
            animal.getFood(animalKind);

            if ("Травоядное".equals(animalKind)) {
                List<String> expected = List.of("Трава", "Различные растения");
                Assert.assertEquals(expected, animal.getFood("Травоядное"));
            } else {
                List<String> expected = List.of("Животные", "Птицы", "Рыба");
                Assert.assertEquals(expected, animal.getFood("Хищник"));
            }
        } catch (Exception exception){
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}
