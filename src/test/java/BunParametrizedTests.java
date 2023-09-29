import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunParametrizedTests {
    private final String name;
    private final float price;

    public BunParametrizedTests(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] genData() {
        return new Object[][] {
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
        };
    }

    @Test
    public void getNameTest(){
        Bun firstBun = new Bun(name, price);
        assertEquals(name, firstBun.getName());
    }

    @Test
    public void getPriceTest(){
        Bun firstBun = new Bun(name, price);
        assertEquals(price, firstBun.getPrice(), 0.0f);
    }
}
