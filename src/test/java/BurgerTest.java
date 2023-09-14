import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredientSauce;

    @Mock
    private Ingredient ingredientFilling;

    public BurgerTest() {

    }

    @Test
    public void getReceiptTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientSauce);
        burger.addIngredient(ingredientFilling);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(ingredientSauce.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(ingredientSauce.getName()).thenReturn("hot sauce");
        Mockito.when(ingredientFilling.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredientFilling.getName()).thenReturn("cutlet");
        Mockito.when(bun.getPrice()).thenReturn(100f);
        Mockito.when(ingredientSauce.getPrice()).thenReturn(100f);
        Mockito.when(ingredientFilling.getPrice()).thenReturn(100f);
        String expectedResult = "(==== black bun ====)\r\n" + "= sauce hot sauce =\r\n" + "= filling cutlet =\r\n" + "(==== black bun ====)\r\n" + "\r\n" + "Price: 400,000000\r\n";
        System.out.println(expectedResult);
        System.out.println(burger.getReceipt());
        assertEquals(expectedResult, burger.getReceipt());
    }
}
