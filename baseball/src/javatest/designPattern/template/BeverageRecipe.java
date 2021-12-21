package javatest.designPattern.template;

public abstract class BeverageRecipe {

    public abstract void getIngredient();
    public void boilingWater(){
        System.out.println("물을 끓인다.");
    };
    public abstract void brew();
    public void pourIntoACup(){
        System.out.println("컵에 따른다.");
    }
}
