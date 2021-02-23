import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Scanner {

    public static void readFile(File file){

        try( BufferedReader br = new BufferedReader(new FileReader(file))){
            String[] first_line = br.readLine().split("\\s+");

            int n_of_books = Integer.parseInt(first_line[0]);
            int n_of_libraries = Integer.parseInt(first_line[1]);
            int n_of_days = Integer.parseInt(first_line[2]);

            String[] second_line = br.readLine().split("\\s+");

            // create a dictionary of book ids with their corresponding values
            HashMap<Integer, Integer> book_scores = new HashMap<>();
            int id = 0;
            for (String book_score : second_line){
                book_scores.put(id, Integer.parseInt(book_score));
                id++;
            }


            // here come the n_of_libraries segments describing each individual library
            // each segment is exactly two lines long
            for (int i = 0; i < n_of_libraries; i++){
                // read first line
                String[] segment_first_line = br.readLine().split("\\s+");

                br.readLine();
            }


        } catch (FileNotFoundException fnfe){
            System.out.println("an error occured while trying to read the input file");
            fnfe.printStackTrace();

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args){
        String FILE = "Hash Code 2020 - Online Qualification Round/a_example.txt";
        readFile(new File(FILE));
    }
}
