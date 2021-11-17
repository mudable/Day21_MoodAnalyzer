import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;

/*Added test cases to check the haapy and sad mood*/
public class MoodAnalyzerTest {
	@Test
	public void givenMessage_SadMood_Should_Return_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	@Test
	public void givenMessage_SadMood_Should_Return_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	@Test
	public void givenMessage_AnyMood_Should_HandleException() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}