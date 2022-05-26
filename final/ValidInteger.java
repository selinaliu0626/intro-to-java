import java.util.Scanner;

public class ValidInteger {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the numbers:");
            String s = scan.next();
            if (s.equals("end"))
                break;
            boolean isInteger = isValidInt(s);
            System.out.println(isInteger);
        }while(true);
        scan.close();
        System.out.println(isValidInt(null));
    }
    public static boolean isValidInt(String x){
        try{
            Integer.parseInt(x);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
