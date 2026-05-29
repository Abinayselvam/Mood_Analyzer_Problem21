import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMessage_shouldReturnSad()
            throws MoodAnalysisException {

        MoodAnalyzer mood =
                new MoodAnalyzer(
                        "I am Sad"
                );

        String result =
                mood.analyzeMood();

        assertEquals(
                result,
                "Sad"
        );
    }

    @Test
    public void givenAnyMessage_shouldReturnHappy()
            throws MoodAnalysisException {

        MoodAnalyzer mood =
                new MoodAnalyzer(
                        "I'm Happy Anyway"
                );

        String result =
                mood.analyzeMood();

        assertEquals(
                result,
                "Happy"
        );
    }

    @Test
    void givenNullMood_ShouldThrowException() {

        MoodAnalyzer mood =
                new MoodAnalyzer(null);

        MoodAnalysisException exception =
                assertThrows(

                        MoodAnalysisException.class,

                        () -> mood.analyzeMood()
                );

        assertEquals(
                MoodAnalysisException.ExceptionType.Null_Mood,
                exception.type
        );
    }

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

                exception.type,

                MoodAnalysisException
                        .ExceptionType
                        .Empty_Mood
        );
    }

    @Test
    void givenMoodAnalyserClassName_ShouldReturnObject()

            throws Exception {

        MoodAnalyzer expected =
                new MoodAnalyzer("");

        MoodAnalyzer actual =
                MoodAnalyzerFactory
                        .createMoodAnalyser();

        assertEquals(
                expected.getClass(),
                actual.getClass()
        );
    }
}