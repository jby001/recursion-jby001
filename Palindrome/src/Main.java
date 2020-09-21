public class Main {

    public static void main(String[] args) {

        System.out.println(checkPalindrome("racecar"));
        System.out.println(checkPalindrome("jakeisthebesttsebehtsiekaj"));
        System.out.println(checkPalindrome("as;dklfja;lsgj"));
        System.out.println(checkPalindrome("a"));
        System.out.println(checkPalindrome(""));

    }

    public static boolean checkPalindrome(String s) {

        if (s.length() == 1 || s.length()== 0) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length()-1)) {
            return checkPalindrome(s.substring(1, s.length()-1));
        }

        return false;
    }
}
