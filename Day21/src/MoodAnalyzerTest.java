import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MoodAnalyzerTest {

    @Test
    void givenSadMessage_shouldReturnSad()
    {

        MoodAnalyzer mood= new MoodAnalyzer("I am Sad");
        String mood1= mood.analyzeMood();

        assertEquals("Sad",mood1);
    }

    @Test
    void givenAnyMessage_shouldReturnHappy()
    {
        MoodAnalyzer mood=new MoodAnalyzer("I'm Happy Any way");
        String mood1=mood.analyzeMood();
        assertEquals("Happy",mood1);
    }
}
