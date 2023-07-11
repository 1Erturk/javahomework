package homework3;

import java.io.*;
import java.util.ArrayList;

public class Capitalizer implements FileProcessor {

    private String inputFilePath;



    public Capitalizer(String inputFilePath) {
        this.inputFilePath = inputFilePath;
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
        int a= 'a';
        int A= 'A';
        int z= 'z';
        int Z= 'Z';
        String st= "";

        for (int i = 0; i < text.length(); i++) {
            if(i==0) {
                String textUp= text.toUpperCase();
                st+= textUp.charAt(0);
            }
        }

        for (int i = 0; i < text.length()-1 ; i++) {
            if(text.charAt(i)== ' ') {
                String textUp= text.toUpperCase();
                st+= " " +textUp.charAt(i+1);
            } else {
                if(a<=text.charAt(i+1) && z>=text.charAt(i+1)) {
                    String textDown= text.toLowerCase();
                    st+= textDown.charAt(i+1);
                } else if(A<=text.charAt(i+1) && Z>=text.charAt(i+1)) {
                    String textUp= text.toUpperCase();
                    st+= textUp.charAt(i+1);
                }
            }
        }
        return st;
    }



}
