package homework3;

import java.io.InputStream;
import java.io.OutputStream;


public class Main {
    public static void main(String[] args) {
        //This is a sample input file for testing

        InitialCounter initialCounter= new InitialCounter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt");
        String text1= initialCounter.read();
        String initialCounterText= initialCounter.process(text1);
        //initialCounter.write(initialCounterText);
        System.out.println("\n" +initialCounterText);

        WordCounter wordCounter= new WordCounter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt", "file");
        String text2= wordCounter.read();
        String wordCounterText= wordCounter.process(text2);
        //wordCounter.write(wordCounterText);
        System.out.println("\n" +wordCounterText);

        WordFilter wordFilter= new WordFilter("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt", "for");
        String text3= wordFilter.read();
        String wordFilterText= wordFilter.process(text3);
        //wordFilter.write(wordFilterText);
        System.out.println("\n" +wordFilterText);

        Capitalizer capitalizer= new Capitalizer("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt");
        String text4= capitalizer.read();
        String capitalizerText= capitalizer.process(text4);
        //capitalizer.write(capitalizerText);
        System.out.println("\n" +capitalizerText);



        FilePipeline filePipeline= new FilePipeline("C:\\Users\\enese\\IdeaProjects\\homework3\\src\\homework3\\Sample.txt", "file", "for");
        String text= filePipeline.read();
        String filePipelineText= filePipeline.process(text);
        filePipeline.write(filePipelineText);

        }
}
