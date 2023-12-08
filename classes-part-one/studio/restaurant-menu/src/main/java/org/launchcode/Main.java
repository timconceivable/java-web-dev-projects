package org.launchcode;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        Menu tonysMenu = new Menu("Tony's Place", currentDate, items);

        MenuItem pizza = new MenuItem("NY Style Pizza", "Main Course", 21.99, "It's pizza! Everyone loves pizza. Made from scratch and hand-tossed crust covered with a generous amount of tomato sauce and mozzarella. - add $2 for each additional topping.", false);
        MenuItem pasta = new MenuItem("It's a pasta!", "Main Course", 13.99, "Made from scratch pasta topped with your choice of protein, veggies, and sauce.", false);
        MenuItem salad = new MenuItem("House Salad", "Appetizer", 6.99, "Fresh chopped romain lettuce tossed with sliced tomatoes, red onions, black olives, parmesan cheese, and homemade italian dressing.", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Dessert", 8.99, "A delicious slice of Tiramisu made from scratch with locally roasted coffee.", true);
        items.add(pizza);
        items.add(pasta);
        items.add(salad);
        items.add(tiramisu);

        tonysMenu.printMenu();
    }
}