package bankApplicationSubmission;

public class Validator {

	public boolean validateName(String name) {
		if (name == null || name.isBlank()) {
			// returns false if name is null and empty
			// isBlank verifies for whitespace characters as well as empty strings
			return false;
		} else
			return true;
	}

	public boolean validateJobProfile(String jobProfile) {
		if (jobProfile.toLowerCase().equals("associate") || jobProfile.toLowerCase().equals("clerk")
				|| jobProfile.toLowerCase().equals("executive") || jobProfile.toLowerCase().equals("officer")) {
			// returns true if jobProfile matches any one profile in the condition
			return true;
		} else
			return false;
	}

	public boolean validateAge(int age) {
		if (age >= 18 && age <= 30) {
			// validates and returns true if age is between 18 and 30 inclusive
			return true;
		} else
			return false;
	}

	public void validate(Applicant applicant)
			throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {

		if (!validateName(applicant.getName())) {
			throw new InvalidNameException("Invalid name");
		}
		if (!validateJobProfile(applicant.getJobProfile())) {
			throw new InvalidJobProfileException("Invalid job profile");
		}
		if (!validateAge(applicant.getAge())) {
			throw new InvalidAgeException("Invalid age");
		}
	}
}
