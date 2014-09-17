package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class AbstractTweet { // added abstract 
	
	public Date tweetDate; //added
	public String tweetBody; //added
	
	public abstract String getTweetBody();
	
	public abstract String toString();
	
	//these 4 prototypes taken from tweet.java and pasted here with "abstract" added
	//public abstract Date getTweetDate();// added abstract 
	
	//REMOVE ALL ABSTRACT
	
	public Date getTweetDate() {
		return tweetDate;
	}
	
	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}
	
	

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	
	public int getLength() { //new method added
		return tweetBody.length();
		
	}
	
}
