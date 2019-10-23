package lv.jg.lesson4.level3;

public class User {

	private String username, password;
	private int loginAttemptsLeft = 3;
	private boolean blocked;

	public User(String username) {
		this.setUsername(username);
	}

	public void resetLoginAttempts() {
		loginAttemptsLeft = 3;
	}

	public void block() {
		blocked = true;
		System.out.println("***User '" + username + "' has been blocked.***");
	}

	public String getUsername() {
		return username;
	}

	public int getLoginAttemptsLeft() {
		return loginAttemptsLeft;
	}

	public void reduceLoginAttemptsLeft() {
		loginAttemptsLeft = loginAttemptsLeft - 1;
	}

	public boolean checkBlocked() {
		return blocked;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean authorisation() {
		if (username.equals("arty") && password.equals("123")
				|| username.equals("hugo") && password.equals("777"))
			return true;
		else
			return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}