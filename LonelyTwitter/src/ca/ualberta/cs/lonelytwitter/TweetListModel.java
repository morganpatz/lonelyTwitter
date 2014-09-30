package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;

	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel t) {
		if (!hasTweet(t)) {
			tweets.add(t);
		}
		else {
			throw new IllegalArgumentException();
		}
			
	}

	public boolean hasTweet(LonelyTweetModel t) {
		return tweets.contains(t);

	}

	public void remove(LonelyTweetModel t) {
		if (tweets.contains(t)) {
			tweets.remove(t);
		}
		
	}

	public int count() {
		if (tweets.isEmpty()) {
			return 0;
		}
		else {
			return tweets.size();
		}

	}

	public ArrayList<LonelyTweetModel> getTweets() {
		if (!tweets.isEmpty()) {
			return tweets;
		}
		else {
			return null;
		}
	}



}
