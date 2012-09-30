package com.taki.sample.game;

/** 
 * Card class represents single "card" entity, described by TYPE of card ,COLOR and LOCATION
 * Contains setters, getters and a constructor 
 * */
public class Card {
	
	private String type;
	private String color;
	private String location;
	
	// TODO Validation from Config file
	public Card(String type, String color/**, String location*/) {
		super();
		this.type = type;
		this.color = color;
//		this.location = location;
	}
	
	// TODO Validation from Config file
	public Card(Card card) {
		super();
		color = card.getColor();
		type = card.getType();
		location = card.getLocation();
	}

	@Override
	public String toString() {
		return "Card [type=" + type + ", color=" + color + ", location="
				+ location + "]";
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
