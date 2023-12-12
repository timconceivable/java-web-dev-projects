package org.launchcode;

enum Category {
    APPETIZER, ENTREE, DESSERT;
    @Override public String toString() {
        return switch (this) {
            case APPETIZER -> "Appetizer";
            case ENTREE -> "Entree";
            case DESSERT -> "Dessert";
            default -> null;
        };
    }
}

public class MenuItem {
    private String name;
    private Category category;
    private double price;
    private String description;
    private boolean isNew;

    public MenuItem(String name, double price, String description, Category category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void printItem() {
        System.out.printf( "%s%s - $%.2f \n%s (%s) \n",
            this.isNew ? "NEW! " : "", this.name, this.price,
            this.description, this.category );
    }

    public boolean equals(Object toBeCompared) {
        MenuItem theItem = (MenuItem) toBeCompared;
        return theItem.getName() == getName();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Category getCategory() {
        return category;
    }
    public void setPrice(double price) { this.price = price; }
    public double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public boolean getIsNew() {
        return isNew;
    }
}