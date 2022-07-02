package model;

import java.util.ArrayList;

public class TweetList {
    private ArrayList<Tweet> tweetList;

    public TweetList() {
        tweetList = new ArrayList<>();
    }

    public TweetList(ArrayList<Tweet> tweetList) {
        this.tweetList = tweetList;
    }

    public String showList(){
        StringBuilder info = new StringBuilder();
        for (Tweet tweet : tweetList) {
            info.append(tweet.toString()).append("\n");
        }
        return info.toString();
    }

    public ArrayList<Tweet> getTweetList() {
        return tweetList;
    }

    public void setTweetList(ArrayList<Tweet> tweetList) {
        this.tweetList = tweetList;
    }

    @Override
    public String toString() {
        return "TweetList{" +
                "tweetList=" + tweetList +
                '}';
    }
}
