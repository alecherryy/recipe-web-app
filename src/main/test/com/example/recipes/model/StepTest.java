package com.example.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class StepTest {
    private Step step1;
    private Step step2;

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        step1 = new Step();
        step2 = new Step("Lorem ipsum dolor sit amet, est " +
                "reprimique necessitatibus ei, duo cu epicuri intellegebat. " +
                "Laudem democritum ius te.");
    }

    /**
     * Test class constructors.
     */
    @Test
    public void testClassConstructor() {
        assertNotNull(step1);
        assertNotNull(step2);
    }

    /**
     * Test class methods.
     */
    @Test
    public void testClassMethods() {
        step1.setContent("Hello");
        assertNotNull(step1.getContent());
        assertEquals("Lorem ipsum dolor sit amet, est " +
                "reprimique necessitatibus ei, duo cu epicuri intellegebat. " +
                "Laudem democritum ius te.", step2.getContent());
        step1.setContent("");
        assertEquals("", step1.getContent());
    }
}