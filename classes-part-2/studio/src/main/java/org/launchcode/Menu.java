package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Scanner;
//import java.lang.reflect.Field;

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
        System.out.printf("%s\n[menu updated: %s]\n\n", this.title, this.lastUpdated);
        for (MenuItem item : itemList) {
            item.printItem();
            System.out.printf("\n");
        }
    }

// ADD ITEM BY USER INPUT (TO TRY LATER)
//    public void addItem() {
//        MenuItem thisItem = itemList.add(new MenuItem("","",0.0,"",true) );
//        Field[] fields = thisItem.getClass().getDeclaredFields();
//        Scanner input = new Scanner(System.in);
//        for (Field f : fields ) {
//            f = input.nextLine();
//        }
//    }

    public void addItem(MenuItem anItem) {
        boolean duplicateItem = false;
        for (MenuItem item : itemList) {
            if (item.equals(anItem)) {
                System.out.println("____________________\n" +
                    ">>> ERROR! AN ITEM WITH THAT NAME ALREADY EXISTS ON THE MENU... \n____________________\nEXISTING ITEM: ");
                item.printItem();
                System.out.println("____________________\nNEW ITEM: ");
                anItem.printItem();
                System.out.println("____________________\nWould you like to overwrite? (Y/N) \nN\n");
                duplicateItem = true;
                break;
            }
        }
        if (!duplicateItem) {
            itemList.add(anItem);
        }
    }

    public void removeItem(MenuItem anItem) {
        itemList.remove(anItem);
    }

    public ArrayList<MenuItem> sortMenu() {
    Collections.sort(itemList, Comparator.comparing(MenuItem::getCategory).thenComparing(MenuItem::getName) );
      return itemList;
    }

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
