package controller;


import model.Tweet;
import model.TweetList;
import model.User;
import view.EditTweet;
import view.Home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private TweetList tweets;
    private Home home;
    private EditTweet editTweet;

    public Controller() {
        tweets = new TweetList();
        home = new Home();
        editTweet = new EditTweet();
    }

    public void init(){
        home.setTitle("Jwitter Home");

        home.getWriteTweet().addActionListener(this);
        home.getTweetBtn().addActionListener(this);
        home.getToolTweetBtn().addActionListener(this);
        home.getUserBtn().addActionListener(this);
        home.getEditTweetBtn().addActionListener(this);

        editTweet.getEditBtn().addActionListener(this);

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

        if (e.getSource().equals(home.getEditTweetBtn())){ //Clicked edit tweet button, show edit tweet gui
            showEditTweetGUI();
        }

        if(e.getSource().equals(editTweet.getEditBtn())){ //User want to edit a tweet
            editTweet();
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

    void showEditTweetGUI(){
        if(tweets.getTweetList().isEmpty()){
            JOptionPane.showMessageDialog(home, "There aren't tweets available", "Edit Tweet error", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> model = new DefaultListModel<>();
            /*  I have access to JList model using my own model, so i can add elements to the JList
            *   In this case i will add each tweet into the JList  */
            editTweet.getTweetsJlist().setModel(model);

            for (int i = 0; i < tweets.getTweetList().size(); i++) {
                model.addElement(tweets.getTweetList().get(i).toString());
            }

            editTweet.setLocationRelativeTo(null);
            editTweet.setVisible(true);
        }
    }

    void editTweet(){
        String newText = "";
        int selectedTweet = 0;

        for (int i = 0; i < tweets.getTweetList().size(); i++) {
            //Finding the selected tweet into the tweet list
            if (editTweet.getTweetsJlist().getSelectedValue().equals(tweets.getTweetList().get(i).toString())){
                selectedTweet = i;
            }
        }

        newText = JOptionPane.showInputDialog(tweets.getTweetList().get(selectedTweet).toString());
        tweets.getTweetList().get(selectedTweet).setText(newText);

        showEditTweetGUI(); //To update the list of tweets
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

    public EditTweet getEditTweet() {
        return editTweet;
    }

    public void setEditTweet(EditTweet editTweet) {
        this.editTweet = editTweet;
    }
}
