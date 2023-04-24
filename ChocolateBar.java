public class ChocolateBar extends Product {

    private int calories;
    
    public int getCalories() {
        
        return calories;
    }

    public ChocolateBar(String brand, String name, double price, int calories){

        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    String displayInfo() {
        
        return String.format("%s - %s - %f - Калории: %d", brand, name, price, calories);

    }
}