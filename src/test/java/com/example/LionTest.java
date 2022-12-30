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
public class LionTest extends TestCase {

    @Mock
    Feline feline;
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void lionGetKittensExpectedReturnKittensCount()throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(1,lion.getKittens());
    }
    @Test
    public void lionGetFoodExpectedReturnListOfFood()throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец",feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

}