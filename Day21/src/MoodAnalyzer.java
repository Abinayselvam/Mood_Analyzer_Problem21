public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {

        this.message = message;
    }

    public String analyzeMood()
            throws MoodAnalysisException {

        try {

            if(message.length()==0) {

                throw new MoodAnalysisException(

                        MoodAnalysisException
                                .ExceptionType
                                .Empty_Mood,

                        "Mood Empty"
                );
            }

            if(message.contains("Sad")) {

                return "Sad";
            }

            return "Happy";
        }

        catch(NullPointerException e) {

            throw new MoodAnalysisException(

                    MoodAnalysisException
                            .ExceptionType
                            .Null_Mood,

                    "Mood Null"
            );
        }
    }
}