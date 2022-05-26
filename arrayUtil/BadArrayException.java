public class BadArrayException extends Exception
{
    public BadArrayException()
    {
    }
    public BadArrayException(String message)
    {
        super(message);    //pass message to to the parent Exception(String) constructor.
    }

}