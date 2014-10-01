package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	public void testFiveIsFive() {
		assertEquals(5,5);
		//fail("Oh no!");
	}
	
	public void testTweetListMode() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
	}
	
	public void testAddTweet() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
		//tlm.addTweet(new LonelyTweetModel("test"));//51:45
		//assertTrue(tlm.getCount() == 1);
		LonelyTweetModel t1 = new LonelyTweetModel("test1");
		LonelyTweetModel t2 = new LonelyTweetModel("test2");
		LonelyTweetModel t3 = new LonelyTweetModel("test3");
		//Date stamp is at time of creation of object!
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		//tlm.addTweet(t3);		
		try {
			tlm.addTweet(t3); //this throws illegal argument exception
		}
		catch(Exception e){}		
	
	}
	
	public void testGetTweets() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
		LonelyTweetModel t1 = new LonelyTweetModel("test1");
		LonelyTweetModel t2 = new LonelyTweetModel("test2");
		LonelyTweetModel t3 = new LonelyTweetModel("test3");
		//Date stamp is at time of creation of object!
		//t2.setTimestamp(); //unable to determine timestamp (java.util.Date) format to insert
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		tlm.addTweet(t3);
		assertTrue(!tlm.getTweets().get(0).getTimestamp().before(tlm.getTweets().get(1).getTimestamp()) );
		assertTrue(!tlm.getTweets().get(1).getTimestamp().before(tlm.getTweets().get(2).getTimestamp()) );

	}
	
	public void testHasTweet() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
		LonelyTweetModel t1 = new LonelyTweetModel("test1");
		LonelyTweetModel t2 = new LonelyTweetModel("test2");
		tlm.addTweet(t1);
		//t2 not added to list
		assertTrue(tlm.hasTweet(t1));
		assertFalse(tlm.hasTweet(t2));
		
		
	}
	
	public void testRemoveTweet() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
		LonelyTweetModel t1 = new LonelyTweetModel("test1");
		LonelyTweetModel t2 = new LonelyTweetModel("test2");
		LonelyTweetModel t3 = new LonelyTweetModel("test3");
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		tlm.addTweet(t3);		
		tlm.removeTweet(t2);
		assertTrue(tlm.hasTweet(t1));
		assertFalse(tlm.hasTweet(t2));
	}
	
	public void testGetCount() {
		TweetListModel tlm = new TweetListModel(); //48:30 already in fail, so now write some code in project
		LonelyTweetModel t1 = new LonelyTweetModel("test1");
		LonelyTweetModel t2 = new LonelyTweetModel("test2");
		LonelyTweetModel t3 = new LonelyTweetModel("test3");
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		tlm.addTweet(t3);

		assertTrue(tlm.getCount() == 3);
		assertFalse(tlm.getCount() == 2);

		
	}

}
