package Algorithms03.Score;

import Algorithms03.Score.Basket.Basket;
import Algorithms03.Score.Product.Product;

import java.util.ArrayList;

public class Score {
    ArrayList<Product> products = new ArrayList<>();
    //prosucts - заполняем редко (по идее), работаем много.
    //Массив ок (ну или аррей лист на массиве, от части устранит проблему расширения).
    Basket basket = new Basket();

    public void addProduct(Product a){
        products.add(a);
    }
    public boolean searchAndAddToBasket(String name){
        //Для пошуку товарів у каталозі використовуйте метод contains колекції.
        //вот тут не понял, контаинтс ищет обект, но у меня поле обекта а не он сам, к томуже я не знаю остальных его полей.
        //это вообще обезательно?
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
    }

    public void check(){
        System.out.println(basket.toString());
    }

    public void status(){

    }
}
