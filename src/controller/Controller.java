package controller;


import model.Tweet;
import model.TweetList;
import model.User;
import view.Home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Controller implements ActionListener {

    private TweetList tweets;
    private Home home;

    public Controller() {
        tweets = new TweetList();
        home = new Home();
    }

    public void init(){
        home.setTitle("Jwitter Home");
        home.setLocationRelativeTo(null);
        home.getWriteTweet().addActionListener(this);
        home.getTweetBtn().addActionListener(this);
        home.getToolTweetBtn().addActionListener(this);
        home.getUserBtn().addActionListener(this);

        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(home.getTweetBtn())){ //Clicked tweet button
            newTweetFromTxt();
        }

        if(e.getSource().equals(home.getToolTweetBtn())){ //Clciekd tweet toll button
            newTweet();
        }

        home.getTweetsTxtArea().setText(tweets.showList());
    }

    public void newTweetFromTxt(){
        Tweet newTweet = new Tweet();
        String author,text;

        text = home.getWriteTweet().getText();

        author = JOptionPane.showInputDialog(home,"Type your nickname:","Your Account's name",JOptionPane.PLAIN_MESSAGE);

        if (author.isEmpty() || text.isEmpty()){
            JOptionPane.showMessageDialog(home, "There's an error in your nickname or in your tweet", "Tweet error", JOptionPane.ERROR_MESSAGE);
        } else {
            newTweet.setText(text);
            newTweet.setAuthor(new User(author));
            tweets.getTweetList().add(newTweet);
        }
        home.getTweetsTxtArea().setText("");
    }

    public void newTweet(){
        Tweet newTweet = new Tweet();
        String author, text;

        author = JOptionPane.showInputDialog(home,"Type your nickname:","Your Account's name",JOptionPane.PLAIN_MESSAGE);
        text = JOptionPane.showInputDialog(home,"What's happening?","Tweet",JOptionPane.PLAIN_MESSAGE);

        if (author.isEmpty() || text.isEmpty()){
            JOptionPane.showMessageDialog(home, "There's an error in your nickname or in your tweet", "Tweet error", JOptionPane.ERROR_MESSAGE);
        } else {
            newTweet.setAuthor(new User(author));
            newTweet.setText(text);
            tweets.getTweetList().add(newTweet);
        }
    }

    public TweetList getTweets() {
        return tweets;
    }

    public void setTweets(TweetList tweets) {
        this.tweets = tweets;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
}
