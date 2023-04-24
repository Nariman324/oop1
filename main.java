import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        ChocolateBar chocolateBar1 = new ChocolateBar("Mars", "Snickers", 2, 250);
        products.add(chocolateBar1);

        ChocolateBar chocolateBar2 = new ChocolateBar("Mars", "Twix", 3, 350);
        products.add(chocolateBar2);

        ChocolateBar chocolateBar3 = new ChocolateBar("Mars", "Bounty", 4, 150);
        products.add(chocolateBar3);

        ChocolateBar chocolateBar4 = new ChocolateBar("Бабаевский", "Горький", 3, 50);
        products.add(chocolateBar4);

        ChocolateBar chocolateBar5 = new ChocolateBar("Verhoff", "С пармезаном", 5, 250);
        products.add(chocolateBar5);

        VendingMachine machine = new VendingMachine(products);

       ChocolateBar chocolateBarResult =  machine.getChocolateBar("С пармезаном",5);
        if (chocolateBarResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateBarResult.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }
}

