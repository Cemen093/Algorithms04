package Algorithms04.Score.Product;

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

    //к кастомному варианту поиска и добавления
    public Product take(){
        numbers--;
        return this;
    }

    //к кастомному варианту поиска и добавления
    public boolean check(){
        if (numbers > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void dec(){
        numbers--;
    }

    public String getName(){
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return (name.equals(((Product) o).name) && ((Product) o).numbers > 0);
    }
}
