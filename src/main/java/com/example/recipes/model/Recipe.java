package com.example.recipes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a single Recipe.
 */
public class Recipe {
    private String name;
    private String shortDescription;
    private String longDescription;
    private IngredientsList ingredients = new IngredientsList();
    private ArrayList instructions = new ArrayList<String>();
    private Meal meal;
    private Diet diet;

    /**
     * Class constructor.
     */
    public Recipe() {}

    /**
     * Overload class constructor.
     *
     * @param name of the recipe
     * @param shortDescription of the recipe
     * @param longDescription of the recipe
     * @param ingredients of the recipe
     * @param diet choice for the recipe
     * @param meal for the recipe
     */
    public Recipe(String name, String shortDescription, String longDescription, IngredientsList ingredients, ArrayList<String> instructions, Meal meal, Diet diet) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.diet = diet;
        this.meal = meal;
    }

    // SETTER FUNCTIONS

    /**
     * Set name of the recipe.
     *
     * @param name of the recipe
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the short description of the recipe; short descriptions do not
     * exceed 120 characters.
     *
     * @param shortDescription of the recipe
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Set the long description of the recipe.
     *
     * @param longDescription of the recipe
     */
    public void setDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * Set ingredients of the recipe.
     *
     * @param ingredients of the recipe
     */
    public void setIngredients(List<String> ingredients) {
        IngredientsList list = new IngredientsList();

        for (String i : ingredients) {
            Ingredient ingredient = convertStringToIngredient(i);
            list.addIngredient(ingredient);
        }
    }

    /**
     * Convert string into Ingredient object. Each ingredient is formatted as
     * follows: QTY-MEASUREMENT-INGREDIENT
     *
     * @param str containing the ingredient
     *
     * @return new ingredient object
     */
    private Ingredient convertStringToIngredient(String str) {
        String[] ingr = str.split("-", 3);
        Ingredient newIngredient = new Ingredient(ingr[0], ingr[1], ingr[2]);

        return newIngredient;
    }

    /**
     * Set instructions of the recipe.
     *
     * @param strArr of the recipe instructions
     */
    public void setInstructions(ArrayList<String> strArr) {

        for (String s : strArr) {
            instructions.add(s);
        }
    }

    /**
     * Set meal for the recipe.
     *
     * @param meal for the recipe
     */
    public void setMeal(String meal) {

        switch (meal) {
            case "BREKFAST":
                this.meal = Meal.BREAKFAST;
                break;
            case "LUNCH":
                this.meal = Meal.LUNCH;
                break;
            case "DINNER":
                this.meal = Meal.DINNER;
                break;
            case "BRUNCH":
                this.meal = Meal.BRUNCH;
                break;
            case "DESSERT":
                this.meal = Meal.DESSERT;
                break;
            default:
                break;

        }
    }

    /**
     * Set diet for the recipe.
     *
     * @param diet for the recipe
     */
    public void setDiet(String diet) {

        switch (diet) {
            case "MEAT":
                this.diet = Diet.MEAT;
                break;
            case "SEAFOOD":
                this.diet = Diet.SEAFOOD;
                break;
            case "VEGETARIAN":
                this.diet = Diet.VEGETARIAN;
                break;
            case "VEGAN":
                this.diet = Diet.VEGAN;
                break;
            default:
                break;

        }
    }

    // GETTER FUNCTIONS

    /**
     * Get name of the recipe.
     *
     * @return name of the recipe
     */
    public String getName() {
        return name;
    }

    /**
     * Get the short description of the recipe.
     *
     * @return the short description of the recipe
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Get the long description of the recipe.
     *
     * @return the long description of the recipe
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Get ingredients of the recipe.
     *
     * @return list of ingredients of the recipe
     */
    public IngredientsList getIngredients() {
        return ingredients;
    }

    /**
     * Get instructions of the recipe.
     *
     * @return instructions of the recipe
     */
    public ArrayList<String> getInstructions() {
        return instructions;
    }

    /**
     * Get meal for the recipe.
     *
     * @return meal for the recipe
     */
    public Meal getMeal() {
        return meal;
    }

    /**
     * Get diet for the recipe.
     *
     * @return diet for the recipe
     */
    public Diet getDiet() {
        return diet;
    }
}
