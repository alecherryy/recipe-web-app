package com.example.recipes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class represents a list of ingredients. It's a list of Ingredient
 * objects.
 */
public class IngredientsList {
    private List<Ingredient> list = new ArrayList<>();

    /**
     * Class constructor
     */
    public IngredientsList() {};

    /**
     * Add an ingredient to the list.
     *
     * @param ingredient to be added
     */
    public void addIngredient(Ingredient ingredient) {
        list.add(ingredient);
    }

    /**
     * Remove an ingredient from the list.
     *
     * @return the list of ingredients
     */
    public List<Ingredient> getIngredientList() {
        return list;
    }

    /**
     * Return array of ingredients strings.
     *
     * @return the list of ingredients
     */
    public List<String> getListOfString() {
        List<String> arr = list.stream().map(item -> item.toString()).collect(Collectors.toList());

        return arr;
    }
}
