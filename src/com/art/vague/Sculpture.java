package com.art.vague;

public class Sculpture extends Art{
	
	public String material;
	public Sculpture(String title, String author, String description, String material) {
		super(title,author,description);
		this.setMaterial(material);
		
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void getAllInfo() {
		System.out.println("--------Sculpture INFO---------");
		System.out.println("Title: "+this.getTitle());
		System.out.println("Author: "+this.getAuthor());
		
		System.out.println("Desc: "+this.getDescription());
		System.out.println("Type: "+this.getMaterial());
	}
	
}