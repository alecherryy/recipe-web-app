package com.example.recipes.model;

/**
 * This class represents a single Ingredient.
 */
public class Ingredient {
    private String qty;
    private Measuring meas;
    private String name;

    /**
     * Class constructor.
     */
    public Ingredient() {}

    /**
     * Overload class constructor with parameters.
     *
     * @param qty amount of the ingredient
     * @param meas measuring of the ingredient
     * @param name of the ingredient
     */
    public Ingredient(String qty, String meas, String name) {
        Measuring meauring = convertMeasurement(meas);

        this.qty = qty;
        this.meas = meauring;
        this.name = name;
    }

    /**
     * Overload class constructor with parameters.
     *
     * @param qty amount of the ingredient
     * @param name of the ingredient
     */
    public Ingredient(String qty, String name) {
        this.qty = qty;
        this.name = name;
    }

    /**
     * Private method to convert str parameter to enum.
     *
     * @param meas measuring name
     * @return measuring enum value
     */
    private Measuring convertMeasurement(String meas) {
        Measuring name;

        switch (meas) {
            case "Cup":
                name = Measuring.CUP;
                break;
            case "Tablespoon":
                name = Measuring.TBSP;
                break;
            case "Teaspoon":
                name = Measuring.TSP;
                break;
            case "Ounce":
                name = Measuring.OZ;
                break;
            case "Pint":
                name = Measuring.PT;
                break;
            case "Gallon":
                name = Measuring.GAL;
                break;
            case "Pound":
                name = Measuring.LB;
                break;
            default:
                name = Measuring.OTHER;
                break;
        }

        return name;
    }

    // GETTER FUNCTIONS

    /**
     * Get name of the ingredient.
     *
     * @return name of the ingredient
     */
    public String getName() {
        return name;
    }

    /**
     * Get measuring of the ingredient.
     *
     * @return measuring of the ingredient
     */
    public Measuring getMeasuring() {
        return meas;
    }

    /**
     * Get measuring of the ingredient.
     *
     * @return measuring of the ingredient
     */
    public String getMeasuringToString() {
        return meas.name().toLowerCase();
    }

    /**
     * Get quantity of the ingredient.
     *
     * @return quantity of the ingredient
     */
    public String getQuantity() {
        return qty;
    }

    // SETTER FUNCTIONS

    /**
     * Set name of the ingredient.
     *
     * @param name of the ingredient
     */
    public void setName(String name) { this.name = name; }

    /**
     * Set quantity of the ingredient
     *
     * @param qty of the ingredient
     */
    public void setQuantity(String qty) { this.qty = qty; }

    /**
     * Set measuring of the ingredient
     *
     * @param meas type of the ingredient
     */
    public void setMeasuring(String meas) {
        Measuring meauring = convertMeasurement(meas);

        this.meas = meauring;
    }

    /**
     * Return the ingredient.
     *
     * @return ingredient in a string
     */
    public String toString() {
        StringBuilder str;

        try {
            str = new StringBuilder(this.qty + " " + this.getMeasuringToString() + " " + this.name);
        }
        catch (NullPointerException n) {
            str = new StringBuilder(this.qty + " " + this.name);
        }

        return str.toString();
    }
}
