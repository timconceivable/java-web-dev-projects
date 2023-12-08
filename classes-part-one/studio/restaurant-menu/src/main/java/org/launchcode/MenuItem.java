package org.launchcode;

public class MenuItem {
    private String name;
    private String category;
    private Double price;
    private String description;
    private Boolean newItem;

    public MenuItem(String name, String category, Double price, String description, Boolean newItem) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.newItem = newItem;
    }

    public void printItem() {
        System.out.println( String.format("%s%s - $%s \n%s (%s) \n",
                this.newItem ? "NEW! " : "", this.name, this.price,
                this.description, this.category) );
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
    public Boolean getNewItem() {
        return newItem;
    }
}
