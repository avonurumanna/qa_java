package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {

    @Mock
    Feline feline;
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void catGetSoundExpectedReturnSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void catGetFoodExpectedReturnListOfFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}