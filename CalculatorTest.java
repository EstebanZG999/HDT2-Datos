import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator c = new Calculator();
        assertEquals(5,c.suma(2, 3));

    }
    @Test
    public void test2(){
        Calculator c = new Calculator();
        assertEquals(1,c.resta(3, 2));
    }
    @Test
    public void test3(){
        Calculator c = new Calculator();
        assertEquals(6,c.multiplicacion(3, 2));
    }
    @Test
    public void test4(){
        Calculator c = new Calculator();
        assertEquals(3,c.division(6, 2));
    }
}