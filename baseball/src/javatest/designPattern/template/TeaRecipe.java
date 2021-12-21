package javatest.designPattern.template;

public class TeaRecipe extends BeverageRecipe{
    @Override
    public void getIngredient() {
        System.out.println("차(티백)을 준비하다.");
    }

    @Override
    public void brew() {
        System.out.println("차(티백)을 우린다.");
    }
}
