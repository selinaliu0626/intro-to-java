import java.util.Scanner;

public class MaxFound {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter three numbers, split them with blank: ");
            String x = scan.nextLine();
            if (x.equals("end"))
                break;
            String[] inputs = x.split(" ");
            int n = max(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]),
                    Integer.parseInt(inputs[2]));
            System.out.println(n);
        }while(true);
    }
    public static int max(int val1, int val2, int val3){
        int max;
        if (val1 >= val2){
            max = val1;
        }else {
            max = val2;
        }
        if (max >= val3){
            return max;
        }else{
            return val3;
        }

    }
}
