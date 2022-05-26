
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Encode {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("\nEnter a line of text to be URL encoded\n");
            String str = scan.nextLine();
            if(str.equals("exit")){
                break;
            }
            System.out.println("The string read is: " + str);
            int len = str.length();
            System.out.println("Length in chars is: " + len);
            String str2 = encodeToURL(str);
            System.out.println("The encoded string: " + str2);
            int len2 = str2.length();
            System.out.println("Length in chars is: " + len2);
        }

    }

    private static String encodeToURL(String link){
        Set<Character> allowedSymbol = new HashSet<>();
        allowedSymbol.add('_');
        allowedSymbol.add('-');
        allowedSymbol.add('*');
        allowedSymbol.add('.');
        char[] linkArray = link.toCharArray();
        StringBuilder strB = new StringBuilder();
        for(int i=0;i< linkArray.length;i++){
            if(Character.isAlphabetic(linkArray[i]) ||
                    allowedSymbol.contains(linkArray[i]) ||
                    Character.isDigit(linkArray[i])){
                strB.append(linkArray[i]);
                continue;
            }
            String value = Integer.toHexString(linkArray[i]);
            if(value.equals("20")){
                strB.append('+');
            }else{
                strB.append('%'+value);
            }
        }
        return strB.toString();
    }

}
