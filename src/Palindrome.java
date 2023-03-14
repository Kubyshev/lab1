public class Palindrome {
    public static void main(String[] args) {

        args = new String[] { "moon", "good", "pup" };
        for (int i = 0; i < args.length; i++) {
            String s = args[i];// запись в s каждое входное значение
            System.out.println(s + ":" + Boolean.toString(isPalindrome(s)));
        }
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;

    }

    public static boolean isPalindrome(String s) {

        if (s.equals(reverseString(s))) {
            return true;
        } else {
            return false;
        }
    }
}
