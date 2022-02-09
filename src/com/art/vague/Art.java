package com.art.vague;

public abstract class Art {
	String title;
	String author;
	String description;
	
	
	void viewArt() {
		System.out.println("---------INFO FOR CURRENT ART---------");
		System.out.println("Title: "+this.getTitle());
		System.out.println("Author: "+ this.getAuthor());
		System.out.println("Description: "+this.getDescription());
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Art(String t,String a, String d) {
		this.setTitle(t);
		this.setAuthor(a);
		this.setDescription(d);
	}
}
