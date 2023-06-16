package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTestHaveManeParameterized {
    private final String sex;
    private final boolean expected;

    public LionTestHaveManeParameterized(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][] {
                {"Самец", true,},
                 {"Самка", false},
                {"Тест", false},
         };
    }
    @Test
    public void testDoesHaveMane() {
        try {
            Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
        }catch (Exception exception){}

    }

}