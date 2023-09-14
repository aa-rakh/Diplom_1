import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;

public class IngredientTest {
    @Test
    public void getPriceTest(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
        assertEquals(200, ingredient.getPrice(), 0.0f);
    }

    @Test
    public void getNameTest(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "chili sauce", 300);
        assertEquals("chili sauce", ingredient.getName());
    }

    @Test
    public void getTypeTest(){
        Ingredient ingredient = new Ingredient(FILLING, "dinosaur", 200);
        assertEquals(FILLING, ingredient.getType());
    }

}
