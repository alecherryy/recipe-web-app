package com.example.recipes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class represents a list of steps. It's a list of Step
 * objects.
 */
public class StepsList {
    private List<Step> steps = new ArrayList<>();

    /**
     * Class constructor
     */
    public StepsList() {};

    /**
     * Add a step to the list.
     *
     * @param step to be added
     */
    public void addStep(Step step) {
        steps.add(step);
    }

    /**
     * Remove a step from the list.
     *
     * @return the list of steps
     */
    public List<Step> getStepsList() {
        return steps;
    }
}
