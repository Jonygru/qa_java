package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
     Feline feline = new Feline();
    @Test
    public void felineEatMeet() throws Exception {

        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void felineGetFamily()  {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected,actual);
    }
    @Test
    public void felineGetKittensWithNotParameter() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
    @Test
    public void felineGetKittensWithParameter()  {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(5);
        assertEquals(expected,actual);
    }

}