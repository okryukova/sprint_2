package service;
import model.Food;

public class ShoppingCart {
    protected Food [] foodArray; // final??

    public ShoppingCart (Food [] f) {
        foodArray = f;
    }
    public double totalPurchaseAmount() {
        int count = foodArray.length;
        double total=0;
       for (Food f: foodArray) // for (int i=0; i<count; i++)
            total += f.getAmount() * f.getPrice();
        return total;
    }

    public double totalPurchaseAmountWithDiscount() {
        int count = foodArray.length;
        double total=0;
        for (Food f: foodArray)
           if (f.getDiscount() > 0) {
                total += f.getAmount() * f.getPrice() * ( 100-f.getDiscount() )/ 100;
            } else {
                total += f.getAmount() * f.getPrice();
            }
        return total;
    }

    public double totalPurchaseAmountIsVegetarian() {
        int count = foodArray.length;
        double total=0;
        for (Food f: foodArray)
            if (f.isVegetarian())
                total += f.getAmount() * f.getPrice();
        return total;
    }
}
