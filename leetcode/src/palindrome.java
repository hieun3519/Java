public class palindrome {
    public static boolean isPalindrome(String s) {
        String reverstr ="";

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int strLength = s.length();
        for(int i = (s.length() -1); i >=0; --i){
            reverstr = reverstr + s.charAt(i);
        }
        if(s.toLowerCase().equals(reverstr.toLowerCase())){
            return true;
        }

        System.out.print(reverstr);

        return false;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
