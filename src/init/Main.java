package init;

import controller.Controller;
import model.Tweet;
import model.TweetList;
import model.User;
import view.Home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.init();
    }
    
}
