package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private String title;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> itemList;

    public Menu(String title, LocalDate lastUpdated, ArrayList<MenuItem> itemList) {
        this.title = title;
        this.lastUpdated = lastUpdated;
        this.itemList = itemList;
    }

    public void printMenu() {
        System.out.println(String.format("%s \nmenu updated: %s \n", this.title, this.lastUpdated));
        for (MenuItem item : itemList) {
            item.printItem();
        }
    }

//    public ArrayList<MenuItem> sortMenu() {
//      return sortedItemList
//    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }
    public void setItemList(ArrayList<MenuItem> itemList) {
        this.itemList = itemList;
    }
}
