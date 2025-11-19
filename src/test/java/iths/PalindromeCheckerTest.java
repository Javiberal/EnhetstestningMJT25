package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

@Test 
    void isPalindrome(){
      
         assertTrue(PalindromeChecker.isPalindrome("madam"), "\"madam\" should be a palindrome");

        
        assertFalse(PalindromeChecker.isPalindrome("hello"), "\"hello\" should not be a palindrome");

       
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"), 
                   "\"A man, a plan, a canal, Panama\" should be a palindrome");

       
        assertFalse(PalindromeChecker.isPalindrome(null), "null should return false");
    }

}

    

    

