import java.lang.reflect.Constructor;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer createMoodAnalyser()
            throws Exception {

        Class<?> moodClass =
                Class.forName("MoodAnalyser");

        Constructor<?> constructor =
                moodClass.getConstructor();

        return (MoodAnalyzer)
                constructor.newInstance();
    }

    public static MoodAnalyzer
    createMoodAnalyser(String message)

            throws Exception {

        Class<?> moodClass =
                Class.forName(
                        "MoodAnalyser"
                );

        Constructor<?> constructor =
                moodClass.getConstructor(
                        String.class
                );

        return (MoodAnalyzer)
                constructor.newInstance(
                        message
                );
    }
}