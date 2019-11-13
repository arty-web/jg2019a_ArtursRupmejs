package lv.jg.lesson7.level3;

public class PalindromeTest {

    public static void main(String args[]) {

        verifyPalindrome("racecar");
        verifyPalindrome("hummus");
        verifyPalindrome("alussula");
        verifyPalindrome("window");
        verifyPalindrome("level");

    }

    private static void verifyPalindrome(String string) {

        System.out.print("Is '" + string + "' a palindrome? ");
        if (Palindrome.isPalindrome(string)) {
            System.out.printf("\t%s\n", "Yes");
        } else {
            System.out.printf("\t%s\n", "No");
        }

    }

}