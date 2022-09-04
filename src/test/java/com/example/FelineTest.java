package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    @Test
    public void eatMeatAnimalKindPredatorShowFood() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyCatShowFamily() {
        Feline feline = new Feline();
        feline.getFamily();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensShowCountKittens() {
        Feline feline = new Feline();
        feline.getKittens(10);

        Assert.assertEquals(10, feline.getKittens(10));
    }

    @Test
    public void getKittensShowOneKitten() {
        Feline feline = new Feline();
        feline.getKittens();

        Assert.assertEquals(1, feline.getKittens());
    }
}
