public class MoodAnalysisException extends Exception{
    public enum ExceptionType{
        Empty_Mood,
        Null_Mood,
        NO_SUCH_CLASS,
        NO_SUCH_METHOD,
        OBJECT_CREATION_ISSUE
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type,String message)
    {
        this.type=type;
        super(message);
    }

}
