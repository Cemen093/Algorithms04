package Algorithms03.Score.Basket;

import Algorithms03.Score.Product.Product;
import java.util.ArrayList;


public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product a){
        products.add(a);
    }

    public String check(){
        int len = 20;
        int col = 2;
        String separator = "+";
        for (int i = 0; i < len; i++) {
            separator += "-";
        }
        separator += "+";
        for (int i = 0; i < col - 1; i++) {
            separator += separator;
        }
        separator += "\n";

        int sum = 0;
        String tmp = String.format("%s|%20s|%20s|\n%s", separator, "Название товара", "Цена", separator);
        for (int i = 0; i < products.size(); i++) {
            tmp += String.format("|%20s|%20s|\n%s", products.get(i).getName(), products.get(i).getCost(), separator);
            sum += products.get(i).getCost();
        }
        tmp += String.format("|%20s|%20s|\n%s", "Итого", sum, separator);
        return tmp;
    }

}