package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exercises7File {


    public static void main(String[] args) throws IOException {
        createReadTxt();
        getTreeFiles();
    }

    public static void createReadTxt() throws IOException {
         Path path = Paths.get("text.txt");
             try(Stream<String> lineas = Files.lines(path)){
                lineas.forEach(x -> {
                    System.out.println("Linea...");
                    System.out.println(x);
                });
             }catch (IOException e) {
               e.printStackTrace();
             }
    }

    public static void getTreeFiles(){
        Path path = Paths.get("text.txt");
        try(Stream<Path> lineas = Files.walk(path)){
           lineas.forEach(x -> {
               System.out.println("Linea...");
               System.out.println(x.toAbsolutePath());
           });
        }catch (IOException e) {
          e.printStackTrace();
        }
    }


}
