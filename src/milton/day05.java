package milton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class day05 {
    public static void main(String[] args) {
        
        String args0 = args[0];
        System.out.printf("Processing %s\n", args0);

        // Open the file, read the first 100 lines print out each line
        // CLose the file when done
        // If the file less than 100 lines, close when done

        File file = new File("C:\\Users\\tanna\\src\\tfip\\day05\\src\\milton\\paradise_lost.txt");

        try {
            String line;
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);
            
            // while (true) {
            //     line = bfr.readLine();
            //     if (line == null) {
            //         break;
            //     } else {
            //         System.out.println(line);
            //     }
            // }

            int totalWords = 0;
            int uniqueWords = 0;

            for (int i = 1; i <= 100; i++) {
                line = bfr.readLine();
                if (null == line)
                break;

                // System.out.printf("%d: %s\n", i, line.toUpperCase());
                String[] words = line.trim().split(" ");
                
                if (words[i + 1].equals(words[i])) {
                    System.out.println(words[i]);
                    uniqueWords++;
                }

                totalWords += words.length;
            }

            bfr.close();

            System.out.println(totalWords);
            System.out.println(uniqueWords);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }


    }
}