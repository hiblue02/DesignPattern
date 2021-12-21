package javatest.designPattern.template;

public class CoffeeRecipe extends BeverageRecipe{
    @Override
    public void getIngredient() {
        System.out.println("커피가루를 준비한다.");
    }

    @Override
    public void brew() {
        System.out.println("커피를 내린다.");
    }
}
