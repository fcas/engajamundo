package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import twitter.MyTweets;
import twitter.TwitterAdapter;

@SessionScoped
@ManagedBean(name="controllerTweets")
public class ControllerTweets {
	String lol = "lol";
	public ControllerTweets(){
		TwitterAdapter tAdapter = new TwitterAdapter();
		tweets = new ArrayList<MyTweets>();
		tweets = tAdapter.getTweetsEngajamundo();
		System.out.println("LOOOOOOOOL");
		System.out.println(tweets.get(0).getTexto());
	}
	private List<MyTweets> tweets;

	public String processarTweets(){
		TwitterAdapter tAdapter = new TwitterAdapter();
		tweets = new ArrayList<MyTweets>();
		tweets = tAdapter.getTweetsEngajamundo();
		System.out.println("LOOOOOOOOL");
		System.out.println(tweets.get(0).getTexto());
		return "correto";
	}
	
	public List<MyTweets> getTweets() {
		return tweets;
	}

	public void setTweets(List<MyTweets> tweets) {
		this.tweets = tweets;
	}  
	public void setLol(String lol){
		this.lol = lol;
	}
	public String getLol(){
		return lol;
	}
	public static void main(String args){
		
	}
}