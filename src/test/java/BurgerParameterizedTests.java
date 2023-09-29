import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class BurgerParameterizedTests {

    private final IngredientType type;
    private final String name;
    private final Float price;
    private final Burger burger = new Burger();

    public BurgerParameterizedTests(IngredientType type, String name, float price){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    @Parameterized.Parameters
    public static Object[][] testDataGenerate() {
        return new Object[][]{
                    {IngredientType.SAUCE, "hot sauce", 100},
                    {IngredientType.SAUCE, "sour cream", 200},
                    {IngredientType.SAUCE, "chili sauce", 300},
                    {IngredientType.FILLING, "cutlet", 100},
                    {IngredientType.FILLING, "dinosaur", 200},
                    {IngredientType.FILLING, "sausage", 300},
        };
    }
    @Test
    public void addIngredientsTest(){
        burger.addIngredient(new Ingredient(type, name, price));
        Assert.assertEquals("Не удалось добавить ингредиент!", 1, burger.ingredients.size());
    }

    @Test
    public void removeIngredientTest(){
        burger.addIngredient(new Ingredient(type, name, price));
        burger.removeIngredient(0);
        Assert.assertEquals("Не удалось удалить ингредиент!", 0, burger.ingredients.size());
    }

    @Test
    public void moveIngredientTest(){
        burger.addIngredient(new Ingredient(type, name, price));
        burger.addIngredient(new Ingredient(type, name, price));
        burger.moveIngredient(0,1);
        Assert.assertNotNull("Не удалось заменить ингредиент!",burger.ingredients.get(0).toString());
    }

}
