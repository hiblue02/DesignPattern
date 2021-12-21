package javatest.designPattern.template;

public class Main {
    public static void main(String[] args) {

        PrintRecipe coffeeRecipe = new PrintRecipe(new CoffeeRecipe());
        coffeeRecipe.print();

        System.out.println();

        PrintRecipe teaRecipe = new PrintRecipe(new TeaRecipe());
        teaRecipe.print();
    }
}
