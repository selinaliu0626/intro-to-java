import java.util.Scanner;
public class ASSIGN1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a line of text contain the word 'java' somewhere within it:");
        String line = sc.nextLine();
        System.out.println("The string read is: " + line);
        int len = line.length();
        System.out.println("Length in chars is: " + len);
        System.out.println("All lowercase is: " + line.toLowerCase());
        System.out.println("All uppercase is: " + line.toUpperCase());
        int firstPlace = line.indexOf("java");
        System.out.println("Found 'java' at pos: " + firstPlace);
        System.out.println(line.substring(0,firstPlace) + "Java" + line.substring(firstPlace+4));
        System.out.println(line.substring(0,firstPlace) + "JAVA" + line.substring(firstPlace+4));
    }
}
