package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;

public class StarredTweet extends AbstractTweet implements Serializable  { //added "extends AbstractTweet" during abstract portion
	
	private Date tweetDate;
	private String tweetBody;
	
	//ONLY IMPLEMENTING METHODS THAT ARE NOT GENERIC (IE ONLY USED BY STARREDTWEET


	public StarredTweet(Date tweetDate, String tweetBody) { //constructor
		super(); //what does this do?
		this.tweetDate = tweetDate;
		this.tweetBody = tweetBody;
	}


	public String getTweetBody() {
		return "\u2605 "+ tweetBody; //will star tweet 
	}

	public String toString() {
		return getTweetBody();
	}
}

/*
public class StarredTweet extends AbstractTweet{

	@Override
	public Date getTweetDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTweetDate(Date tweetDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTweetBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTweetBody(String tweetBody) {
		// TODO Auto-generated method stub
		
	} 

}
*/