package tutorials;
import java.io.*;

public class parseString {

    public static void main(String[] args) {
        // CSV = commma-separated Values
        // text file that uses a comma to separate values

        // if it not in source include C//
        String file = "example.csv";
        BufferedReader reader =null;
        String line ="";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                
                String[] row = line.split(",");

                for(String index: row){
                    // 10 spaces to the left
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}