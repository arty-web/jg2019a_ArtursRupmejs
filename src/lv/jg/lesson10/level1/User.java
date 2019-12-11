import javax.naming.InvalidNameException;

public class User {

	private String name;
	private String lastName;
	private Integer age;

	public User(String name, String lastName, Integer age) throws InvalidNameException {
		if (!isValidName(name)) {
			throw new InvalidNameException("Name should be between 3 and 15 characters.");
		}
		this.name = name;

		if (!isValidLastName(lastName)) {
			throw new IllegalArgumentException("Last name should be between 3 and 15 characters.");
		}
		this.lastName = lastName;

		if (!isValidAge(age)) {
			throw new IllegalArgumentException("Age should be between 0 and 120 digits.");
		}
		this.age = age;
	}

	private boolean isValidName(String name) {
		return name.length() >= 3 && name.length() <= 15;
	}

	private boolean isValidLastName(String lastName) {
		return lastName.length() >= 3 && lastName.length() <= 15;
	}

	private boolean isValidAge(int age) {
		return age >= 0 && age <= 120;
	}
	
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

}
