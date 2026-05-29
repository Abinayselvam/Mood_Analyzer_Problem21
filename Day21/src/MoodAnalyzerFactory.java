import java.lang.reflect.Constructor;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer createMoodAnalyser()

            throws Exception {

        Class<?> moodClass =
                Class.forName(
                        "MoodAnalyser"
                );

        Constructor<?> constructor =
                moodClass.getConstructor();

        return (MoodAnalyzer)
                constructor.newInstance();
    }
}