package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class LionTestGetKittensAndGetEat {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    Feline feline = Mockito.mock(Feline.class);
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
    }

}