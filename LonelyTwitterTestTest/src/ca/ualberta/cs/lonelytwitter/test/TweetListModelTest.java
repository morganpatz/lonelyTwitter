package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	/**
	// Will fail every time
	public void testFail() {
		fail("We should have never played god!");
	}
	**/
	
	// Will pass every time
	public void testFiveIsFive() {
		//checks if the two are equal
		assertEquals(5,5);
	}
	
	public void testTweetListModel() {
		TweetListModel tlm = new TweetListModel();
	}
	
	public void testAdd() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(t));
		
	}
	
	public void testGet() {
		ArrayList<LonelyTweetModel> tweetList = new ArrayList<LonelyTweetModel>();
		TweetListModel tlm = new TweetListModel();
		int i;
		LonelyTweetModel t;
		
		for (i = 0; i < 10; i++) {
			t = new LonelyTweetModel("Hello" + i);
			tweetList.add(t);
			tlm.add(t);
			
		}
		
		assertEquals(tweetList, tlm.getTweets());
		
		TweetListModel tlm2 = new TweetListModel();
		
		assertEquals(null, tlm2.getTweets());
		
		
		
	
	}
	

	public void testHas() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel u = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(u));
		
	}
	
	public void testRemove() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(t));
		tlm.remove(t);
		assertTrue(!tlm.hasTweet(t));
		
	}
	
	public void testCount() {
		int i;
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel t;
		
		for (i = 0; i < 10; i++) {
			t = new LonelyTweetModel("Hello" + i);
			tlm.add(t);
		}
		
		assertEquals(tlm.count(), i);
		
		TweetListModel tlm2 = new TweetListModel();
		
		assertEquals(tlm2.count(), 0);
	}
	
	
}
