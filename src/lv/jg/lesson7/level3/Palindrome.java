package lv.jg.lesson7.level3;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1; //kas ir "i" un kas ir "j"??
        //varbūt "leftOffset" un "rightOffset"

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) //lietojam figūr iekavas {}
                return false;
            i++;
            j--;
        }
        return true;
    }

}