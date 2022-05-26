import java.util.Scanner;

public class ArraySort {
    public static void main(String args[]) {
        Scanner nums = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter the size of the array(3 to 10):");
            n = nums.nextInt();
            if(n<3 || n>10){
                System.out.println("Out of ranged. Please retry.");
                continue;
            }else{
                break;
            }
        }
        int[] list = new int[n];
        fillArray(list);
        System.out.println("The unsorted values: ");
        printArray(list);
        sortArray(list);
        System.out.println("The sorted values: ");
        printArray(list);

    }

    public static void fillArray(int[] array) {
        System.out.println("Enter " + array.length + " values");
        Scanner nums = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value for element " + i + ":");
            array[i] = nums.nextInt();
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortArray(int[] array) {
        boolean swapped;
        do{
            swapped = false;
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
    }
}
