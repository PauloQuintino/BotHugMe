package utils;

import java.util.Date;

public class WebVisit {
	private String url;
	private WebVisit previousNode;
	private Date timestamp;
	private WebVisit NextNode;
	
	/**
	  *  Constructor for a web visit. Initialize the three instance variables.
	  *  @param u The URL of this visit
	  *  @param pn The WebVisit previous to this one
	  */
	public WebVisit(String u, WebVisit pn) {
		url = u;
		previousNode = pn;
		timestamp = new Date();
	}
	
	/**
	  * Return the previous WebVisit
	  * @return the previous WebVisit object
	  */
	public WebVisit getPreviousNode() {
		return previousNode;
	}
	
	public void setNextNode(WebVisit wv) {
		NextNode = wv;
	}
	
	public WebVisit getNextNode(){
		return NextNode;
	}
	
	/**
	  * Return a neatly formatted String to represent this object so that it can be printed out for the user
	  */
	public String toString() {
		return "Web visit: "+url+" (at "+timestamp+")";
	}
}