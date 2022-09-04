package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void getFamilyAnimalList() throws Exception {
        Animal animal = new Animal();

        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, animal.getFamily());
    }
}
