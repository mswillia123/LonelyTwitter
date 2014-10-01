package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;

	public void addTweet(LonelyTweetModel lonelyTweetModel)  {
		// TODO Auto-generated method stub
		//if (tweets.contains(lonelyTweetModel)) throw new IllegalArgumentException("Tweet is already on the list");
		tweets.add(lonelyTweetModel);//57:00
	
	}

	public TweetListModel() {
		super();
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return tweets.size();
	}

	public ArrayList<LonelyTweetModel> getTweets() {
		// TODO Auto-generated method stub
		return tweets;
		
	}

	public boolean hasTweet(LonelyTweetModel ltm) {
		// TODO Auto-generated method stub
		return tweets.contains(ltm);
		//return null;
	}

	public void removeTweet(LonelyTweetModel t1) {
		// TODO Auto-generated method stub
		tweets.remove(t1);
	}

}
