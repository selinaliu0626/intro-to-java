import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //take user input for width
      System.out.println("Please enter the maximum formatted output width. The range is 30 to 100 characters.");
        int width=sc.nextInt();
        File f1,f2;
        //keep taking user input for input file until he enters file which is valid
        do{
            System.out.println("Please enter the input file");
            String infile= sc.next();
            f1 = new File(infile);
            if(!f1.exists()) {
                System.out.println("Sorry! The file doesn't exist.");
            }
        }while(!f1.exists());
        String choice;
        //keep taking output file input until the file is valid
        do{
            System.out.println("Please enter the output file");
            String outfile = sc.next();
            f2 = new File(outfile);
            if(f2.exists()){
                System.out.println("This file already exists. Do you want to overwrite it? Yes/No");
                choice = sc.next();
                // if wants to overwrite the file
                if(choice.equalsIgnoreCase("Yes"));
                break;
            }
        }while(f2.exists());
        try{

           //read input file
            Scanner in = new Scanner(f1);
            PrintWriter pw = new PrintWriter(f2);
            //output file
            String line = "";
            do {
                // read next word
                String word = in.next();
                //if line is empty then assign word to line
                if (line.isEmpty()) {
                    line = line + word;
                } else if (!line.isEmpty() && line.length() + word.length() + 1 <= width) {
                    line = line + " " + word;
                } else {
                    pw.write(line);
                    pw.println();
                    //assign word for next iteration
                    line = word;
                }
            }while(in.hasNext());
            //if there is still something left in line then write it into file
            if(!line.isEmpty()){
                pw.write(line);
            }
            System.out.println("Written to the file successfully");
            pw.flush();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
