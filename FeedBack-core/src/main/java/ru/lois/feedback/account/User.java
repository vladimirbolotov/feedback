package ru.lois.feedback.account;

public class User {

	private User() {
		super();
	}

	public User(String logname) {
		super();
		this.logname = logname;
	}

	public String getLogname() {
		return logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}

	private String logname;

}
