package iotext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            // Read file in the filePath
            File file = new File (filePath);

            // If file does not exist
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            // Read the file line by line and calculate sum
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            // Print the sum
            System.out.println("Sum: " + sum);
        }
        catch(Exception e){
            System.err.println("File not found or Content error");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample re = new ReadFileExample();
        re.readFileText(path);
    }
}
