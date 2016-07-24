
package com.tweet.analysis;

import java.util.List;

import twitter4j.Logger;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * @author Kuldeep Singh
 * 
 * 
 *
 */
public final class Test {
	private static Logger log = Logger.getLogger(Test.class);
	private static int numOfPages = 10;

	public static void main(String[] args) throws Exception {

		if (args.length != 2) {
			throw new Exception("Correct Usage..UserId1 UserId2");
		}

		Twitter twitter = new TwitterFactory().getInstance();
		int i = 0;
		int count = 0;
		for (int page = 1; page <= numOfPages; page++) {
			List<Status> allStatus = null;
			try {
				allStatus = twitter.getUserTimeline(args[0], new Paging(page, 25));
			} catch (TwitterException e) {
				log.error("Error occured while fetching the tweets of a user.. " + args[0]);
				e.printStackTrace();
			}
			if (allStatus != null) {
				for (Status status : allStatus) {
					count = count + 1;
					if (status.getText().contains(args[1])) {
						i++;
						System.out.println(status.getText());
					}

				}

			} else {
				log.error("Somthing bad happened ..check the logs for more details..");
			}

		}

		System.out.println("No. of tweets done by " + args[0] + ":" + count);
		System.out.println("No. of tweets in which he mentioned " + args[1] + ":" + i);

	}
}