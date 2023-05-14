import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        
        Arrays.sort(sA);
        Arrays.sort(tA);
        String sortedS = new String(sA);
        String sortedT = new String(tA);
        if(sortedS.equals(sortedT)){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args){
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
}
