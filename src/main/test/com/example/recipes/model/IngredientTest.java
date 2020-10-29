package com.example.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Ingredient class.
 */
public class IngredientTest {
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        ingredient1 = new Ingredient();
        ingredient2 = new Ingredient("1", "Cup", "rice");
        ingredient3 = new Ingredient("4", "eggs");
    }

    /**
     * Test class constructors.
     */
    @Test
    public void testClassConstructor() {
        assertNotNull(ingredient1);
        assertNotNull(ingredient2);
    }

    /**
     * Test class methods.
     */
    @Test
    public void testClassMethods() {
        assertNull(ingredient1.getName());
        ingredient1.setName("chicken");
        ingredient1.setMeasuring("Pound");
        ingredient1.setQuantity("1");
        assertEquals("chicken", ingredient1.getName());
        assertEquals("1 lb chicken", ingredient1.toString());
        assertEquals("rice", ingredient2.getName());
        assertNotNull(ingredient2.getName());
        assertEquals("cup", ingredient2.getMeasuringToString());
        assertEquals(MeasuringType.CUP, ingredient2.getMeasuring());
        assertEquals("4", ingredient3.getQuantity());
        assertEquals("4 eggs", ingredient3.toString());
    }
}