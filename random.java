import java.io.*;
import java.util.*;

public class random {
    public static void main(String[] args){
        String line;
        Scanner input = new Scanner(System.in);
        
        int sum =0;
        try{
        File inputfile = new File("number.txt"); 
        BufferedReader reader = new BufferedReader(new FileReader(inputfile));
        while((line = reader.readLine()) != null){
            sum += Integer.parseInt(line);
        }
        reader.close();
        System.out.println(sum);
        } catch (IOException e){
            System.out.println("Error reading from a file");

        }
    //     int[] nums = {0,1,2,3}; 
    //     int target =4;
    //     HashMap<Integer, Integer> findTarget = new HashMap<Integer, Integer>();
         
    //     int diff =0;
        
    //     for(int i=0; i< nums.length;i++){
    //     diff = target - nums[i];
    //     if (findTarget.containsKey(diff)){
    //         return new int [] {findTarget.get(diff),i};
    //     }
    //       findTarget.put(nums[i],i);
    // }
}
}

