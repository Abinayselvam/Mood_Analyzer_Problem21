import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerTest {

    // UC1 — SAD Mood

    @Test
    public void givenSadMessage_ShouldReturnSad()
            throws MoodAnalysisException {

        MoodAnalyzer mood =
                new MoodAnalyzer(
                        "I am in Sad Mood"
                );

        String result =
                mood.analyzeMood();

        assertEquals(
                "SAD",
                result
        );
    }

    // UC1 — HAPPY Mood

    @Test
    public void givenAnyMessage_ShouldReturnHappy()
            throws MoodAnalysisException {

        MoodAnalyzer mood =
                new MoodAnalyzer(
                        "I am Happy"
                );

        String result =
                mood.analyzeMood();

        assertEquals(
                "HAPPY",
                result
        );
    }

    // UC3 — NULL Mood Exception

    @Test
    public void givenNullMood_ShouldThrowException() {

        MoodAnalyzer mood =
                new MoodAnalyzer(null);

        MoodAnalysisException exception =
                assertThrows(

                        MoodAnalysisException.class,

                        () -> mood.analyzeMood()
                );

        assertEquals(

                MoodAnalysisException
                        .ExceptionType
                        .Null_Mood,

                exception.type
        );
    }

    // UC3 — EMPTY Mood Exception

    @Test
    public void givenEmptyMood_ShouldThrowException() {

        MoodAnalyzer mood =
                new MoodAnalyzer("");

        MoodAnalysisException exception =
                assertThrows(

                        MoodAnalysisException.class,

                        () -> mood.analyzeMood()
                );

        assertEquals(

                MoodAnalysisException
                        .ExceptionType
                        .Empty_Mood,

                exception.type
        );
    }

    // UC5 — Reflection Default Constructor

    @Test
    public void givenMoodAnalyzerClassName_ShouldReturnObject()

            throws Exception {

        MoodAnalyzer expected =
                new MoodAnalyzer();

        MoodAnalyzer actual =
                MoodAnalyzerFactory
                        .createMoodAnalyser();

        assertEquals(

                expected.getClass(),

                actual.getClass()
        );
    }

    // UC6 — Reflection Parameterized Constructor

    @Test
    public void givenMoodMessage_ShouldReturnMoodObject()

            throws Exception {

        MoodAnalyzer analyser =

                MoodAnalyzerFactory
                        .createMoodAnalyser(
                                "I am in Happy Mood"
                        );

        String mood =
                analyser.analyzeMood();

        assertEquals(
                "HAPPY",
                mood
        );
    }

    // UC7 — Wrong Class Name

    @Test
    public void givenWrongClassName_ShouldThrowException() {

        MoodAnalysisException exception =

                assertThrows(

                        MoodAnalysisException.class,

                        () ->

                                MoodAnalyzerFactory
                                        .createMoodAnalyser(

                                                "WrongClass",

                                                "I am Happy"
                                        )
                );

        assertEquals(

                MoodAnalysisException
                        .ExceptionType
                        .NO_SUCH_CLASS,

                exception.type
        );
    }

    // UC7 — Wrong Constructor

    @Test
    public void givenWrongConstructor_ShouldThrowException() {

        MoodAnalysisException exception =

                assertThrows(

                        MoodAnalysisException.class,

                        () ->

                                MoodAnalyzerFactory
                                        .createMoodAnalyser(

                                                "MoodAnalyzer",

                                                null
                                        )
                );

        assertEquals(

                MoodAnalysisException
                        .ExceptionType
                        .OBJECT_CREATION_ISSUE,

                exception.type
        );
    }

    // UC7 — Reflection Method Invocation

    @Test
    public void givenMessage_ShouldInvokeMethod()

            throws Exception {

        String mood =

                MoodAnalyzerFactory
                        .invokeAnalyseMood(
                                "I am in Sad Mood"
                        );

        assertEquals(
                "SAD",
                mood
        );
    }
}