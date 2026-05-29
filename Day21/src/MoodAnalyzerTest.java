import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MoodAnalyzerTest {

    @Test
    void givenSadMessage_shouldReturnSad()
    {

        MoodAnalyzer mood= new MoodAnalyzer();
        String mood1= mood.analyzeMood("I am Sad");

        assertEquals("Sad",mood1);
    }

    @Test
    void givenAnyMessage_shouldReturnHappy()
    {
        MoodAnalyzer mood=new MoodAnalyzer();
        String mood1=mood.analyzeMood("I'm Happy Any way");
        assertEquals("Happy",mood1);
    }
}
