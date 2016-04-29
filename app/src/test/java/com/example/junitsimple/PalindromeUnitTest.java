package com.example.junitsimple;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by evin on 4/28/16.
 */
public class PalindromeUnitTest {
    @Test
    public void palindrome_isTrue() throws Exception {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String string = "anitalavalatina";
        assertTrue(palindromeChecker.isPalindrome(string.toCharArray()));
    }

    @Test
    public void palindrome_isFalse() throws Exception {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String[] strings = new String[]{"anitalavalatinaa", "quedijiste", "ahoranoporfavor"};
        for (String string : strings) {
            assertFalse(palindromeChecker.isPalindrome(string.toCharArray()));
        }
    }

    @Test
    public void palindrome_EtienneRight() throws Exception {
        EtiennePal palindromeChecker = new EtiennePal();
        String[] strings = new String[]{"tattarrattat", "anitalavalatina", "saippuakivikauppias"};
        for (String string : strings) {
            assertTrue(palindromeChecker.palindromeCorrect(string.toCharArray()));
        }
    }

    @Test
    public void palindrome_EtienneWrong() throws Exception {
        EtiennePal palindromeChecker = new EtiennePal();
        String[] strings = new String[]{"motifs", "sequencing", "somewhat"};
        for (String string : strings) {
            assertFalse(palindromeChecker.palindromeCorrect(string.toCharArray()));
        }
    }
}
