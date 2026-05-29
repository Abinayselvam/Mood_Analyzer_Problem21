public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Mood Analyzer Problem"
        );

        try {

            // SAD Mood

            MoodAnalyzer mood1 =
                    new MoodAnalyzer(
                            "I am in Sad Mood"
                    );

            System.out.println(
                    "Mood : "
                            + mood1.analyzeMood()
            );

            // HAPPY Mood

            MoodAnalyzer mood2 =
                    new MoodAnalyzer(
                            "I am in Happy Mood"
                    );

            System.out.println(
                    "Mood : "
                            + mood2.analyzeMood()
            );

            // NULL Mood

            MoodAnalyzer mood3 =
                    new MoodAnalyzer(
                            null
                    );

            System.out.println(
                    mood3.analyzeMood()
            );

        }

        catch (MoodAnalysisException e) {

            System.out.println(

                    "Exception Type : "
                            + e.type
            );

            System.out.println(
                    "Message : "
                            + e.getMessage()
            );
        }
    }
}