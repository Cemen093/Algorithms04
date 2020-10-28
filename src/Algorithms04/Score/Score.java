package Algorithms04.Score;

import Algorithms04.Score.Basket.Basket;
import Algorithms04.Score.Product.Product;

import java.util.ArrayList;

public class Score {
    private ArrayList<Product> products = new ArrayList<>();
    //prosucts - заполняем редко (по идее), работаем много.
    //Массив ок (ну или аррей лист на массиве, от части устранит проблему расширения).
    private Basket basket = new Basket();

    public void addProduct(Product a){
        products.add(a);
    }

    public boolean searchAndAddToBasket(String name){
        /*
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                if (products.get(i).check()) {
                    basket.addProduct(products.get(i).take());
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
        */
        if (products.contains(new Product(name, 0,0))){
            int index = products.indexOf(new Product(name, 0,0));
            basket.addProduct(products.get(index));
            products.get(index).dec();
            return true;
        }
        return false;
    }

    public void printCheck(){
        //Гугл клянеться и божится что чек переводиться именно как scheck (даже галочка есть),
        // но я согласен с замечанием и уточнил
        System.out.println(basket.toString());
    }
}
