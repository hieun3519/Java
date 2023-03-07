public class reverseString {
    public static void reverseOuput(char[] s) {



//        char[] reverse = new char[s.length];
//        for(int i= s.length -1; i >= 0; i--){
//          reverse[s.length -1 - i] = s[i];
//        }
//        System.arraycopy(reverse, 0, s, 0, s.length);
//        System.out.println(reverse);
        int low = 0;
        int high = s.length -1;
        char t;
        while(low < high) {
            t = s[low];
            s[low] = s[high];
            s[high] = t;
            high--;
            low++;
        }
        System.out.println(s);
    }
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseOuput(s);
    }
}
