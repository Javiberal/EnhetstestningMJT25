package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    @Test
    void getGradeNinetyFive() {
        char actual = GradeCalculator.getGrade(95);
        assertEquals('A', actual, "Score 95 should return 'A'");
    }

    @Test
    void getGradeEightyFive() {
        char actual = GradeCalculator.getGrade(85);
        assertEquals('B', actual, "Score 85 should return 'B'");
    }

    @Test
    void getGradeFifty() {
        char actual = GradeCalculator.getGrade(50);
        assertEquals('F', actual, "Score 50 should return 'F'");
    }

    @Test
    void getGradeMinusFive() {
        assertThrows(IllegalArgumentException.class, 
            () -> GradeCalculator.getGrade(-5),
            "Negative score should throw IllegalArgumentException");
    }

    @Test
    void getGradeOverHundred() {
        assertThrows(IllegalArgumentException.class, 
            () -> GradeCalculator.getGrade(105),
            "Score over 100 should throw IllegalArgumentException");
    }
}
    

