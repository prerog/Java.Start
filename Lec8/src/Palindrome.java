public class Palindrome {
    public static boolean isPalindrome(String s) {

        String palindrome = s.toLowerCase();
        int i = 0;
        int j = palindrome.length() - 1;
        while (i < j) {
            if (!Character.isLetter(palindrome.charAt(i))) {
                i++;
                continue;
            } else if (!Character.isLetter(palindrome.charAt(j))) {
                j--;
                continue;
            } else if (palindrome.charAt(i) != palindrome.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Арг   енти   на ман   ит негра";
        System.out.println(isPalindrome(s1));
    }
}
