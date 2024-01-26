package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;
import static org.launchcode.Category.*;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        ArrayList<MenuItem> items = new ArrayList<>();

        Menu tonysMenu = new Menu("Tony's Place", currentDate, items);
        MenuItem pizza = new MenuItem("NY Style Pizza", 21.99, "It's pizza! Everyone loves pizza. Made from scratch and hand-tossed crust covered with a generous amount of tomato sauce and mozzarella. - add $2 for each additional topping.", ENTREE, false);
        tonysMenu.addItem(pizza); // items.add(pizza);

        MenuItem pasta = new MenuItem("It's a Pasta!",13.99, "Made from scratch pasta topped with your choice of protein, veggies, and sauce.", ENTREE, false);
        tonysMenu.addItem(pasta); // items.add(pasta);

        MenuItem salad = new MenuItem("House Salad",6.99, "Fresh chopped romain lettuce tossed with sliced tomatoes, red onions, black olives, parmesan cheese, and homemade italian dressing.", APPETIZER,false);
        tonysMenu.addItem(salad); // items.add(salad);

        MenuItem tiramisu = new MenuItem("Tiramisu",8.99, "A delicious slice of Tiramisu made from scratch with locally roasted coffee.", DESSERT,true);
        tonysMenu.addItem(tiramisu); // items.add(tiramisu);

//        tonysMenu.printMenu();

        MenuItem bread = new MenuItem("Bread", 2, "It's bread. Comes with butter on the side.", APPETIZER, false);
        tonysMenu.addItem(bread);

        MenuItem nyPizza = new MenuItem("NY Style Pizza",50, "This is a different pizza, but it has the same name.", ENTREE, true);
        tonysMenu.addItem(nyPizza);

        tonysMenu.sortMenu();
        tonysMenu.printMenu();

        tonysMenu.removeItem(tiramisu);
        tonysMenu.printMenu();
    }
}