package homework3;

import java.io.*;

public class WordCounter implements FileProcessor {

    private String inputFilePath;
    static String key;




    public WordCounter(String inputFilePath, String key) {
        this.inputFilePath= inputFilePath;
        this.key= key;
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

    @Override
    public String process(String text) {
        int word= 0;

        for (int i= 0; i < text.length(); i++) {
            if(i+(key.length()-1)<text.length()) {
                if(text.charAt(i)==key.charAt(0) && text.charAt(i+(key.length()-1))==key.charAt(key.length()-1)) {
                    boolean b= true;
                    for (int j = 0; j < key.length(); j++) {

                        if(i+j<text.length()) {
                            if(key.charAt(j)!=text.charAt(j+i)) {
                                b= false;

                            }
                        }

                    }
                    if(b) {
                        word++;
                    }

                }
            }

        }
        return key +":" +word;
    }
}
