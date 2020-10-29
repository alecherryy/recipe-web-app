package com.example.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the IngredientsList class.
 */
public class IngredientListTest {
    private IngredientsList list1;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        list1 = new IngredientsList();
        ingredient1 = new Ingredient("1/2", "Pound", "chicken");
        ingredient2 = new Ingredient("1", "Cup", "rice");
        ingredient3 = new Ingredient("4", "eggs");
    }

    /**
     * Test class constructors.
     */
    @Test
    public void testClassConstructor() {
        assertNotNull(list1);
    }

    /**
     * Test class methods.
     */
    @Test
    public void testClassMethods() {
        assertEquals(0, list1.getIngredientList().size());
        list1.addIngredient(ingredient1);
        assertEquals(1, list1.getIngredientList().size());
        list1.addIngredient(ingredient2);
        list1.addIngredient(ingredient3);
        assertEquals(3, list1.getIngredientList().size());
        assertEquals("1/2 lb chicken", list1.getIngredientList().get(0).toString());
        assertEquals("4 eggs", list1.getIngredientList().get(2).toString());
        assertEquals("[1/2 lb chicken, 1 cup rice, 4 eggs]",
                list1.convertListToStringList().toString());
    }
}