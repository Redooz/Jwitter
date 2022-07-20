package model;

import java.util.Calendar;

/**
 * A Tweet is a message that has an author and a text
 */
public class Tweet {
    private User author;
    private String text;
    private int likes;

    public Tweet(User author, String text, int likes) {
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    public Tweet() {
        author = new User();
        text = "";
        likes = 0;
    }

    public String getTweetDate(){
        Calendar date = Calendar.getInstance();
        int day,month,year,hour,minute;

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get((Calendar.MONTH));
        year = date.get(Calendar.YEAR);
        hour = date.get(Calendar.HOUR_OF_DAY);
        minute = date.get(Calendar.MINUTE);

        return day+"/"+(month+1)+"/"+year+" "+hour+":"+minute;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return  author + "\t" +  getTweetDate()  + "\n"+ text + "\t❤: " + likes;
    }
}

