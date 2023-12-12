import com.example.actions.MyClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {

    @Test
    public void testAddition() {
        MyClass myClass = new MyClass();
        assertEquals(4, myClass.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        MyClass myClass = new MyClass();
        assertEquals(2, myClass.subtract(4, 2));
    }

    @Test
    public void testMultiplication() {
        MyClass myClass = new MyClass();
        assertEquals(8, myClass.multiply(4, 2));
    }
}