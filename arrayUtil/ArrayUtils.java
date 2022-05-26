import static java.util.Arrays.copyOfRange;

public class ArrayUtils {
    public static int minValue(int[] list) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is null");

        else if (list.length == 0)
            throw new BadArrayException("Array is empty");
        else {
            int min = list[0];
            for (int i = 0; i < list.length; i++)
                if (min > list[i])
                    min = list[i];
                    return min;
                }
    }

    public static int[] copyRange(int[] list, int startIndex) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is null");

        else if (startIndex < 0 || startIndex > list.length)
            throw new ArrayIndexOutOfBoundsException();
        else{
        int newList[] = (copyOfRange(list, startIndex, list.length));
        return newList;
        }
    }

    public static int indexOf(int[] list, int searchValue) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is null");

        else if (list.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < list.length; i++)
                if (list[i] == searchValue)
                    return i;
            return -1;
        }
    }

    public static int lastIndexOf(int[] list, int searchValue) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is null");

        else if (list.length == 0)
            return -1;

        else {for (int i = list.length-1; i > 0; i--)
            if (list[i] == searchValue)
                return i;
            return -1;
            }
        }

}

