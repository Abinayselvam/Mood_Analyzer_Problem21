public class MoodAnalysisException extends Exception{
    public enum ExceptionType{
        Empty_Mood,
        Null_Mood
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type,String message)
    {
        this.type=type;
        super(message);
    }

}
