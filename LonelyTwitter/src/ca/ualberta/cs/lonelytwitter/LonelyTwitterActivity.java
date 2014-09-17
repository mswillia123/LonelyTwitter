package ca.ualberta.cs.lonelytwitter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ca.ualberta.cs.lonelytwitter.data.DataFileManager; //this import was automatically added
import ca.ualberta.cs.lonelytwitter.data.IdataManager; //this import was automatically added

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class LonelyTwitterActivity extends Activity {

	//private DataFileManager dataManager; //added - this variable was placed here, so defined
	private IdataManager dataManager;  // changed later for interface portion
	
	private EditText bodyText;
	
	private ArrayList<AbstractTweet> tweets;// SO THIS CAN USE ANY IMPLEMENTATION OF ABSTRACTTWEET EG. STARREDTWEET
	
	private ArrayAdapter<AbstractTweet> tweetsViewAdapter;
	
	private ListView oldTweetsList;

	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		bodyText = (EditText) findViewById(R.id.body);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
	}

	@Override
	protected void onStart() {
		super.onStart();
		
		dataManager = new DataFileManager(); //changed - this has been initialized here, so this does not need to be added to other methods
		
		tweets = dataManager.loadTweets(); //changed
		tweetsViewAdapter = new ArrayAdapter<AbstractTweet>(this, R.layout.list_item, tweets);
		oldTweetsList.setAdapter(tweetsViewAdapter);
	}
	
	public void save(View v) {
		
		String text = bodyText.getText().toString();
		
		if(text.contains("*")){
			StarredTweet starred = new StarredTweet(new Date(), text);
			tweets.add(starred);
		}
		else{
			Tweet tweet = new Tweet(new Date(), text);
			tweets.add(tweet);
		}
		
		
		
		tweetsViewAdapter.notifyDataSetChanged();
		
		bodyText.setText("");
		dataManager.saveTweets(tweets); //changed
	}
	
	public void clear(View v) {
		
		tweets.clear();
		tweetsViewAdapter.notifyDataSetChanged();
		dataManager.saveTweets(tweets);
	}
	
	
}