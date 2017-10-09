package com.ocajexam.exercises.chapter2;

public class FishingSession {
	private String caught;
	private String session;
	private Boolean baitAvailable;
	
	public void setCatch() {
		caught = "fish";
	}
	
	public void setSession(String session) {
		this.session = session;
	}
	
	public String getSession() {
		return session;
	}
	
	public String getCastResult() {
		return caught;
	}
	
	public Boolean isBaitAvailable() {
		return baitAvailable;
	}
	
	public void setBaitAvailable(Boolean baitAvailable) {
		this.baitAvailable = baitAvailable;
	}
	
	public Fish getFishResult() {
		Fish fish = new Fish("Striped Bass");
		return fish;
	}
}
