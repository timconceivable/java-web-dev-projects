package org.launchcode;

enum Category {
    APPETIZER("Appetizer"),
    ENTREE("Entree"),
    DESSERT("Dessert");

    private final String name;

    Category(String name) {
        this.name = name;
    }
    @Override public String toString() {
        return name;
    }
}