package lv.jg.lesson4.level3;

import java.util.Scanner;
import static java.lang.System.out;

public class UserLoginService {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		User user1 = new User("arty");
		User user2 = new User("hugo");

		for (int count = 1; count <= 25; count++) {

			out.print("Username: ");
			String username = keyboard.nextLine();

			if (username.equals(user1.getUsername())) {
				if (user1.checkBlocked() == false) {
					out.print("Password: ");
					String password = keyboard.nextLine();
					login(password, user1);
				} else {
					user1.block();
				}
			} else if (username.equals(user2.getUsername())) {
				if (user2.checkBlocked() == false) {
					out.print("Password: ");
					String password = keyboard.nextLine();
					login(password, user2);
				} else {
					user2.block();
				}
			} else if (!username.equals(user1.getUsername()) && !username.equals(user2.getUsername())) {
				out.println("***Such user doesn't exist.***");
			}
			out.println();
		}
		keyboard.close();
	}

	private static void login(String password, User user) {

		if (user.checkBlocked() == true) {
			user.block();
		} else {
			user.setPassword(password);
			verify(user);
		}
	}

	private static void verify(User user) {

		if (user.authorisation() == true) {
			out.println("***You are logged in!***");
			user.resetLoginAttempts();
		} else {
			user.reduceLoginAttemptsLeft();
			out.print("***Password is incorrect. User '" + user.getUsername() + "' has ");
			out.println(user.getLoginAttemptsLeft() + " login attempts left.***");
			if (user.getLoginAttemptsLeft() == 0) {
				user.block();
			}
		}
	}
}