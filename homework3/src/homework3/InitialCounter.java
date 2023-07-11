package homework3;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class InitialCounter implements FileProcessor {

    private String inputFilePath;


    public InitialCounter(String inputFilePath) {
        this.inputFilePath= inputFilePath;
    }

    public  String read() {
        String text= "";

        try {
            FileReader fileReader= new FileReader(inputFilePath);
            BufferedReader bufferedReader= new BufferedReader(fileReader);

            String line= bufferedReader.readLine();
            while(line!=null) {
                text+= line;
                line= bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public void write(String text) {
        try {
            FileWriter fileWriter= new FileWriter(inputFilePath);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * I learned the toUpperCase and toLowerCase methods from the internet(reitix.com) And I couldn't do it any other way.
     *
     */

    @Override
    public String process(String text) {
        String st = "";
        String result= "";

        char initials[]= new char[text.length()];
        String textUp= text.toUpperCase();
        initials[0]= textUp.charAt(0);
        int k=1;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)== ' ') {
                initials[k]= textUp.charAt(i+1);
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            st+= "\n" +initials[i];
        }

        for (int i = 0; i < k-1; i++) {
            int same= 0;
            for (int j = i+1; j < k ; j++) {
                if(initials[i]==initials[j]) {
                    same++;
                    initials[j]= ' ';
                }
            }
            if(initials[i]!=' ') {
                result+= "\n" +initials[i] +":" +(same+1);
            }
        }

        return result;
    }




}
