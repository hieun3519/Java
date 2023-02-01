import java.util.HashSet;

public class containsdup {
    static boolean containsDuplicate(int [] nums) {
        // hashset is similar to hashmap but it doesn't
        // allow for duplicate value
        // slower, insertion is add(), and is implementation
        // of set interface
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
            // searches hashset for duplicate
            if(hs.contains(nums[i])){
                return true;
            }
            // if not then update hashset
            hs.add(nums[i]);
        }
        // if no dup found in loop
        return false;
    }
    public static void main(String[] args){

        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
