import javax.naming.InvalidNameException;

public class UserValidationService {

	public static void main(String[] args) {

		System.out.println("User creation with input values...");
		newUser("Thad", "Castle", 22);
		newUser("Thad", "Castle", 121);
		newUser("Thad", "CastlerlyRockerr", 22);
		newUser("Th", "Castle", 22);

	}

	@SuppressWarnings("unused")
	private static void newUser(String name, String lastName, Integer age) {

		System.out.print(" - " + name + "/" + lastName + "/" + age + " ====> ");
		try {
			User user = new User(name, lastName, age);
			System.out.println("SUCCEDED");
		} catch (IllegalArgumentException ex) {
			System.out.println("FAILED (exception caught: '" + ex.getMessage() + "')");
		} catch (InvalidNameException ex) {
			ex.printStackTrace();
		}

	}

}
