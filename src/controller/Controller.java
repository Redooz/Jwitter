package controller;


import model.Tweet;
import model.TweetList;
import model.User;
import view.LikeTweet;
import view.SelectTweet;
import view.Home;
import view.TweetReplies;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private TweetList tweets;
    private Home home;
    private SelectTweet selectTweetGUI;
    private LikeTweet likeTweetGUI;
    private TweetReplies tweetRepliesGUI;

    public Controller() {
        tweets = new TweetList();
        home = new Home();
        selectTweetGUI = new SelectTweet();
        likeTweetGUI = new LikeTweet();
        tweetRepliesGUI = new TweetReplies();
    }

    public void init(){
        home.setTitle("Jwitter Home");

        home.getWriteTweet().addActionListener(this);
        home.getTweetBtn().addActionListener(this);
        home.getToolTweetBtn().addActionListener(this);
        home.getUserBtn().addActionListener(this);
        home.getEditDeleteTweetBtn().addActionListener(this);
        home.getLikeTweetBtn().addActionListener(this);
        home.getTweetRepliesBtn().addActionListener(this);

        selectTweetGUI.getEditBtn().addActionListener(this);
        selectTweetGUI.getDeleteBtn().addActionListener(this);

        likeTweetGUI.getLikeBtn().addActionListener(this);

        tweetRepliesGUI.getWatchRepliesBtn().addActionListener(this);
        tweetRepliesGUI.getReplyBtn().addActionListener(this);

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

        if (e.getSource().equals(home.getEditDeleteTweetBtn())){ //Clicked edit tweet button, show edit tweet gui
            showSelectTweetGUI();
        }

        if(e.getSource().equals(selectTweetGUI.getEditBtn())){ //User want to edit a tweet
            editTweet();
        }

        if (e.getSource().equals(selectTweetGUI.getDeleteBtn())){ //Delete a tweet
            deleteTweet();
        }

        if(e.getSource().equals(home.getLikeTweetBtn())){ //Show Like a tweet GUI
            showLikeTweetGUI();
        }

        if(e.getSource().equals(likeTweetGUI.getLikeBtn())){ //Like a tweet
            likeTweet();
        }

        if(e.getSource().equals(home.getTweetRepliesBtn())){ //Show watch replies GUI
            showTweetRepliesGUI();
        }

        if(e.getSource().equals(tweetRepliesGUI.getWatchRepliesBtn())){ //Watch replies btn
            showReplies();
        }

        if(e.getSource().equals(tweetRepliesGUI.getReplyBtn())){ //Reply a tweer btn
            replyTweet();
        }

        home.getTweetsTxtArea().setText(tweets.showList());
    }

    public void newTweetFromTxt(){
        Tweet newTweet = new Tweet();
        String author,text;

        text = home.getWriteTweet().getText();

        author = JOptionPane.showInputDialog(home,"Type your nickname:","Your Account's name",JOptionPane.PLAIN_MESSAGE);

        if (author.isEmpty() || text.isEmpty()){
            JOptionPane.showMessageDialog(home, "There's an error in your nickname or in your tweet", "Tweet error", JOptionPane.WARNING_MESSAGE);
        } else {
            newTweet.setText(text);
            newTweet.setAuthor(new User(author));
            tweets.getTweetList().add(newTweet);
        }

        home.getWriteTweet().setText("");

    }

    public void newTweet(){
        Tweet newTweet = new Tweet();
        String author, text;

        author = JOptionPane.showInputDialog(home,"Type your nickname:","Your Account's name",JOptionPane.PLAIN_MESSAGE);
        text = JOptionPane.showInputDialog(home,"What's happening?","Tweet",JOptionPane.PLAIN_MESSAGE);

        if (author.isEmpty() || text.isEmpty()){
            JOptionPane.showMessageDialog(home, "There's an error in your nickname or in your tweet", "Tweet error", JOptionPane.WARNING_MESSAGE);
        } else {
            newTweet.setAuthor(new User(author));
            newTweet.setText(text);
            tweets.getTweetList().add(newTweet);
        }
    }

    public void showSelectTweetGUI(){
        if(tweets.getTweetList().isEmpty()){
            JOptionPane.showMessageDialog(home, "There aren't tweets available", "Edit Tweet error", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> model = new DefaultListModel<>();
            /*  I have access to JList model using my own model, so i can add elements to the JList
            *   In this case i will add each tweet into the JList  */
            selectTweetGUI.getTweetsJlist().setModel(model);

            for (int i = 0; i < tweets.getTweetList().size(); i++) {
                model.addElement(tweets.getTweetList().get(i).toString());
            }

            selectTweetGUI.setLocationRelativeTo(null);
            selectTweetGUI.setVisible(true);
        }
    }

    public void editTweet(){
        String newText = "";
        int selectedTweet = 0;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (selectTweetGUI.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweet = i;
            }
        }

        newText = JOptionPane.showInputDialog(tweets.getTweetList().get(selectedTweet).toString());
        tweets.getTweetList().get(selectedTweet).setText(newText);

        showSelectTweetGUI(); //To update the list of tweets
    }

    public void deleteTweet(){
        int selectedTweet = 0;
        int returnValue = 0;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (selectTweetGUI.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweet = i;
            }
        }

        returnValue = JOptionPane.showConfirmDialog(selectTweetGUI,"Do you want to delete this tweet?","Delete Tweet",JOptionPane.YES_NO_OPTION);

        if (returnValue == JOptionPane.YES_OPTION) {
            tweets.getTweetList().remove(selectedTweet);

            if(tweets.getTweetList().isEmpty()){
                selectTweetGUI.dispose();
            } else {
                showSelectTweetGUI();
            }

        }
    }

    public void showLikeTweetGUI(){
        if(tweets.getTweetList().isEmpty()){
            JOptionPane.showMessageDialog(home, "There aren't tweets available", "Like Tweet error", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> model = new DefaultListModel<>();
            /*  I have access to JList model using my own model, so i can add elements to the JList
            *   In this case i will add each tweet into the JList  */
            likeTweetGUI.getTweetsJlist().setModel(model);

            for (int i = 0; i < tweets.getTweetList().size(); i++) {
                model.addElement(tweets.getTweetList().get(i).toString());
            }

            likeTweetGUI.setLocationRelativeTo(null);
            likeTweetGUI.setVisible(true);
        }

    }

    public void likeTweet(){
        int selectedTweet = 0;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (likeTweetGUI.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweet = i;
            }
        }

        int currentLikes = tweets.getTweetList().get(selectedTweet).getLikes();

        tweets.getTweetList().get(selectedTweet).setLikes((currentLikes+1));
        showLikeTweetGUI();
    }

    public void showTweetRepliesGUI(){
        if(tweets.getTweetList().isEmpty()){
            JOptionPane.showMessageDialog(home, "There aren't tweets available", "Show replies error", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> model = new DefaultListModel<>();
            /*  I have access to JList model using my own model, so i can add elements to the JList
             *   In this case i will add each tweet into the JList  */
            tweetRepliesGUI.getTweetsJlist().setModel(model);

            for (int i = 0; i < tweets.getTweetList().size(); i++) {
                model.addElement(tweets.getTweetList().get(i).toString());
            }

            tweetRepliesGUI.setLocationRelativeTo(null);
            tweetRepliesGUI.setVisible(true);
        }

    }

    public void showReplies(){
        int selectedTweetIndex = 0;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (tweetRepliesGUI.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweetIndex = i;
            }
        }

        Tweet selectedTweet = tweets.getTweetList().get(selectedTweetIndex);

        JOptionPane.showMessageDialog(tweetRepliesGUI,selectedTweet.getReplies().showList(),"Replies",JOptionPane.PLAIN_MESSAGE);
    }

    public void replyTweet(){
        int selectedTweetIndex = 0;
        String author, text;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (tweetRepliesGUI.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweetIndex = i;
            }
        }

        Tweet selectedTweet = tweets.getTweetList().get(selectedTweetIndex);

        author = JOptionPane.showInputDialog(home,"Type your nickname:","Your Account's name",JOptionPane.PLAIN_MESSAGE);
        text = JOptionPane.showInputDialog(home,"What's happening?","Tweet",JOptionPane.PLAIN_MESSAGE);

        if (author.isEmpty() || text.isEmpty()){
            JOptionPane.showMessageDialog(home, "There's an error in your nickname or in your tweet reply", "Reply error", JOptionPane.WARNING_MESSAGE);
        } else {
            Tweet reply = new Tweet();

            reply.setAuthor(new User(author));
            reply .setText(text);

            selectedTweet.getReplies().getTweetList().add(reply);

            showTweetRepliesGUI();
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

    public SelectTweet getSelectTweetGUI() {
        return selectTweetGUI;
    }

    public void setSelectTweetGUI(SelectTweet selectTweetGUI) {
        this.selectTweetGUI = selectTweetGUI;
    }

    public LikeTweet getLikeTweetGUI() {
        return likeTweetGUI;
    }

    public void setLikeTweetGUI(LikeTweet likeTweetGUI) {
        this.likeTweetGUI = likeTweetGUI;
    }
}
