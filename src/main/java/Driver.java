import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Driver {
    public static void readOneByOne(){
        String fileName = "/Users/vaisakhkrishnank/IdeaProjects/Annotations/src/input.csv";
        try{
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] data;
            data = reader.readNext();
            System.out.print(data[0]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print("\t");
            System.out.print(data[1]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print("\t");
            System.out.print(data[2]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print("\t");
            System.out.println(data[3]);
            System.out.println("--------------------------------------------");
            while((data = reader.readNext()) != null){
                System.out.print(data[0]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.print(data[1]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.print(data[2]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.println(data[3]);
                System.out.println("--------------------------------------------");
            }
        }
        catch (IOException | CsvValidationException err) {
            err.printStackTrace();
        }
    }
    public static void readAllTogether(){
        String fileName = "/Users/vaisakhkrishnank/IdeaProjects/Annotations/src/input.csv";
        try{
            CSVReader reader = new CSVReader(new FileReader(fileName));
            List<String[]> data;
            data = reader.readAll();
            for(String[] it : data){
                System.out.print(it[0]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.print(it[1]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.print(it[2]);
                System.out.print("\t");
                System.out.print("|");
                System.out.print("\t");
                System.out.println(it[3]);
                System.out.println("==============================================");

            }
        }
        catch (IOException | CsvException err) {
            err.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readOneByOne();
        readAllTogether();
    }
}
