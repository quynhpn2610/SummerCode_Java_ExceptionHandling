package iotext;

import java.io.*;

public class CopyFile {
    // read from Ton.txt
    // write to a new file, Tin.txt
    private static final String filePath = "/Users/quynhpn2610/Desktop/SummerCode/Java/JavaExcpetion/ton.txt";

    public static String readFile() throws IOException {
        File infile = new File(filePath); // tao 1 doi tuong file tu filePath
        FileReader reader = new FileReader(infile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String data = bufferedReader.readLine(); // data = Hello Ton
        bufferedReader.close();
        reader.close();
        return data;
    }

    public static void writeFile(String filePath) throws IOException {
        File outFile = new File(filePath);
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        String data = readFile();
        FileWriter fileWriter = new FileWriter(outFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        writeFile("/Users/quynhpn2610/Desktop/SummerCode/Java/JavaExcpetion/tun.txt");
    }
}
