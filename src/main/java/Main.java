import model.Food;
import  model.Meat;
import  model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        /*Инициализируй данные. Для этого создай объекты:
        мясо в количестве 5 кг по цене 100 рублей за кг,
        яблоки красные в количестве 10 кг по цене 50 рублей,
        яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        Посчитай и выведи на экран значения для созданной корзины:
        общую сумму всех товаров,
        сумму скидки для всей корзины,
        сумму всех вегетарианских продуктов.*/

        Meat m = new Meat ( 5, 100);
        Apple ar = new Apple(10, 50, Colour.COLOUR_RED);
        Apple ag = new Apple(8, 60, Colour.COLOUR_GREEN);
        Food[] f = {m, ag, ar};

        ShoppingCart cart = new ShoppingCart(f);
        System.out.println ("Общая сумма товаров без скидки: " + cart.totalPurchaseAmount() );
        System.out.println ("Общая сумма товаров со скидкой: " +  cart.totalPurchaseAmountWithDiscount() );
        System.out.println ("Общая сумма всех вегетарианских продуктов без скидки: " + cart.totalPurchaseAmountIsVegetarian() );
    }
}
