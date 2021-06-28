package com.skilldistillery.filmquery.entities;

public class Actor {
	private int actorId;
	private String actorFname;
	private String actorLname;

	public Actor(int actorId, String actorFname, String actorLname) {
		super();
		this.actorId = actorId;
		this.actorFname = actorFname;
		this.actorLname = actorLname;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorFname() {
		return actorFname;
	}

	public void setActorFname(String actorFname) {
		this.actorFname = actorFname;
	}

	public String getActorLname() {
		return actorLname;
	}

	public void setActorLname(String actorLname) {
		this.actorLname = actorLname;
	}

	@Override
	public String toString() {
		return actorFname + " " + actorLname + "\r";
	}

}
