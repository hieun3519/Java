import java.util.*;


public class Hashtut {
    // Entry<K, V>
    // store unique key to value 
    // Key and value
    // take each key and insert into a formula = hashing
    // hash / 10 = answer and remainder
    // the remainder is the value where the data is stored at
    // a collision turn each bucket into a linked list, add the address to the next
    // entry 
    // 
    // bucket - an indexed storage location for one or more entries
    //
    // advantage
    // great with large data set
    // fast insertion, lookup, deletion of key/value pairs
    //
    // run time complexity: best case O(1), worse case O(n)
    //

    public static void main(String[] args){
        Hashtable<String, String> table = new Hashtable<>();
        
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        // table.remove(777);

        // if integer % 10 with the key.hashcode()
        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }
        
    }
}
