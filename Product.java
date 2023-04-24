
public class Product{
    
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){

        if (price <= 0)
            this.price = 1;
        else
            this.price = price;
    }

    public String getName(){
    
        return name;
    }

    public void setName(String name) {

        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;
    }

    public Product(String brand, String name, double price){

        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;

        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;

        if (price <= 0)
            this.price = 1;
        else
            this.price = price;
    }

    String displayInfo(){
        return String.format("Брэнд: %s -  Название: %s - Цена: %f", brand, name, price);
    }
}
