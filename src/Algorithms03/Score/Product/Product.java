package Algorithms03.Score.Product;

public class Product {
    private String name;
    private int numbers;
    private int cost;

    public Product(String name, int numbers, int cost) {
        this.name = name;
        this.numbers = numbers;
        this.cost = cost;
    }

    public void add(int numbers){
        this.numbers += numbers;
    }

    public boolean take(){
        if (numbers > 0){
            numbers--;
            return true;
        }
        else {
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public int getCost() {
        return cost;
    }
}
