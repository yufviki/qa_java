package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AlexLionTest {
    @Test
    public void getKittensAlexLionZeroCount() throws Exception {
        AlexLion alexLion = new AlexLion();

        Assert.assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void getFriendsAlexLionShowList() throws Exception {
        AlexLion alexLion = new AlexLion();

        List<String> expected = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals(expected, alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingAlexLionNY() throws Exception {
        AlexLion alexLion = new AlexLion();

        String expected = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expected, alexLion.getPlaceOfLiving());
    }
}
