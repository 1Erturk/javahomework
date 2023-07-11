package homework3;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class FilePipeline implements FileProcessor {

    private String inputFilePath;
    private String wordCounterKey;
    private String wordFilterKey;


    public FilePipeline(String inputFilePath, String wordCounterKey, String wordFilterKey) {
        this.inputFilePath = inputFilePath;
        this.wordCounterKey= wordCounterKey;
        this.wordFilterKey= wordFilterKey;
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
        String st= "";
        ArrayList<FileProcessor> processors= new ArrayList<>();

        InitialCounter initialCounter= new InitialCounter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt");
        WordCounter wordCounter= new WordCounter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt", wordCounterKey);
        WordFilter wordFilter= new WordFilter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt", wordFilterKey);
        Capitalizer capitalizer= new Capitalizer("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt");

        processors.add(0, initialCounter);
        processors.add(1, wordCounter);
        processors.add(2, wordFilter);
        processors.add(3, capitalizer);
        for (int i = 0; i < processors.size(); i++) {
            if(i==0) {
                FileProcessor fp= processors.get(i);
                st+= fp.process(text);
            } else {
                FileProcessor fp= processors.get(i);
                st+= "\n\n" +fp.process(text);
            }
        }

        return st;

    }

}
