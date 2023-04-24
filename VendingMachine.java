import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public ChocolateBar getChocolateBar(String name, int price){

        for (Product product : products){
            if (product instanceof ChocolateBar){
                if (product.getName() == name && ((ChocolateBar)product).getPrice() == price){
                    return (ChocolateBar)product;
                }
            }
       }
        return null;
    }
}
