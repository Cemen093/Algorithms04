package Algorithms03.Score.Basket;

import Algorithms03.Score.Product.Product;
import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();
    //products из Basket заполнекм много, работаем очень мало, расширения (основная работа колекции).
    //ссылочный лист ок (дек, очередь, список), выбор колекции не имеет большого значения.
    //но работать с ArrayList было привычнее (toString), а эфективность программы не было частью задания 8).

    public void addProduct(Product a){
        products.add(a);
    }

    @Override
    public String toString(){
        int len = 20;
        int col = 2;
        String separator = "+";
        for (int i = 0; i < len; i++) {
            separator += "-";
        }
        separator += "+";
        for (int i = 0; i < col - 1; i++) {
            separator += separator.substring(1);
        }
        separator += "\n";

        int sum = 0;
        String tmp = String.format("%s|%20s|%20s|\n%s", separator, "Название товара", "Цена", separator);
        for (int i = 0; i < products.size(); i++) {
            tmp += String.format("|%20s|%20s|\n%s", products.get(i).getName(), products.get(i).getCost(), separator);
            sum += products.get(i).getCost();
        }
        tmp += String.format("|%20s|%20s|\n%s", "Итого", sum, separator);
        products = new ArrayList<>();
        return tmp;
    }

}