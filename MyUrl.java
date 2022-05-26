import java.util.HashSet;
import java.util.Set;

/**
 * A url creation class.
 */
public class MyUrl {
    /** Store the url. */
    private String url;

    /** Count for arguments. */
    private int argusNum = 0;

    /** Prefix for url. */
    private static final String PREFIX = "http://";

    /**
     * Constructor.
     * @param url target url.
     */
    public MyUrl(String url){
        this.url = PREFIX+url;
    }

    /**
     * Add arguments into url with valid format.
     * @param name argument name.
     * @param value argument string value.
     */
    public void addArgument(String name, String value){
        appendSymbol();
        this.url += urlEncode(name)+'='+urlEncode(value);
        argusNum++;
    }

    /**
     * Add arguments into url with valid format.
     * @param name argument name.
     * @param ivalue argument int value.
     */
    public void addArgument(String name, int ivalue){
        appendSymbol();
        // For int, not necessary to encode it cause it always permit.
        this.url += urlEncode(name)+'='+ ivalue;
        argusNum++;
    }

    /**
     * Add arguments into url with valid format.
     * @param name argument name.
     * @param dvalue argument double value.
     */
    public void addArgument(String name, double dvalue){
        appendSymbol();
        // For double, not necessary to encode it cause it always permit.
        this.url += urlEncode(name)+'='+ dvalue;
        argusNum++;
    }

    /**
     * For display.
     * @return url.
     */
    public String toString(){
    return this.url;
    }

    /**
     * Append a ? or & to url. if first argument, append ?, otherwise &.
     */
    private void appendSymbol(){
        if(argusNum == 0){
            this.url+="?";
        }else{
            this.url+="&";
        }
    }

    /**
     * Encode string into URL Format.
     * @param link string need to encode.
     * @return encoded string.
     */
    private static String urlEncode(String link) {
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