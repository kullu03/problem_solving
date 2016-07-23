package com.tweet.analysis;

import twitter4j.GeoLocation;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TrendingHashTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Twitter twitter = new TwitterFactory().getInstance();
		try {
			ResponseList<Location> k = twitter.getAvailableTrends();
			for (Location location : k) {
				//System.out.println(location.getCountryName());
				if(location.getCountryName().contains("India")){
					System.out.println(location.getCountryName());
				 ResponseList<Location> ab = twitter.getClosestTrends(new GeoLocation(12.9716, 77.5946));
				 System.out.println(ab);
				}
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
