package com.example.recipes.model;

/**
 * This class represents a single Step for a recipe.
 */
public class Step {
    private String content;

    /**
     * Class constructor.
     */
    public Step() {};

    /**
     * Overload class constructor with parameters.
     *
     * @param content amount of the ingredient
     */
    public Step(String content) {
        this.content = content;
    }

    // GETTER FUNCTIONS

    /**
     * Get content of the recipe step.
     *
     * @return content of the step
     */
    public String getContent() {
        return content;
    }

    // SETTER FUNCTIONS

    /**
     * Get content of the recipe step.
     *
     * @param content of the step
     */
    public void setContent(String content) {
        this.content = content;
    }
}
