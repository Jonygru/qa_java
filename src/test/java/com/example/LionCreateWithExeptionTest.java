package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionCreateWithExeptionTest {
    @Mock
    Feline feline = new Feline();
    @Test
    public void testCreateWithExeption() throws Exception {
        String sex = "Тест";
        boolean expected = false;
        try {
            Lion lion = new Lion(sex, feline);
        }catch(Exception exception) {expected = true;}

        assertEquals(true, expected);
    }
}