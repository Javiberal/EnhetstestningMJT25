package iths;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
    void testAddOnePLusTwoEqualsThree(){
      int actual= Calculator.add(2,3);
        assertEquals(5,actual);
    }

  @Test
    void testDivideTenPLusTwoEqualsFive(){
      double actual= Calculator.divide(10,2);
        assertEquals(5.0,actual);
    } 

}


    
