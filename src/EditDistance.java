public class EditDistance {
    /*
    Method: ED - recursively computes the edit distance between two strings
    Input:
    s1, s2 - full strings to compare;
    m - length of the piece of s1 under consideration
    n - length of the piece of s2 under consideration
    NOTE:
    To avoid problems with passing strings, s1 and s2 remain the full string at all times
    m and n give the length of the substrings of s1 and s2 to consider during the current call to ED
    Example: If s1 = "bite" and m = 3, the current call to ED is really working with the substring "bit"
     */

    public static int ED(String s1, String s2, int m, int n) {

        //If either string is empty (i.e., length 0), the only option is to insert all characters of the other string
        //into the empty string; This gives 2 base cases (depending on which string is empty)
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }

        //If the two stings have the same last character, ignore that character and recursively call ED
        //on s1 and s2 with each length decreased by one
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return ED(s1, s2, m-1, n-1);
        }

        //The strings do not have the same last character
        //Consider all three possible operations (insert, delete, replace) on the last character of the first string.
        //That is, recursively call ED to insert, delete, and replace the letter; the minimum of these three operations should be used
        //Insert: Length of s1 remains the same, length of s2 is decreased by 1
        //Delete: Length of s1 is decreased by 1, length of s2 remains the same
        //Replace: Length of s1 and s2 are both decreased by 1
        int insert = ED(s1, s2, m, n-1);
        int delete = ED(s1, s2, m-1, n);
        int replace = ED(s1, s2, m-1, n-1);
        if (insert <= delete && insert <= replace) {
            return 1 + ED(s1, s2, m, n-1);
        } else if (delete <= insert && delete <= replace) {
            return 1 + ED(s1, s2, m-1, n);
        } else {
            return 1 + ED(s1, s2, m-1, n-1);
        }

    }

    public static void printEditDistance(String s1, String s2, int m, int n) {

        if (m > s1.length()) {
            System.out.println("You have entered an \"m\" length that is greater than your first string length.");
        } else if (n > s2.length()) {
            System.out.println("You have entered an \"n\" length that is greater than your second string length.");
        } else {
            System.out.println("The edit distance between \"" + s1 + "\" and \"" + s2 + "\" is " +
                    ED(s1, s2, m, n) + ".");
        }
    }

}
