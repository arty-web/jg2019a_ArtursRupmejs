package lv.jg.lesson4.level3;

public class User {

	private String username, password;
	private int loginAttemptsLeft = 3;
	//boolean tipa mainīgais sāksies ar "has" vai "is"
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
		//šeit labāk lietot "loginAttemptsLeft--"
		loginAttemptsLeft = loginAttemptsLeft - 1;
	}

	//nosaukumu "isBlocked" vai "hasBlocked" bus labaki, jo priekšā saka ka atgriez boolean
	public boolean checkBlocked() {
		return blocked;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//šai metodei butu jaūt UserLoginService klasē
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