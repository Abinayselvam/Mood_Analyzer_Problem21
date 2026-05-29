import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MoodAnalyzerFactory {

    // UC5 — Default Constructor

    public static MoodAnalyzer createMoodAnalyser()
            throws Exception {

        Class<?> moodClass =
                Class.forName("MoodAnalyzer");

        Constructor<?> constructor =
                moodClass.getConstructor();

        return (MoodAnalyzer)
                constructor.newInstance();
    }

    // UC6 — Parameterized Constructor

    public static MoodAnalyzer createMoodAnalyser(
            String message)

            throws Exception {

        Class<?> moodClass =
                Class.forName("MoodAnalyzer");

        Constructor<?> constructor =
                moodClass.getConstructor(
                        String.class
                );

        return (MoodAnalyzer)
                constructor.newInstance(
                        message
                );
    }

    // UC7 — Reflection Exception Handling

    public static MoodAnalyzer createMoodAnalyser(
            String className,
            String message)

            throws MoodAnalysisException {

        try {

            Class<?> moodClass =
                    Class.forName(className);

            Constructor<?> constructor =
                    moodClass.getConstructor(
                            String.class
                    );

            return (MoodAnalyzer)
                    constructor.newInstance(
                            message
                    );
        }

        catch (ClassNotFoundException e) {

            throw new MoodAnalysisException(

                    MoodAnalysisException
                            .ExceptionType
                            .NO_SUCH_CLASS,

                    "Class Not Found"
            );
        }

        catch (NoSuchMethodException e) {

            throw new MoodAnalysisException(

                    MoodAnalysisException
                            .ExceptionType
                            .NO_SUCH_METHOD,

                    "Constructor Not Found"
            );
        }

        catch (Exception e) {

            throw new MoodAnalysisException(

                    MoodAnalysisException
                            .ExceptionType
                            .OBJECT_CREATION_ISSUE,

                    "Object Creation Failed"
            );
        }
    }
    public static String invokeAnalyseMood(
            String message)

            throws Exception {

        Class<?> moodClass =
                Class.forName(
                        "MoodAnalyzer"
                );

        Constructor<?> constructor =
                moodClass.getConstructor(
                        String.class
                );

        Object object =
                constructor.newInstance(
                        message
                );

        Method method =
                moodClass.getMethod(
                        "analyzeMood"
                );

        return (String)
                method.invoke(object);
    }
}