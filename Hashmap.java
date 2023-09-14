import java.util.HashMap;
import java.util.HashSet;


// store key and associate them with a value
// put() will put the element in an index based on the hash and index, if same then it calls equals()
// and compare the key - if same then overide, if not then append to the next node
// index is calculated by hash % (n-1)
// get() will get the element with the hash of the key and compared to see which one matches
// then it also compute the index and compare the index, if found output the value
// make O(n) to O(logn)
public class Hashmap{
    public static void main(String[] args){
    // hashmap
    //    HashMap<String, Integer> happy = new HashMap<String, Integer>();
    //    happy.put("a",10);
    //    happy.put("b",3);
    //    happy.put("c",88);

    //     System.out.println(happy.get("c"));
    // map
    //    Map<Integer, String> names = new HashMap<>();
    //    names.put(1, "Clementine");
    //    names.put(2, "Duran");
    //    names.put(3, "Mike");

    //    for(Map.Entry<Integer, String> entry : names.entrySet()){
    //     System.out.print(entry.getKey() + " ");
    //     System.out.println(entry.getValue());
    //    }
    //    // Iterating over only keys
    //     for (Integer key : names.keySet()) {
    //     System.out.println(key);
    //     }
    //     // Iterating over only values
    //     for (String value : names.values()) {
    //     System.out.println(value);
    //     }

    HashMap<String, String> fun = new HashMap<String, String>();
    fun.put("bobbyjoe1996", "FluffyP0nies!");
    fun.put("helloKittyFan21", "AloeVera?");
    fun.put("coolguyswag", "password123");

    // remove key
    // fun.remove("helloKittyFan21");

    // .containsValue(value: "") -> return true if found or false if not
    // .containsKey(key: "") similar with containskey
    // .size() return size of the hashmap
    // .replace() replace the old value so if print it will return old value but when reprint it will shows the updated value
    // .values() get all the values
    // .keySet() get all the key 
    System.out.println(fun.containsValue("password123"));

    int data [] = {2, 4, 5, 1, 20, 5};
    HashSet<Integer> mapSet = new HashSet<>();

}
}