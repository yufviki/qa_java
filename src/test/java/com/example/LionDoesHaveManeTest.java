package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sex;

    public LionDoesHaveManeTest(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] sexData() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Неизвестно"},
        };
    }

    @Test
    public void doesHaveManeDependenceOnSex() throws Exception {
        try {
            Lion lion = new Lion(sex);

            if ("Самец".equals(sex)) {
                Assert.assertTrue(lion.doesHaveMane());
            } else {
                Assert.assertFalse(lion.doesHaveMane());
            }
        } catch (Exception exception){
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
