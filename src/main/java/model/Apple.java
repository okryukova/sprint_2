package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    protected String color;

    public Apple (int amount, double price, String color) {
        super (amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (color.equals(Colour.COLOUR_RED))
            return Discount.DISCOUNT_60;
        else
            return Discount.DISCOUNT_0;
    }
}
