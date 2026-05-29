public class MoodAnalyzer {
    public String analyzeMood(String message)
    {
        message=message.toLowerCase();
        if(message.contains("sad"))
        {
            return "Sad";
        }
        return "Happy";
    }
}
