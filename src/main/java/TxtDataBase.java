
import java.io.*;
import java.util.ArrayList;

import com.google.gson.*;


public class TxtDataBase {
    private static final String FILENAME = "file.txt";
    private BufferedReader br;

    public TxtDataBase() {
        try {
            br = new BufferedReader(new FileReader(FILENAME));
        } catch (FileNotFoundException e) {
            createFile();
        }
    }
    public void createFile(){
        try {
            File myObj = new File(FILENAME);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void save(String data) {
        try {
            FileWriter myWriter = new FileWriter(FILENAME);
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public String read() {

        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(FILENAME));
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sb.toString();
    }


}