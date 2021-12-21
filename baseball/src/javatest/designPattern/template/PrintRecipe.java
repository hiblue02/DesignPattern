package javatest.designPattern.template;

public class PrintRecipe {
    BeverageRecipe recipe;

    public PrintRecipe(BeverageRecipe recipe) {
        this.recipe = recipe;
    }

    public void print(){
        recipe.getIngredient();
        recipe.boilingWater();
        recipe.brew();
        recipe.pourIntoACup();
    }
}
