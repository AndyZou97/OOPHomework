import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MaximumOfEachLine {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\AndyZou\\IdeaProjects\\OOPHomework\\src\\data.txt");
        try(Scanner inputFile = new Scanner(f)){
            while(inputFile.hasNext()){
                String [] info = inputFile.nextLine().split(" ");
                String first = info[0];
                String last = info[1];
                String [] grades = info[2].split(",");
                int max = Integer.parseInt(grades[0]);
                for(int i = 0; i < grades.length; i++){
                    if (Integer.parseInt(grades[i]) > max){
                        max = Integer.parseInt(grades[i]);
                    }
                }

                System.out.println(first + " " + last + "\tMax: " + max );
            }


        }
        catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }
}
