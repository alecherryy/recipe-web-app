package com.example.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the IngredientsList class.
 */
public class StepsListTest {
    private StepsList list1;
    private Step step1;
    private Step step2;

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        list1 = new StepsList();
        step1 = new Step("Hello");
        step2 = new Step("world");
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
        assertEquals(0, list1.getStepsList().size());
        list1.addStep(step1);
        assertEquals(1, list1.getStepsList().size());
        list1.addStep(step2);
        assertEquals("Hello", list1.getStepsList().get(0).getContent());
    }
}