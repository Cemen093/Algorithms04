package Algorithms04;

import Algorithms04.Score.Product.Product;
import Algorithms04.Score.Score;

import java.util.Scanner;

public class Algorithms04 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Score score = new Score();

        score.addProduct(new Product("колбаса", 3, 100));
        score.addProduct(new Product("молоко", 1, 20));
        score.addProduct(new Product("сыр", 5, 500));

        String key = "";
        do {
            System.out.print("" +
                    "поиск товара и добавление в корзину (поиск)\n" +
                    "распечатать чек (чек)\n" +
                    " >>  ");
            key = scaner.nextLine();

            switch (key) {
                case "поиск":
                    //поиск товара и добавление в корзину
                    System.out.println("Введите имя товара\n >>  ");
                    if (score.searchAndAddToBasket(scaner.nextLine())){
                        System.out.println("Товар добавлен в корзину");
                    }
                    else {
                        System.out.println("Товар не найден или отсутствует на складе");
                    }
                    break;
                case "чек":
                    //распечатать чек
                    score.printCheck();
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }

        }while (!key.equals("чек"));
    }
}
