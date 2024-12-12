package com.example.ProductService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTest {

    @Test
    void testAddition(){
        int i  = 1 + 1;
        assert i == 2; // It will chwck if the condition is true or not.
         // we will use two library assertJ and hamcrest dependency
        //assert i*i == 6;

        assertTrue(i == 2);
        assertEquals(i,2);

    }
}
