package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    
    @Test
    void isLeapYear(){
        
        assertTrue(LeapYear.isLeapYear(2000),"\"2000\" should be true");

        assertFalse(LeapYear.isLeapYear(1900), "\"1900\" should be false");

        assertTrue(LeapYear.isLeapYear(2024),"\"2024\" should be true");

        assertThrows(IllegalArgumentException.class,() ->LeapYear.isLeapYear(-1900), "\"-1900\" should be false");
    }

}
