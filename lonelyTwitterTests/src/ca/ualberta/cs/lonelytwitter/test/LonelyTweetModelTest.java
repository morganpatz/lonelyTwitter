package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.R;

public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	
	public void testEquals() {
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("test", date);
		NormalTweetModel otherNormal = new NormalTweetModel("different text", date);
		
		assertFalse("different tweets are not equal",
				normal.equals(otherNormal));
	}
	
	public void testMakeTweet() {
		String tweet = "This is my tweet";
		makeTweet(tweet);
	}
	
		
}
