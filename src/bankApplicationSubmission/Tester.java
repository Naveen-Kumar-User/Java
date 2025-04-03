package bankApplicationSubmission;

class Tester {

	public static void main(String[] args) {

		try {
			Applicant applicant = new Applicant();
			applicant.setName(null);
			applicant.setJobProfile("Clerk");
			applicant.setAge(25);

			/*
			 * To do
			 * 
			 * pass test data through some other source instead manually passing
			 */

			Validator validator = new Validator();

			validator.validate(applicant);
			System.out.println("Application submitted successfully!");
		} catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}