public class MoodAnalyzer {

    String message;
    //Default Constructor
    public MoodAnalyzer()
    {

    }
    //Parameterized Constructor
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public String analyzeMood()
    {

        message=message.toLowerCase();
        if(message.contains("sad"))
        {
            return "Sad";
        }
        return "Happy";
    }
}
