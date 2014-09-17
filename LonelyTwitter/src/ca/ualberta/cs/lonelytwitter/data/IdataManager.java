package ca.ualberta.cs.lonelytwitter.data; //created this file

import java.util.ArrayList;
import java.util.List;

import ca.ualberta.cs.lonelytwitter.AbstractTweet;

public interface IdataManager {
	
	public ArrayList<AbstractTweet> loadTweets(); //coplied this from DataFileManager
	
	public void saveTweets(List<AbstractTweet> lts); //coplied this from DataFileManager

}
