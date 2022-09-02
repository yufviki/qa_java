package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensShowOneLion(){
        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);

        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodAnimalKindPredatorShowFood() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, lion.getFood());
    }
}
