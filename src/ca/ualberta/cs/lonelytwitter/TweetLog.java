package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TweetLog extends LonelyTwitterActivity {

	private int tweetCount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweet_log);
		
		Button resetButton = (Button) findViewById(R.id.reset);
		final TextView tweetCounter = (TextView) findViewById(R.id.count);

		resetButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				tweetCount = tweets.size();
				
				tweetCounter.setText(tweetCount + " tweets");
				


			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tweet_log, menu);
		return true;
	}

}
