package com.art.vague;

public class Painting extends Art{
	
	public String paintType;
	public Painting(String title, String author, String description, String paintType) {
		super(title,author,description);
		this.setPaintType(paintType);
		
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public void getAllInfo() {
		System.out.println("--------PAINTING INFO---------");
		System.out.println("Title: "+this.getTitle());
		System.out.println("Author: "+this.getAuthor());
		
		System.out.println("Desc: "+this.getDescription());
		System.out.println("Type: "+this.getPaintType());
	}
}
