package com.example.recipes.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Recipe class.
 */
public class RecipeTest {
    private Recipe recipe1;
    private Recipe recipe2;

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        recipe1 = new Recipe();
        ArrayList list = new ArrayList<String>();
        list.add("Step 1");
        list.add("Step 2");
        recipe2 = new Recipe("Scrambled Eggs", "Breakfast eggs",
                "A quick recipe for breakfast eggs",
                new IngredientsList(), list, Meal.BREAKFAST, Diet.VEGETARIAN);
    }

    /**
     * Test class constructors.
     */
    @Test
    public void testClassConstructor() {
        assertNotNull(recipe1);
        assertNotNull(recipe2);
    }

    /**
     * Test class methods.
     */
    @Test
    public void testClassMethods() {
        recipe1.setName("Scones");
        assertEquals("Scones", recipe1.getName());
        recipe1.setShortDescription("Some scones");
        assertEquals("Some scones", recipe1.getShortDescription());
        recipe1.setDiet("VEGETARIAN");
        assertEquals(Diet.VEGETARIAN, recipe1.getDiet());
        recipe1.setMeal("DESSERT");
        assertEquals(Meal.DESSERT, recipe1.getMeal());
        ArrayList list = new ArrayList<String>();
        list.add("Step 1");
        list.add("Step 2");
        recipe1.setInstructions(list);
        assertNotNull(recipe1.getShortDescription());
        assertEquals("Step 1", recipe1.getInstructions().get(0));
        assertEquals("Scrambled Eggs", recipe2.getName());
        assertEquals("Breakfast eggs", recipe2.getShortDescription());
        assertEquals("A quick recipe for breakfast eggs", recipe2.getLongDescription());
        assertEquals(Meal.BREAKFAST, recipe2.getMeal());
        assertEquals(Diet.VEGETARIAN, recipe2.getDiet());
        assertEquals("Step 1", recipe2.getInstructions().get(0));
        assertEquals("Step 2", recipe2.getInstructions().get(1));
        assertNotNull(recipe2.getIngredients());
    }
}